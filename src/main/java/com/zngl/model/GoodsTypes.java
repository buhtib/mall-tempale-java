package com.zngl.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 *
 */
@Data
public class GoodsTypes {
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    @NotBlank(message = "")
    private String type_name;
    /**
     *
     */
    private Integer num;
    /**
     *
     */
    private Boolean state;
}