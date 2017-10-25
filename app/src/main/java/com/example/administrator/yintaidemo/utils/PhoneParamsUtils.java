package com.example.administrator.yintaidemo.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.WindowManager;

import com.example.administrator.yintaidemo.http.BaseParams;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static android.text.TextUtils.isEmpty;

/**
 * Created by Mr Chen on 2017/10/17.
 * <p>
 * <p>
 * getPhoneWidth();             获取手机屏幕宽度
 * <p>
 * getPhoneHeigth();           获取手机屏幕高度
 * <p>
 * getPhoneOsversion();         获取设备系统版本
 * <p>
 * getPhoneDeviceName();        获取设备型号
 * <p>
 * getPhoneCarrier();           获取设备运营商
 * <p>
 * getPhoneIMEI()               获取设备IMEI
 * <p>
 * getPhoneMacId                获取设备MACID
 */

public class PhoneParamsUtils {

    /**
     * 获取手机屏幕宽度
     *
     * @param context
     * @return
     */
    public static int getPhoneWidth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }

    /**
     * 获取手机屏幕高度
     *
     * @param context
     * @return
     */
    public static int getPhoneHeigth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);

        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }

    /**
     * 获取设备系统版本
     */
    public static String getPhoneOsversion() {
        return android.os.Build.VERSION.RELEASE;
    }

    /**
     * 获取设备型号
     *
     * @return
     */

    public static String getPhoneDeviceName() {
        return android.os.Build.MODEL;
    }

    /**
     * 获取设备运营商
     *
     * @return
     */

    public static String getPhoneCarrier(Context context) {
        TelephonyManager telManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        String operator = telManager.getSimOperator();

        if (operator != null) {

            if (operator.equals("46000") || operator.equals("46002") || operator.equals("46007")) {

                //中国移动
                return "中国移动";

            } else if (operator.equals("46001")) {

                //中国联通
                return "中国联通";

            } else if (operator.equals("46003")) {

                //中国电信
                return "中国电信";
            }
        }
        return null;
    }

    /**
     * 获取设备id
     *
     * @param context
     * @return
     */
    public static String getPhoneIMEI(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId();
    }

    /**
     * 获取设备运营商MACid
     *
     * @param context
     * @return
     */
    public static String getPhoneMacId(Context context) {
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = wifi.getConnectionInfo();
        return info.getMacAddress();
    }

    /**
     * 对业务参数进行签名
     *
     * @param
     * @param args
     * @return
     */
    public static HashMap<String, String> signBusinessParameter(
            Context context, HashMap<String, String> args) {

        try {
            HashMap<String, String> signMap = (HashMap<String, String>) args.clone();

            HashMap<String, String> defaultDataMap = (HashMap<String, String>) getDefaultMap(context);
            Iterator<String> defaultkeyit = defaultDataMap.keySet().iterator();
            List delList = new ArrayList();
            while (defaultkeyit.hasNext()) {
                String defaultkey = (String) defaultkeyit.next();

                //如果是公共参数
                if (signMap.containsKey(defaultkey)) {
                    //defaultkeyit.remove();
                    //signMap.remove(defaultkey);
                    delList.add(defaultkey);
                }
            }
            if (delList.size() > 0) {
                signMap.keySet().removeAll(delList);
            }

            String sign = getSign(signMap, args, context);
            args.put("sign", sign);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return args;
    }

    //获取默认网络请求参数
    public static Map<String, String> getDefaultMap(Context con) {
        HashMap<String, String> parameter = new HashMap<String, String>();
        BaseParams.getParams(parameter, con);
        return parameter;
    }

    public static String getSign(Map<String, String> paramOther, Map<String, String> parameter, Context context) {
        SharedPreferences mSharedPreferences = context.getSharedPreferences("publicfile", context.MODE_PRIVATE);
        String appkey = mSharedPreferences.getString("appkey", "");
        String secretkey = mSharedPreferences.getString("secretkey", "");
        Log.e("TAG", appkey + "----" + secretkey);
        TreeMap<String, String> params = new TreeMap<String, String>();
        params.put("APPKEY", appkey);
        params.put("SECRETKEY", secretkey);
        params.put("TIMEREQ", parameter.get("timereq"));
        if (paramOther != null && paramOther.keySet() != null) {
            Iterator<String> iterator = paramOther.keySet().iterator();
            String paramKey = null;
            String paramValue = null;
            while (iterator.hasNext()) {
                paramKey = iterator.next().trim();
                if (paramOther.get(paramKey) != null) {
                    paramValue = paramOther.get(paramKey).trim();
                    paramKey = paramKey.toUpperCase();
                    params.put(paramKey, paramValue);
                }
            }
        }

        Log.e("TAG", ""+params);
        String strSign = md5Signature(params);

        return strSign;
    }
    /**
     * 新的md5签名，首尾放secret。
     *
     * @param
     */
    public static String md5Signature(TreeMap<String, String> params) {

        String result = null;

        //String orgin1 = "APPKEY=1090200&CONTACT=13353666666&CONTENT=%e5%8c%97%e6%b5%b7&METHOD=products.SaveFeedback&SECRECTKEY=67679E60-73AC-4EE8-A6C4-13F04A70DD3D&TIMEREQ=20130626125801";
        String orgin1 = getSignString(params);
        //          orgin1 = ":/?#[]@!$ &'()*+,;=<>%{}|\\^~";
//        //为了防止特殊字符情况，将需要加密的串用url方式转意一下
//        String newValue = StringUtil.urlEncode(orgin1);
//        if(!StringUtil.isEmpty(newValue)){
//            orgin1 = newValue ;
//        }
        Log.e("Signature", "S1:" + orgin1);
        if (orgin1 == null) {
            return result;
        }
        String orgin2 = new StringBuffer(orgin1).reverse().toString();

        //对位字符异或
        char[] str1 = orgin1.toCharArray();
        char[] str2 = orgin2.toCharArray();
        String finalOrgin = "";
        for (int i = 0; i < str1.length; i++) {
            int str = (int) (str1[i] ^ str2[i]);
            finalOrgin += str;
        }
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            result = byte2hex(md.digest(finalOrgin.toString().getBytes("utf-8")));

        } catch (Exception e) {

            throw new java.lang.RuntimeException("sign error !");

        }

        return result;

    }
    /**
     * @param params
     * @return
     */
    private static String getSignString(TreeMap<String, String> params) {
        if (params == null) {
            return null;
        }
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = params.keySet().iterator();

        while (iter.hasNext()) {
            String name = (String) iter.next();
            try {
                if (params.get(name) == null || "".equals(params.get(name).trim())) {
                    continue;
                }
                //value数据转码
                String value = removeSpecifyString(params.get(name));
                buffer.append(name + "=" + MyURLEncoder.encode(value, "utf-8") + "&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        if (buffer.length() != 0) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        //统一转成大写
        String signString = buffer.toString().toUpperCase();
        return signString;
    }
    /**
     * 将原字符串中的非(中文，数字，字母)去掉
     * @param orginal
     * @return
     */
    public static String removeSpecifyString(String orginal){
        String newString = f(orginal) ;
        if (!isEmpty(orginal)) {
            Pattern p = Pattern.compile("[^\u4e00-\u9fa5 a-z A-Z 0-9]");
            Matcher matcher = p.matcher(orginal);
            newString = matcher.replaceAll("");
        }
        return newString ;
    }
    /**
     * 二进制转字符串
     */
    private static String byte2hex(byte[] b) {

        StringBuffer hs = new StringBuffer();

        String stmp = "";

        for (int n = 0; n < b.length; n++) {

            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));

            if (stmp.length() == 1) {
                hs.append("0").append(stmp);
            } else {
                hs.append(stmp);
            }

        }

        return hs.toString().toLowerCase();

    }
    public static String f(String str){
        if( isEmpty(str)){
            return "" ;
        }
        return str.trim();
    }

}
