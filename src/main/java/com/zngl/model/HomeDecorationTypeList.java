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
    private Integer parentId;
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
    private String settingType;
    /**
     *
     */
    private int num;
    /**
     *
     */
    private int currentNum;
}