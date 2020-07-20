package com.zngl.controller;

import com.zngl.model.GoodsTypes;
import com.zngl.service.GoodsTypesService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;

/**
 *
 */
@RestController
@RequestMapping("/goodsTypes")
public class GoodsTypesController {
    @Resource
    private GoodsTypesService goodsTypesService;

    @GetMapping
    public View getList() {
        return goodsTypesService.getList();
    }

    @PostMapping
    public View insert( @RequestBody GoodsTypes goodsTypes) {
        return  goodsTypesService.insert(goodsTypes);
    }

    @PutMapping
    public View update(@RequestBody  GoodsTypes goodsTypes) {
        return goodsTypesService.update(goodsTypes);
    }

    @DeleteMapping
    public View deleteById(Integer id) {
        return goodsTypesService.deleteById(id);
    }
}
