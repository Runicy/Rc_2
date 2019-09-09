package com.ssm_maven.service.impl;

import com.ssm_maven.dao.ItemsMapper;
import com.ssm_maven.pojo.Items;
import com.ssm_maven.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
