package com.yuwubao.hz_International.services;

import com.yuwubao.hz_International.entities.MoneyDetailEntity;

import java.util.List;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface MoneyDetailService {
    List<MoneyDetailEntity> findAll();

    MoneyDetailEntity save(MoneyDetailEntity moneyDetail);
}
