package com.gx.jpa_springboot_dome.controller;

import com.gx.jpa_springboot_dome.entity.Dept;
import com.gx.jpa_springboot_dome.entity.SysUser;
import com.gx.jpa_springboot_dome.service.DeptService;
import com.gx.jpa_springboot_dome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:10
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    @RequestMapping("/all")
    public Object finddept() {
        HashMap<String, Object> hashMap = new HashMap<>();

        hashMap.put("张三", 11);
        hashMap.put("李四", 12);
        hashMap.put("王五", 13);


        return hashMap;
    }


}
