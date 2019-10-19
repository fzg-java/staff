package com.lanou.gittub.mapper;

import com.lanou.gittub.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Component
public interface DepartmentMapper {
    //展示所有部门信息
    List<Department> selectAllDepartment();
}
