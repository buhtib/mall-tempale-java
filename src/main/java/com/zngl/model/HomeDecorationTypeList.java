package com.zngl.model;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;

/**
 *
 */
@Data
public class HomeDecorationTypeList {
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private Integer parent_id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String type;
    /**
     *
     */
    private String setting_type;
    /**
     *
     */
    private int num;
    /**
     *
     */
    private int current_num;
}