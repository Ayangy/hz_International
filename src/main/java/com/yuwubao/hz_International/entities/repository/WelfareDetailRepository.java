package com.yuwubao.hz_International.entities.repository;

import com.yuwubao.hz_International.entities.WelfareDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface WelfareDetailRepository extends JpaRepository<WelfareDetailEntity, Integer>, JpaSpecificationExecutor<WelfareDetailEntity> {
}
