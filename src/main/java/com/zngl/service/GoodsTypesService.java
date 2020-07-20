package com.zngl.service;

import com.zngl.model.GoodsTypes;
import org.springframework.web.servlet.View;

/**
 *
 */
public interface GoodsTypesService {

    /**
     * 查询全部不分页
     *
     * @return {@link GoodsTypes}
     */
    View getList();

    /**
     * 新增
     *
     * @param goodsTypes
     */
    View insert(GoodsTypes goodsTypes);

    /**
     * 修改
     *
     * @param goodsTypes
     */
    View update(GoodsTypes goodsTypes);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     * @return
     */
    View deleteById(Integer id);

}