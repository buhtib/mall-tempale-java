package com.zngl.controller;

import com.zngl.model.HomeDecorationTypeList;
import com.zngl.service.HomeDecorationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/homeDecoration")
public class HomeDecorationController {
    @Resource
    private HomeDecorationService homeDecorationService;

    @GetMapping
    public View getList() {
        return homeDecorationService.getList();
    }

    @PostMapping
    public View update(@RequestBody List<HomeDecorationTypeList> list) {
        return homeDecorationService.updateCurrentNum(list);
    }
}
