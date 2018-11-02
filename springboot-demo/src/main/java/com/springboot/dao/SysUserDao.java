package com.springboot.dao;

import com.springboot.bean.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yangsong on 2018/10/31.
 */
public interface SysUserDao extends JpaRepository<SysUser,Long>{
    SysUser findByUsername(String username);
}
