package com.yuwubao.hz_International.services.impl;

import com.yuwubao.hz_International.entities.ConsumerEntity;
import com.yuwubao.hz_International.entities.repository.ConsumerRepository;
import com.yuwubao.hz_International.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangyu on 2018/1/25.
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public ConsumerEntity findByPhone(String phone) {
        return consumerRepository.findByPhone(phone);
    }

    @Override
    public ConsumerEntity save(ConsumerEntity consumerEntity) {
        return consumerRepository.save(consumerEntity);
    }

    @Override
    public ConsumerEntity findByPhoneAndPassword(String phone, String pwd) {
        return consumerRepository.findByPhoneAndPassword(phone, pwd);
    }
}
