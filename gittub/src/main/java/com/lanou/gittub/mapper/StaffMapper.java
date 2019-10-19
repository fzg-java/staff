package com.lanou.gittub.mapper;

import com.lanou.gittub.bean.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StaffMapper {
    //通过name查找员工
    Staff selectStaffByName(String name);
    //添加员工
    int addStaff(@Param("name")String name,@Param("password")String password,@Param("telephone")String telephone,@Param("did")Integer did);
}
