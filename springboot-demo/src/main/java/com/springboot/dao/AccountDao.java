package com.springboot.dao;

import com.springboot.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yangsong on 2018/6/13.
 */

@Repository
public interface AccountDao extends JpaRepository<Account,Long>{



}
