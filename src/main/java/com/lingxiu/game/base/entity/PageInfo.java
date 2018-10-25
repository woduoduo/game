package com.lingxiu.game.base.entity;

import java.io.Serializable;

/**
 * @author lingxiu 2018/10/24 18:10
 */
public class PageInfo implements Serializable {
    private static final long serialVersionUID = 1473163694690779067L;

    /**
     * 当前页
     * <p>默认为第一页
     */
    private Integer currentPage = 1;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 每页显示条数
     * <p>默认20条
     */
    private Integer pageSize = 20;

    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * 构造函数1
     */
    public PageInfo() {
    }

    /**
     * 构造函数2
     *
     * @param currentPage 当前页
     * @param pageSize    每页条数
     */
    public PageInfo(Integer currentPage, Integer pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        if (null != totalCount && null != pageSize && pageSize > 0) {
            if (totalCount % pageSize > 0) {
                return totalCount / pageSize + 1;
            } else {
                return totalCount / pageSize;
            }
        }
        return totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                '}';
    }
}
