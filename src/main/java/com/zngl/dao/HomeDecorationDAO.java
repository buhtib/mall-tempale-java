package com.zngl.dao;

import com.zngl.model.HomeDecorationType;
import com.zngl.model.HomeDecorationTypeList;

import java.util.List;

/**
 *
 */
public interface HomeDecorationDAO {
    /**
     * 查全部
     *
     * @return {@link HomeDecorationType}
     */
    List<HomeDecorationType> findAll();

    /**
     * 根据id查HomeDecorationTypeList
     *
     * @param id HomeDecorationType的id
     */
    HomeDecorationTypeList findTypeListById(Integer id, Integer parent_id);


    /**
     * 更新左侧选择的数量
     *
     * @param homeDecorationTypeList
     */
    void updateCurrentNum(HomeDecorationTypeList homeDecorationTypeList);

    /**
     * 新增
     *
     * @param homeDecorationType
     */
    void insert(HomeDecorationType homeDecorationType);




}