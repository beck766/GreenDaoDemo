package com.beck.greendaodemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by beck on 2018/2/28.
 * 人脸识别实体类
 */
@Entity
public class FaceUser {
    @Id
    private long id;
    private String name;
    private String gender;
    private String icon;
    private String age;
    private String feature;
    @Generated(hash = 448185727)
    public FaceUser(long id, String name, String gender, String icon, String age,
            String feature) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.icon = icon;
        this.age = age;
        this.feature = feature;
    }
    @Generated(hash = 1024976930)
    public FaceUser() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getIcon() {
        return this.icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getFeature() {
        return this.feature;
    }
    public void setFeature(String feature) {
        this.feature = feature;
    }

}
