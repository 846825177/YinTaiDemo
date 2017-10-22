package com.example.administrator.yintaidemo.entity;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by 张扬帆 on 2017/10/17.
 */
@Entity(nameInDb = "shopcar")
public class ShopCartEntity implements Parcelable {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "img")
    private String img;
    @Property(nameInDb = "name")
    private String name;
    @Property(nameInDb = "color")
    private String color;
    @Property(nameInDb = "size")
    private String size;
    @Property(nameInDb = "price")
    private double price;
    @Property(nameInDb = "num")
    private int num;
    @Transient
    private boolean ischeckd=false;

    public boolean ischeckd() {
        return ischeckd;
    }

    public void setIscheckd(boolean ischeckd) {
        this.ischeckd = ischeckd;
    }

    @Generated(hash = 1162902045)
    public ShopCartEntity(Long id, String img, String name, String color,
            String size, double price, int num) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
        this.num = num;
    }
    @Generated(hash = 1103200236)
    public ShopCartEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSize() {
        return this.size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getNum() {
        return this.num;
    }
    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.img);
        dest.writeString(this.name);
        dest.writeString(this.color);
        dest.writeString(this.size);
        dest.writeDouble(this.price);
        dest.writeInt(this.num);
        dest.writeByte(this.ischeckd ? (byte) 1 : (byte) 0);
    }

    protected ShopCartEntity(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.img = in.readString();
        this.name = in.readString();
        this.color = in.readString();
        this.size = in.readString();
        this.price = in.readDouble();
        this.num = in.readInt();
        this.ischeckd = in.readByte() != 0;
    }

    public static final Parcelable.Creator<ShopCartEntity> CREATOR = new Parcelable.Creator<ShopCartEntity>() {
        @Override
        public ShopCartEntity createFromParcel(Parcel source) {
            return new ShopCartEntity(source);
        }

        @Override
        public ShopCartEntity[] newArray(int size) {
            return new ShopCartEntity[size];
        }
    };
}
