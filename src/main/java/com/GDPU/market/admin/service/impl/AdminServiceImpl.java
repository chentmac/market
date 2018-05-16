package com.GDPU.market.admin.service.impl;

import com.GDPU.market.admin.dao.AdminDao;
import com.GDPU.market.admin.entity.Admin;
import com.GDPU.market.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin isAdmin(Admin admin) {
        return adminDao.isAdmin(admin);
    }
}
