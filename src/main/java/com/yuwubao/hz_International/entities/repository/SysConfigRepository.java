package com.yuwubao.hz_International.entities.repository;

import com.yuwubao.hz_International.entities.SysConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface SysConfigRepository extends JpaRepository<SysConfigEntity, Integer>, JpaSpecificationExecutor<SysConfigEntity> {
    SysConfigEntity findByUserAccountAndPassword(String userAccount, String password);
}
