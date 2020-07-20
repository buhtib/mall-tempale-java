package com.zngl.service;

import com.zngl.model.TabDecoration;
import org.springframework.web.servlet.View;

/**
 *
 */
public interface TabDecorationService {
    /**
     * 查询全部不分页
     *
     * @return {@link TabDecoration}
     */
    View getList();

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
    View update(TabDecoration tabDecoration);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     * @return
     */
    View deleteById(Integer id);

}