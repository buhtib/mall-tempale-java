package com.zngl.service;

import com.github.pagehelper.PageInfo;
import com.zngl.model.HomeDecorationDragList;

/**
 *
 */
public interface HomeDecorationDragListService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link HomeDecorationDragList}
     */
    HomeDecorationDragList findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link HomeDecorationDragList}
     */
    PageInfo<HomeDecorationDragList> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param homeDecorationDragList
     */
    void insert(HomeDecorationDragList homeDecorationDragList);

    /**
     * 修改
     *
     * @param homeDecorationDragList
     */
    void update(HomeDecorationDragList homeDecorationDragList);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}