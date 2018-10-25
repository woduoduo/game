package com.lingxiu.game.dao;

import com.lingxiu.game.entity.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lingxiu 2018/10/18 16:45
 */
@Mapper
public interface GameDao {

    /**
     * 通过id查找实体
     *
     * @param id
     * @return
     */
    Game getById(Long id);

    /**
     * 获取集合
     *
     * @return
     */
    List<Game> getList();
}
