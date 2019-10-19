package com.lanou.gittub.service;

import com.lanou.gittub.bean.Department;
import com.lanou.gittub.bean.Staff;

import java.util.List;

public interface StaffService {
    //通过name查找员工
    Staff selectStaffByName(String name);
    //添加员工
    int addStaff(String name,String password,String telephone,Integer did);

}
