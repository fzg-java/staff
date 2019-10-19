package com.lanou.gittub.service.impl;

import com.lanou.gittub.bean.Department;
import com.lanou.gittub.mapper.DepartmentMapper;
import com.lanou.gittub.service.DeartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DeartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectAllDepartment() {
        return departmentMapper.selectAllDepartment();
    }
}
