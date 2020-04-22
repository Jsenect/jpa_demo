package com.gx.jpa_springboot_dome.service;

import com.gx.jpa_springboot_dome.entity.SysUser;

import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:09
 */
public interface UserService {
    List<SysUser> findAll();

}
