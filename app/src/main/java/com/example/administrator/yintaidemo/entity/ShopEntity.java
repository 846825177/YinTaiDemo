package com.example.administrator.yintaidemo.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by 张扬帆 on 2017/10/17.
 */
@DatabaseTable(tableName = "car")
public class ShopEntity {
    @DatabaseField(id = false, generatedId = true)
    private int id;
    @DatabaseField(columnName = "img")
    private String img;
    @DatabaseField(columnName = "name")
    private String name;
    @DatabaseField(columnName = "color")
    private String color;
    @DatabaseField(columnName = "size")
    private String size;
    @DatabaseField(columnName = "price")
    private double price;
    @DatabaseField(columnName = "num")
    private int num;

    public ShopEntity() {
    }

    public ShopEntity(String img, String name, String color, String size, double price, int num) {
        this.img = img;
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
        this.num = num;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
