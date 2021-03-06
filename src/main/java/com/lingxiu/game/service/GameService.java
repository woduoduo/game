package com.lingxiu.game.service;

import com.github.pagehelper.PageInfo;
import com.lingxiu.game.entity.Game;

/**
 * @author lingxiu 2018/10/18 16:40
 */
public interface GameService {
    Game getById(Long id);

    PageInfo<Game> getPage(int currentPage, int pageSize);
}
