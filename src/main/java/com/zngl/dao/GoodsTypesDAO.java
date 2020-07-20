package com.zngl.dao;

import com.zngl.model.GoodsTypes;

import java.util.List;

/**
 *
 */
public interface GoodsTypesDAO {

    /**
     * 通过ID查询单个
     *
     * @return {@link GoodsTypes}
     */
    GoodsTypes findById(Integer id);

    /**
     * 查全部
     *
     * @return {@link GoodsTypes}
     */
    List<GoodsTypes> findAll();

    /**
     * 新增
     *
     * @param goodsTypes
     */
    void insert(GoodsTypes goodsTypes);

    /**
     * 修改
     *
     * @param goodsTypes
     */
    void update(GoodsTypes goodsTypes);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}