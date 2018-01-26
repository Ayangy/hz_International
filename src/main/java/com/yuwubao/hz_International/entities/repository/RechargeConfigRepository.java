package com.yuwubao.hz_International.entities.repository;

import com.yuwubao.hz_International.entities.RechargeConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface RechargeConfigRepository extends JpaRepository<RechargeConfigEntity, Integer>, JpaSpecificationExecutor<RechargeConfigEntity> {
}
