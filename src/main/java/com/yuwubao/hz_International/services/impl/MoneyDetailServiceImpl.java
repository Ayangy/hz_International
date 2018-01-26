package com.yuwubao.hz_International.services.impl;

import com.yuwubao.hz_International.entities.MoneyDetailEntity;
import com.yuwubao.hz_International.entities.repository.MoneyDetailRepository;
import com.yuwubao.hz_International.services.MoneyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangyu on 2018/1/25.
 */
@Service
public class MoneyDetailServiceImpl implements MoneyDetailService {

    @Autowired
    private MoneyDetailRepository moneyDetailRepository;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<MoneyDetailEntity> findAll() {
        return moneyDetailRepository.findAll();
    }

    @Override
    public MoneyDetailEntity save(MoneyDetailEntity moneyDetail) {
        return moneyDetailRepository.save(moneyDetail);
    }
}
