package com.yuwubao.hz_International.services;

import com.yuwubao.hz_International.entities.RechargeConfigEntity;

import java.util.List;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface RechargeConfigService {
    List<RechargeConfigEntity> findAll();

    RechargeConfigEntity findById(int rechargeConfigId);

}
