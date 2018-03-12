package com.taotao.admin.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping("/item/{itemid}")
    @ResponseBody
    public TbItem GetItemByID(@PathVariable("itemid") long itemid) {
        return itemService.GetItemByItemID(itemid);
    }
}
