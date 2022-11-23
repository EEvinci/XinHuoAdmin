package com.ruoyi.project.system.news.service;

import java.util.List;
import com.ruoyi.project.system.news.domain.OrganizationNews;

/**
 * 组织咨询管理Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface IOrganizationNewsService 
{
    /**
     * 查询组织咨询管理
     * 
     * @param id 组织咨询管理主键
     * @return 组织咨询管理
     */
    public OrganizationNews selectOrganizationNewsById(String id);

    /**
     * 查询组织咨询管理列表
     * 
     * @param organizationNews 组织咨询管理
     * @return 组织咨询管理集合
     */
    public List<OrganizationNews> selectOrganizationNewsList(OrganizationNews organizationNews);

    /**
     * 新增组织咨询管理
     * 
     * @param organizationNews 组织咨询管理
     * @return 结果
     */
    public int insertOrganizationNews(OrganizationNews organizationNews);

    /**
     * 修改组织咨询管理
     * 
     * @param organizationNews 组织咨询管理
     * @return 结果
     */
    public int updateOrganizationNews(OrganizationNews organizationNews);

    /**
     * 批量删除组织咨询管理
     * 
     * @param ids 需要删除的组织咨询管理主键集合
     * @return 结果
     */
    public int deleteOrganizationNewsByIds(String ids);

    /**
     * 删除组织咨询管理信息
     * 
     * @param id 组织咨询管理主键
     * @return 结果
     */
    public int deleteOrganizationNewsById(String id);
}
