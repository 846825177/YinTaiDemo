package com.example.administrator.yintaidemo.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public class StartBean implements Parcelable {

    /**
     * isSuccessful : true
     * statusCode : 200
     * description :
     * userId :
     * data : {"app_data":{"appkey":"1090200","secretkey":"67679E60-73AC-4EE8-A6C4-13F04A70DD3D"}}
     */

    private boolean isSuccessful;
    private int statusCode;
    private String description;
    private String userId;
    private DataBean data;

    public boolean isIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Parcelable {
        /**
         * app_data : {"appkey":"1090200","secretkey":"67679E60-73AC-4EE8-A6C4-13F04A70DD3D"}
         */

        private AppDataBean app_data;

        public AppDataBean getApp_data() {
            return app_data;
        }

        public void setApp_data(AppDataBean app_data) {
            this.app_data = app_data;
        }

        public static class AppDataBean implements Parcelable {
            /**
             * appkey : 1090200
             * secretkey : 67679E60-73AC-4EE8-A6C4-13F04A70DD3D
             */

            private String appkey;
            private String secretkey;

            public String getAppkey() {
                return appkey;
            }

            public void setAppkey(String appkey) {
                this.appkey = appkey;
            }

            public String getSecretkey() {
                return secretkey;
            }

            public void setSecretkey(String secretkey) {
                this.secretkey = secretkey;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.appkey);
                dest.writeString(this.secretkey);
            }

            public AppDataBean() {
            }

            protected AppDataBean(Parcel in) {
                this.appkey = in.readString();
                this.secretkey = in.readString();
            }

            public static final Creator<AppDataBean> CREATOR = new Creator<AppDataBean>() {
                @Override
                public AppDataBean createFromParcel(Parcel source) {
                    return new AppDataBean(source);
                }

                @Override
                public AppDataBean[] newArray(int size) {
                    return new AppDataBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.app_data, flags);
        }

        public DataBean() {
        }

        protected DataBean(Parcel in) {
            this.app_data = in.readParcelable(AppDataBean.class.getClassLoader());
        }

        public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.isSuccessful ? (byte) 1 : (byte) 0);
        dest.writeInt(this.statusCode);
        dest.writeString(this.description);
        dest.writeString(this.userId);
        dest.writeParcelable(this.data, flags);
    }

    public StartBean() {
    }

    protected StartBean(Parcel in) {
        this.isSuccessful = in.readByte() != 0;
        this.statusCode = in.readInt();
        this.description = in.readString();
        this.userId = in.readString();
        this.data = in.readParcelable(DataBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<StartBean> CREATOR = new Parcelable.Creator<StartBean>() {
        @Override
        public StartBean createFromParcel(Parcel source) {
            return new StartBean(source);
        }

        @Override
        public StartBean[] newArray(int size) {
            return new StartBean[size];
        }
    };
}
