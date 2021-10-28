package com.zhou.blog.controller;


import com.zhou.blog.service.ArticleService;
import com.zhou.blog.vo.Result;
import com.zhou.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/*
*  json 数据交互 resetcontroller
* */
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    /*
    *  首页文章列表
    * @pageparams
    * */
    @PostMapping
    public Result articlesList (@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

}
