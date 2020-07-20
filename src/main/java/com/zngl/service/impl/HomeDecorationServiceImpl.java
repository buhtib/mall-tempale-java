package com.zngl.service.impl;

import com.alibaba.fastjson.JSON;
import com.zngl.dao.HomeDecorationDAO;
import com.zngl.model.HomeDecorationType;
import com.zngl.model.HomeDecorationTypeList;
import com.zngl.service.HomeDecorationService;
import com.zngl.util.RestData;
import com.zngl.util.RestError;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class HomeDecorationServiceImpl implements HomeDecorationService {

    @Resource
    private HomeDecorationDAO homeDecorationDAO;

    @Transactional(readOnly = true)
    @Override
    public View getList() {
        try {
            List<HomeDecorationType> list = homeDecorationDAO.findAll();
            return new RestData(list);
        } catch (Exception e) {
            return new RestError("获取失败");
        }
    }

    @Override
    public View updateCurrentNum(List<HomeDecorationType> list) {
        for (HomeDecorationType type : list) {
            for (HomeDecorationTypeList item : type.getChildren()) {
                try {
                    HomeDecorationTypeList currentList = homeDecorationDAO.findTypeListById(item.getId());
                    if (currentList != null) {
                        homeDecorationDAO.updateCurrentNum(item);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return new RestError("更新失败");
                }
            }
        }
        return new RestData("更新成功");
    }
}