package com.zhou.blog.service;

import com.zhou.blog.vo.Result;
import com.zhou.blog.vo.params.PageParams;

public interface ArticleService {

    /*
    * 分页查询 文章列表
    * */

    Result listArticle(PageParams pageParams);
}
