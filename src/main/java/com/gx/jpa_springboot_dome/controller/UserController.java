package com.gx.jpa_springboot_dome.controller;

import com.gx.jpa_springboot_dome.entity.SysUser;
import com.gx.jpa_springboot_dome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:10
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<SysUser> findAll() {
        return userService.findAll();
    }

}
