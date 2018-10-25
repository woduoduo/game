package com.lingxiu.game.dao;

import com.lingxiu.game.entity.Game;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lingxiu 2018/10/18 16:45
 */
@Mapper
public interface GameDao {

    Game getById(Long id);
}
