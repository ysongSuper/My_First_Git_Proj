package com.springboot.service;

import com.springboot.dao.AccountDao;
import com.springboot.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangsong on 2018/6/15.
 */

@Service("jpaTestService")
public class JpaTestService {


    @Autowired
    private AccountDao accountDao;

    public List<Account> findAllInfos(){
        List<Account> accountList=accountDao.findAll();
        return accountList;
    }

}
