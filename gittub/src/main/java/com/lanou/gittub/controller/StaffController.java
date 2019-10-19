package com.lanou.gittub.controller;

import com.alibaba.fastjson.JSON;
import com.lanou.gittub.GittubApplication;
import com.lanou.gittub.bean.Staff;
import com.lanou.gittub.service.StaffService;
import com.lanou.gittub.util.StaffRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;
    //验证码

    @RequestMapping("/getCode")
    public String getCode(String telephone, HttpSession session){
        String code= StaffRegister.staffRegister(telephone);
        session.setAttribute("code",code);
        return JSON.toJSONString("验证码已发送!");
    }

    //验证登录
    @RequestMapping("/selectOneInfo")
    public String selectOneInfo(String telephone,String code2,HttpSession session){
       Staff staff1 = staffService.selectOneInfo(telephone);
       if (staff1!=null){
         if (code2!=null&&!code2.equals("")&&code2.equals(session.getAttribute("code"))){
             return JSON.toJSONString("登陆成功");
         }else {
             return JSON.toJSONString("验证码错误");
         }
       }
        return JSON.toJSONString("账号错误");
    }
     //查询所有员工，修改员工信息，删除员工
    //根据id查看用户
    @RequestMapping("/selectOneStaff")
    public String selectOneStaff(Integer id){
        Staff staff = staffService.selectOneStaff(id);
        return JSON.toJSONString(staff);
    }
    //展示所有员工信息
    @RequestMapping("/selectAllStaff")
    public String selectAllStaff(){
        List<Staff> staffList = staffService.selectAllStaff();
        return JSON.toJSONString(staffList);
    }
    //修改用户信息
    @RequestMapping("/updateStaff")
    public String updateStaff(Staff staff){
       int num = staffService.updateStaff(staff);
       return  JSON.toJSONString(num);
    }
   //删除用户
    @RequestMapping("/deleteStaff")
    public String deleteStaff(String telephone){
        int num =0;
        if (telephone!=null&&!telephone.equals("")){
            num =staffService.deleteStaff(telephone);
        }
        return  JSON.toJSONString(num);
    }


}
