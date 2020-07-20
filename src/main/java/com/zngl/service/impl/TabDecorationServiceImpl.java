package com.zngl.service.impl;

import com.zngl.dao.TabDecorationDAO;
import com.zngl.model.TabDecoration;
import com.zngl.service.TabDecorationService;
import com.zngl.util.RestData;
import com.zngl.util.RestError;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TabDecorationServiceImpl implements TabDecorationService {

    @Resource
    private TabDecorationDAO tabDecorationDAO;

    @Transactional(readOnly = true)
    public View getList() {
        List<TabDecoration> list = tabDecorationDAO.findAll();
        return new RestData(list, list.size());
    }

//    @Override
//    public void insert(TabDecoration tabDecoration) {
//        tabDecorationDAO.insert(tabDecoration);
//    }

    @Override
    public View update(TabDecoration tabDecoration) {
        try {
            tabDecorationDAO.update(tabDecoration);
            return new RestData("更新成功");
        } catch (Exception e) {
            return new RestError("更新失败！");
        }
    }

    @Override
    public View deleteById(Integer id) {
        TabDecoration tab = tabDecorationDAO.findById(id);
        if( tab != null ) {
            tabDecorationDAO.deleteById(id);
            return new RestData("删除成功");
        }else {
            return new RestError("id不存在！删除失败");
        }
    }

}