package com.farsun.spring_boot_redis.repository;

import org.springframework.data.repository.CrudRepository;

import com.farsun.spring_boot_redis.bean.DemoInfo;

/**
 * DemoInfo持久化类
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long>{

}
