package com.yuwubao.hz_International.services;

import com.yuwubao.hz_International.entities.ConsumerEntity;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface ConsumerService {
    ConsumerEntity findByPhone(String phone);

    ConsumerEntity save(ConsumerEntity consumerEntity);

    ConsumerEntity findByPhoneAndPassword(String phone, String pwd);
}
