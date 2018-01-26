package com.yuwubao.hz_International.services;

import com.yuwubao.hz_International.entities.SysConfigEntity;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface SysConfigService {
    SysConfigEntity findByUserAccountAndPassword(String userAccount, String password);
}
