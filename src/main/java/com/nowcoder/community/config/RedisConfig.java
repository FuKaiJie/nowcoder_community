package com.nowcoder.community.config;

import com.alibaba.fastjson.serializer.JSONSerializable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author FKJ
 * @create 2023-03-12 16:25
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);

        // 设置key序列化方式
        template.setKeySerializer(new StringRedisSerializer());
        // 设置value序列化方式
        template.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        // 设置hash的key序列化方式
        template.setHashKeySerializer(new StringRedisSerializer());
        // 设置hash的value序列化方式
        template.setHashValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));

        template.afterPropertiesSet();
        return template;
    }
}
