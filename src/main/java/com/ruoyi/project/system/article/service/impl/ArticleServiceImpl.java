package com.ruoyi.project.system.article.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.article.mapper.ArticleMapper;
import com.ruoyi.project.system.article.domain.Article;
import com.ruoyi.project.system.article.service.IArticleService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 文章管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class ArticleServiceImpl implements IArticleService 
{
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 查询文章管理
     * 
     * @param id 文章管理主键
     * @return 文章管理
     */
    @Override
    public Article selectArticleById(String id)
    {
        return articleMapper.selectArticleById(id);
    }

    /**
     * 查询文章管理列表
     * 
     * @param article 文章管理
     * @return 文章管理
     */
    @Override
    public List<Article> selectArticleList(Article article)
    {
        return articleMapper.selectArticleList(article);
    }

    /**
     * 新增文章管理
     * 
     * @param article 文章管理
     * @return 结果
     */
    @Override
    public int insertArticle(Article article)
    {
        return articleMapper.insertArticle(article);
    }

    /**
     * 修改文章管理
     * 
     * @param article 文章管理
     * @return 结果
     */
    @Override
    public int updateArticle(Article article)
    {
        return articleMapper.updateArticle(article);
    }

    /**
     * 批量删除文章管理
     * 
     * @param ids 需要删除的文章管理主键
     * @return 结果
     */
    @Override
    public int deleteArticleByIds(String ids)
    {
        return articleMapper.deleteArticleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除文章管理信息
     * 
     * @param id 文章管理主键
     * @return 结果
     */
    @Override
    public int deleteArticleById(String id)
    {
        return articleMapper.deleteArticleById(id);
    }
}
