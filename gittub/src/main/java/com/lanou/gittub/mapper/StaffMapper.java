package com.lanou.gittub.mapper;

import com.lanou.gittub.bean.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
public interface StaffMapper {
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
