package com.yuwubao.hz_International.entities.repository;

import com.yuwubao.hz_International.entities.WelfareConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface WelfareConfigRepository extends JpaRepository<WelfareConfigEntity, Integer>, JpaSpecificationExecutor<WelfareConfigEntity> {
}
