package com.lingxiu.game.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lingxiu.game.dao.GameDao;
import com.lingxiu.game.entity.Game;
import com.lingxiu.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lingxiu 2018/10/18 16:41
 */
@Service("gameService")
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDao gameDao;

    @Override
    public Game getById(Long id) {
        return gameDao.getById(id);
    }

    @Override
    public PageInfo<Game> getPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Game> list = gameDao.getList();
        PageInfo<Game> pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
