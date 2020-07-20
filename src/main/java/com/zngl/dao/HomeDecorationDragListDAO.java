package com.zngl.dao;

import com.github.pagehelper.Page;
import com.zngl.model.HomeDecorationDragList;

/**
 *
 */
public interface HomeDecorationDragListDAO {

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
     * @return {@link HomeDecorationDragList}
     */
    Page<HomeDecorationDragList> findByPage();

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