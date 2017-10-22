package com.example.administrator.yintaidemo.db.adressdb;

import android.widget.CheckBox;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by dell on 2017/10/21.
 */
@Entity(nameInDb = "adreess")
public class AdressBean {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "name")
    private String name;
    @Property(nameInDb = "adress")
    private String adresses;
    @Property(nameInDb = "phone")
    private String phone;
    @Transient
    private boolean ischeckd=false;

    public boolean ischeckd() {
        return ischeckd;
    }

    public void setIscheckd(boolean ischeckd) {
        this.ischeckd = ischeckd;
    }

    @Generated(hash = 429750715)
    public AdressBean(Long id, String name, String adresses, String phone) {
        this.id = id;
        this.name = name;
        this.adresses = adresses;
        this.phone = phone;
    }
    @Generated(hash = 1775077303)
    public AdressBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdresses() {
        return this.adresses;
    }
    public void setAdresses(String adresses) {
        this.adresses = adresses;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
