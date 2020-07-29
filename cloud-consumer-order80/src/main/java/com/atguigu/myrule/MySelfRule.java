package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Linzp
 * @description
 * @date 2020/7/28 9:30 上午
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule iRule(){
        //定义为随机
        return new RandomRule();
    }
}
