package com.lanou.gittub.service;

import com.lanou.gittub.bean.Department;

import java.util.List;

public interface DeartmentService {
    //展示所有部门信息
    List<Department> selectAllDepartment();
}
