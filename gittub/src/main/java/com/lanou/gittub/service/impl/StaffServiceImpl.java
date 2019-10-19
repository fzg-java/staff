package com.lanou.gittub.service.impl;

import com.lanou.gittub.bean.Department;
import com.lanou.gittub.bean.Staff;
import com.lanou.gittub.mapper.StaffMapper;
import com.lanou.gittub.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;

    @Override
    public Staff selectStaffByName(String name) {
        return staffMapper.selectStaffByName(name);
    }

    @Override
    public int addStaff(String name, String password, String telephone,Integer did) {
        return staffMapper.addStaff(name,password,telephone,did);
    }


}
