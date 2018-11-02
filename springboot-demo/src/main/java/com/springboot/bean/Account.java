package com.springboot.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yangsong on 2018/6/13.
 */

@Entity
@Table(name="zt_account")

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long	id; //自增id	1
    private String account_code;//账户编号
    private Long	account_state;//账户状态（0.未使用 1.使用中 2.不可用）
    private Long	risk_id;//风控方案id
    private Long	cooperation_id;//合作方案id
    private Date c_time;//创建状态	0
    private Date	m_time;//修改时间	1
    private String 	accountOwner;//账户所有人
    private Long	is_clear;//是否清算 (0.未清算 1.已清算)
    private String 	risk_state;// 风险方案使用状态（0.停用 1.开启）


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }

    public Long getAccount_state() {
        return account_state;
    }

    public void setAccount_state(Long account_state) {
        this.account_state = account_state;
    }

    public Long getRisk_id() {
        return risk_id;
    }

    public void setRisk_id(Long risk_id) {
        this.risk_id = risk_id;
    }

    public Long getCooperation_id() {
        return cooperation_id;
    }

    public void setCooperation_id(Long cooperation_id) {
        this.cooperation_id = cooperation_id;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }

    public Date getM_time() {
        return m_time;
    }

    public void setM_time(Date m_time) {
        this.m_time = m_time;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Long getIs_clear() {
        return is_clear;
    }

    public void setIs_clear(Long is_clear) {
        this.is_clear = is_clear;
    }

    public String getRisk_state() {
        return risk_state;
    }

    public void setRisk_state(String risk_state) {
        this.risk_state = risk_state;
    }
}
