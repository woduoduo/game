package com.lingxiu.game.web;

import com.lingxiu.game.entity.Game;
import com.lingxiu.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author lingxiu 2018/8/31 11:44
 */
@RestController
@Controller
@RequestMapping("/")
public class DemoController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private GameService gameService;
    @Value("${lingxiu.name}")
    private String name;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(HttpSession httpSession) {
        httpSession.setAttribute("111", "session-1");
        return "demo :hello world !" + name;
    }

    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public String demo1(HttpSession httpSession) {
        String session = (String) httpSession.getAttribute("111");
        Game game = gameService.getById(1L);
        return "demo :hello world !" + name + " session：111-" + session + game;
    }

    @RequestMapping(value = "/testRedis", method = RequestMethod.GET)
    public String testRedis(HttpSession httpSession) {
        redisTemplate.opsForValue().set("111", "111");
        boolean flag = redisTemplate.hasKey("111");
        System.out.println(flag);
        String value = (String)redisTemplate.opsForValue().get("111");
        System.out.println(value);
        return "测试redis";
    }
}
