package com.zngl.service;

import com.zngl.model.HomeDecorationType;
import org.springframework.web.servlet.View;

import java.util.List;

/**
 *
 */
public interface HomeDecorationService {
    /**
     * 查询全部不分页
     *
     * @return {@link HomeDecorationType}
     */
    View getList();

    /**
     * 修改左侧类型数据
     *
     * @param homeDecorationTypeList
     */
    View updateCurrentNum(List<HomeDecorationType> homeDecorationTypeList);


}