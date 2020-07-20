package com.zngl.service.impl;

import com.zngl.dao.GoodsTypesDAO;
import com.zngl.model.GoodsTypes;
import com.zngl.service.GoodsTypesService;
import com.zngl.util.RestData;
import com.zngl.util.RestError;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsTypesServiceImpl implements GoodsTypesService {

    @Resource
    private GoodsTypesDAO goodsTypesDAO;

    @Transactional(readOnly = true)
    public View getList() {
        List<GoodsTypes> list = goodsTypesDAO.findAll();
        return new RestData(list, list.size());
    }

    @Override
    public View insert(GoodsTypes goodsTypes) {
        try {
            goodsTypesDAO.insert(goodsTypes);
            return new RestData("新增成功");
        }catch (Exception e) {
            return new RestError("新增失败");
        }
    }

    @Override
    public View update(GoodsTypes goodsTypes) {
        try {
            goodsTypesDAO.update(goodsTypes);
            return new RestData("更新成功");
        } catch (Exception e) {
            return new RestError("更新失败！");
        }
    }

    @Override
    public View deleteById(Integer id) {
        GoodsTypes type = goodsTypesDAO.findById(id);
        if( type != null ) {
            goodsTypesDAO.deleteById(id);
            return new RestData("删除成功");
        }else {
            return new RestError("id不存在！删除失败");
        }
    }

}