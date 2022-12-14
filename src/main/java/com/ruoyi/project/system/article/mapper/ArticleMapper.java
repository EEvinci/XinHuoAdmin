package com.ruoyi.project.system.article.mapper;

import java.util.List;
import com.ruoyi.project.system.article.domain.Article;

/**
 * 文章管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface ArticleMapper 
{
    /**
     * 查询文章管理
     * 
     * @param id 文章管理主键
     * @return 文章管理
     */
    public Article selectArticleById(String id);

    /**
     * 查询文章管理列表
     * 
     * @param article 文章管理
     * @return 文章管理集合
     */
    public List<Article> selectArticleList(Article article);

    /**
     * 新增文章管理
     * 
     * @param article 文章管理
     * @return 结果
     */
    public int insertArticle(Article article);

    /**
     * 修改文章管理
     * 
     * @param article 文章管理
     * @return 结果
     */
    public int updateArticle(Article article);

    /**
     * 删除文章管理
     * 
     * @param id 文章管理主键
     * @return 结果
     */
    public int deleteArticleById(String id);

    /**
     * 批量删除文章管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArticleByIds(String[] ids);
}
