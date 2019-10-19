package com.lanou.gittub.controller;

import com.alibaba.fastjson.JSON;
import com.lanou.gittub.bean.Department;
import com.lanou.gittub.bean.Staff;
import com.lanou.gittub.service.StaffService;
import com.lanou.gittub.util.PhoneUtil;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("code")
    public void getCode(String telephone,HttpSession session){
        String random = PhoneUtil.staffRegister(telephone);
        System.out.println(random);
        session.setAttribute("random",random);

    }
    @RequestMapping("register")
    public String phoneRegister(String name,String telephone, String code,Integer did, HttpSession session){
        Staff staff1 = staffService.selectStaffByName(name);
        if(staff1 == null){
           String random = (String)session.getAttribute("random");
            if(!random.equals(code)){
                return "验证码错误";
            }else{
                String password = (int) ((Math.random() * 9 + 1) * 100000) + "";
                session.setAttribute("password",password);
                staffService.addStaff(name,password,telephone,did);
                return password;
            }
        }else {
            return "员工已存在";
        }

    }


}
