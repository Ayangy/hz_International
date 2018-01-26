package com.yuwubao.hz_International.services.impl;

import com.yuwubao.hz_International.entities.RechargeConfigEntity;
import com.yuwubao.hz_International.entities.repository.RechargeConfigRepository;
import com.yuwubao.hz_International.services.RechargeConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangyu on 2018/1/25.
 */
@Service
public class RechargeConfigServiceImpl implements RechargeConfigService {

    @Autowired
    private RechargeConfigRepository rechargeConfigRepository;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<RechargeConfigEntity> findAll() {
        return rechargeConfigRepository.findAll();
    }

    @Override
    public RechargeConfigEntity findById(int rechargeConfigId) {
        return rechargeConfigRepository.findOne(rechargeConfigId);
    }
}
