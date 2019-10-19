package com.lanou.gittub.controller;

import com.alibaba.fastjson.JSON;
import com.lanou.gittub.bean.Department;
import com.lanou.gittub.service.DeartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DeartmentService deartmentService;
    @RequestMapping("/showDepartment")
    public String showDepartment(){
        List<Department> departmentList = deartmentService.selectAllDepartment();
        return JSON.toJSONString(departmentList);
    }
}
