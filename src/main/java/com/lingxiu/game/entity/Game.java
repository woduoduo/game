package com.lingxiu.game.entity;

import com.lingxiu.game.base.entity.BaseEntity;

/**
 * @author lingxiu 2018/10/18 16:41
 */
public class Game extends BaseEntity {

    /**
     * 游戏名称
     */
    private String name;

    /**
     * 游戏种类
     */
    private String type;

    /**
     * 作者
     */
    private String author;

    /**
     * 游戏简介
     */
    private String summary;

    /**
     * 游戏备注
     */
    private String memo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", memo='" + memo + '\'' +
                "} " + super.toString();
    }
}
