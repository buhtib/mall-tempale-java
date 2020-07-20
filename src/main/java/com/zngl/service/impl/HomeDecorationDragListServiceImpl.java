package com.zngl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zngl.dao.HomeDecorationDragListDAO;
import com.zngl.model.HomeDecorationDragList;
import com.zngl.service.HomeDecorationDragListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class HomeDecorationDragListServiceImpl implements HomeDecorationDragListService {

    @Autowired
    private HomeDecorationDragListDAO homeDecorationDragListDAO;

    @Transactional(readOnly = true)
    @Override
    public HomeDecorationDragList findById(Integer id) {
        return homeDecorationDragListDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<HomeDecorationDragList> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(homeDecorationDragListDAO.findByPage());
    }

    @Override
    public void insert(HomeDecorationDragList homeDecorationDragList) {
        homeDecorationDragListDAO.insert(homeDecorationDragList);
    }

    @Override
    public void update(HomeDecorationDragList homeDecorationDragList) {
        homeDecorationDragListDAO.update(homeDecorationDragList);
    }

    @Override
    public void deleteById(Integer id) {
        homeDecorationDragListDAO.deleteById(id);
    }

}