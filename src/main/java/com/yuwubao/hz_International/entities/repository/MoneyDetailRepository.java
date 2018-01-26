package com.yuwubao.hz_International.entities.repository;

import com.yuwubao.hz_International.entities.MoneyDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface MoneyDetailRepository extends JpaRepository<MoneyDetailEntity, Integer>, JpaSpecificationExecutor<MoneyDetailEntity> {
}
