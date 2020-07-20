package com.zngl.dao;

import com.github.pagehelper.Page;
import com.zngl.model.TabDecoration;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *数据库
 */
public interface TabDecorationDAO {

    /**
     * 通过ID查询单个
     *
     * @return {@link TabDecoration}
     */
    TabDecoration findById(Integer id);

    /**
     * 查全部
     *
     * @return {@link TabDecoration}
     */
    List<TabDecoration> findAll();

//    /**
//     * 新增
//     *
//     * @param tabDecoration
//     */
//    void insert(TabDecoration tabDecoration);

    /**
     * 修改
     *
     * @param tabDecoration
     */
    void update(TabDecoration tabDecoration);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}