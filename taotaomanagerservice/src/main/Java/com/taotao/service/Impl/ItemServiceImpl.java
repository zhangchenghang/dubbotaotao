package com.taotao.service.Impl;

import com.taotao.service.ItemService;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem GetItemByItemID(long itemid) {
        TbItem item = tbItemMapper.selectByPrimaryKey(itemid);
        return item;
    }
}
