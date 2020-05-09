package com.gx.jpa_springboot_dome.controller;

import com.gx.jpa_springboot_dome.entity.Dept;
import com.gx.jpa_springboot_dome.entity.Factory;
import com.gx.jpa_springboot_dome.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:10
 */
@RestController
@RequestMapping("/factory")
public class FactoryController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public List<Factory> findAll() {
        ArrayList<Factory> arrayList = new ArrayList<>();


        Factory factory = new Factory("航天", 1);
        Factory factory1 = new Factory("航天2", 23);
        arrayList.add(factory);
        arrayList.add(factory1);
        return arrayList;

    }


}
