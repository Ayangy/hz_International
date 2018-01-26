package com.yuwubao.hz_International.entities.repository;

import com.yuwubao.hz_International.entities.ConsumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by yangyu on 2018/1/25.
 */
public interface ConsumerRepository extends JpaRepository<ConsumerEntity, Integer>, JpaSpecificationExecutor<ConsumerEntity> {

    ConsumerEntity findByPhone(String phone);

    ConsumerEntity findByPhoneAndPassword(String phone, String pwd);

}
