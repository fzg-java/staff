package com.lanou.gittub.controller;

import com.alibaba.fastjson.JSON;
import com.lanou.gittub.bean.Department;
import com.lanou.gittub.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dep")
public class DepController {
    @Autowired
    private DepService depService;

    @RequestMapping("allDep")
    public String allDep(){
        List<Department> departmentList = depService.allDel();
        return JSON.toJSONString(departmentList);
    }


}
