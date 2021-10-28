package com.zhou.blog.service.impl;

import com.zhou.blog.dao.mapper.TagMapper;
import com.zhou.blog.dao.pojo.Tag;
import com.zhou.blog.service.TagService;
import com.zhou.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<TagVo> findTagsByArticleId(Long articleId) {
        // mybatis plus 无法多表查询
        List<Tag> tags = tagMapper.findTagsByArticleId(articleId);

        return copyList(tags);
    }

    public TagVo copy (Tag tag) {
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag, tagVo);
//        tagVo.setId(Long.valueOf(String.valueOf(tag.getId())));
        return tagVo;
    }
    public List<TagVo> copyList(List<Tag> tagList){
        List<TagVo> tagVoList = new ArrayList<>();
        for (Tag tag : tagList) {
            tagVoList.add(copy(tag));
        }
        return tagVoList;
    }
}
