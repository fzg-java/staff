package com.lanou.gittub.service;

import com.lanou.gittub.bean.Staff;

import java.util.List;


public interface StaffService {
    //根据手机号查询
    Staff selectOneInfo(String telephone);
    //查看单个员工信息
    Staff selectOneStaff(Integer sid);
    //查看所有员工信息
    List<Staff> selectAllStaff();
    //修改员工信息
    int updateStaff(Staff staff);
    //删除员工信息
    int deleteStaff(String telephone);
}
