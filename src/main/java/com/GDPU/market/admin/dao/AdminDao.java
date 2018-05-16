package com.GDPU.market.admin.dao;

import com.GDPU.market.admin.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {

    Admin isAdmin(@Param(value = "admin") Admin admin);

}
