package com.love.service.impl;

import com.love.dao.DetailDAO;
import com.love.model.Detail;
import com.love.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDAO detailDAO;

    @Override
    public void insert(Detail entity) {
        detailDAO.insert(entity);
    }

    @Override
    public List selectAll() {
        return detailDAO.selectAll();
    }

    @Override
    public List selectByMem(int id) {
        return detailDAO.selectByMem(id);
    }
}
