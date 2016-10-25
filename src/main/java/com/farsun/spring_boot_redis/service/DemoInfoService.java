package com.farsun.spring_boot_redis.service;

import com.farsun.spring_boot_redis.bean.DemoInfo;

public interface DemoInfoService {
	
	public DemoInfo findById(long id);
	   
    public void deleteFromCache(long id);
 
    void test();
}

