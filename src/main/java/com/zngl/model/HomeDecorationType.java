package com.zngl.model;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class HomeDecorationType {
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private List<HomeDecorationTypeList> children;
}