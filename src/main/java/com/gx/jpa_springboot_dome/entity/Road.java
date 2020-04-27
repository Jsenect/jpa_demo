package com.gx.jpa_springboot_dome.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zzl
 * @Date 2020/4/22 15:41
 */
@Entity
@Table(name = "sys_road")
@Data
public class Road {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Long deptId;

}
