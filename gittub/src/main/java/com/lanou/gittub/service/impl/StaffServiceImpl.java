package com.lanou.gittub.service.impl;

import com.lanou.gittub.bean.Staff;
import com.lanou.gittub.mapper.StaffMapper;
import com.lanou.gittub.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
@Autowired
private StaffMapper staffMapper;
    @Override
    public Staff selectOneInfo(String telephone) {
        return staffMapper.selectOneInfo(telephone);
    }

    @Override
    public Staff selectOneStaff(Integer sid) {
        return staffMapper.selectOneStaff(sid);
    }

    @Override
    public List<Staff> selectAllStaff() {
        return staffMapper.selectAllStaff();
    }

    @Override
    public int updateStaff(Staff staff) {
        return staffMapper.updateStaff(staff);
    }

    @Override
    public int deleteStaff(String telephone) {
        return staffMapper.deleteStaff(telephone);
    }
}
