package com.lingxiu.game;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "dev")
public class GameApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testRedis() {
		ValueOperations<String, String> redis = redisTemplate.opsForValue();
		redis.set("1", "111");
		redis.set("2", "222");
		boolean flag = redisTemplate.hasKey("1");
		if (flag) {
			String value = (String) redisTemplate.opsForValue().get("1");
			System.out.println("有key=1，value=" + value);
		}
		System.out.println("没有key=1");
		flag = redisTemplate.hasKey("2");
		if (flag) {
			String value = (String) redisTemplate.opsForValue().get("1");
			System.out.println("有key=2，value=" + value);
		}
		System.out.println("没有key=2");

		stringRedisTemplate.opsForValue().set("3", "333");
	}

}
