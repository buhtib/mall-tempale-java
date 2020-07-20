package com.zngl.controller;

import com.zngl.model.TabDecoration;
import com.zngl.service.TabDecorationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;

/**
 * 接口
 */
@Controller
@RequestMapping("/tabDecorations")
public class TabDecorationController {

    @Resource
    private TabDecorationService tabDecorationService;

    @GetMapping
    public View getList() {
        return tabDecorationService.getList();
    }

//    @PostMapping
//    public View insert(@RequestBody TabDecoration tabDecoration) {
//        tabDecorationService.insert(tabDecoration);
//        return new RestData("新增成功");
//    }

    @PutMapping
    public View update(@RequestBody TabDecoration tabDecoration) {
        return tabDecorationService.update(tabDecoration);
    }

    @DeleteMapping
    public View deleteById(Integer id) {
        return tabDecorationService.deleteById(id);
    }
}
