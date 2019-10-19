package com.lanou.gittub.bean;


import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Staff {
    private Integer sid;//员工id
    private String name;//员工姓名
    private String password;//员工密码
    private Integer did;//所属部门
    private String telephone;//员工手机号
    private Department department;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
