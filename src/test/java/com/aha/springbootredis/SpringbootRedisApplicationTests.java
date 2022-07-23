package com.aha.springbootredis;

import com.aha.springbootredis.redis.CacheService;
import com.aha.springbootredis.redis.RedisUtils;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class SpringbootRedisApplicationTests {

    @Autowired
    CacheService cacheService;
    @Resource
    private RedisUtils redisUtils;

    /**
     * 插入缓存数据
     */
    @Test
    public void set() {
        redisUtils.set("redis_key", "redis_vale");
    }

    /**
     * 读取缓存数据
     */
    @Test
    public void get() {
        String value = redisUtils.get("redis_key");
        System.out.println(value);
    }

    @Test
    void contextLoads() {
    }
    @Test
    void add() {
        cacheService.add("test", 1234);
    }

}
