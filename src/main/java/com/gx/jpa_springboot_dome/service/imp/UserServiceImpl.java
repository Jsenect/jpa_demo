package com.gx.jpa_springboot_dome.service.imp;

import com.gx.jpa_springboot_dome.dao.UserDao;
import com.gx.jpa_springboot_dome.entity.SysUser;
import com.gx.jpa_springboot_dome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<SysUser> findAll() {
        return userDao.findAll();
    }
}
