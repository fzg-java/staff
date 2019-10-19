package com.lanou.gittub.mapper;

import com.lanou.gittub.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface DepMapper {
    //查找所有部门展示
    List<Department> allDep();
}
