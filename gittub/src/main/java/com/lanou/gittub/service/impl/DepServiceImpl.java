package com.lanou.gittub.service.impl;

import com.lanou.gittub.bean.Department;
import com.lanou.gittub.mapper.DepMapper;
import com.lanou.gittub.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepServiceImpl implements DepService {
    @Autowired
    private DepMapper depMapper;
    @Override
    public List<Department> allDel() {
        return depMapper.allDep();
    }
}
