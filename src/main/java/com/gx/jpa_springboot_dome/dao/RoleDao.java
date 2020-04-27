package com.gx.jpa_springboot_dome.dao;

import com.gx.jpa_springboot_dome.entity.SysRole;
import com.gx.jpa_springboot_dome.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author zzl
 * @Date 2020/4/22 14:05
 */
@Component
public interface RoleDao extends JpaRepository<SysRole,Long> {

}
