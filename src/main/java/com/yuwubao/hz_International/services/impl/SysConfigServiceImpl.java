package com.yuwubao.hz_International.services.impl;

import com.yuwubao.hz_International.entities.SysConfigEntity;
import com.yuwubao.hz_International.entities.repository.SysConfigRepository;
import com.yuwubao.hz_International.services.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangyu on 2018/1/25.
 */
@Service
public class SysConfigServiceImpl implements SysConfigService {

    @Autowired
    private SysConfigRepository sysConfigRepository;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public SysConfigEntity findByUserAccountAndPassword(String userAccount, String password) {
        return sysConfigRepository.findByUserAccountAndPassword(userAccount, password);
    }
}
