package com.taotao.admin.controller;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexManagerController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/index/importitem")
    @ResponseBody
    public TaotaoResult importItem() {
        TaotaoResult result = searchService.importItemToIndex();
        return result;
    }
}
