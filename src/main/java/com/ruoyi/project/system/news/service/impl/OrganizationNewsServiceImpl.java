package com.ruoyi.project.system.news.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.news.mapper.OrganizationNewsMapper;
import com.ruoyi.project.system.news.domain.OrganizationNews;
import com.ruoyi.project.system.news.service.IOrganizationNewsService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 组织咨询管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class OrganizationNewsServiceImpl implements IOrganizationNewsService 
{
    @Autowired
    private OrganizationNewsMapper organizationNewsMapper;

    /**
     * 查询组织咨询管理
     * 
     * @param id 组织咨询管理主键
     * @return 组织咨询管理
     */
    @Override
    public OrganizationNews selectOrganizationNewsById(String id)
    {
        return organizationNewsMapper.selectOrganizationNewsById(id);
    }

    /**
     * 查询组织咨询管理列表
     * 
     * @param organizationNews 组织咨询管理
     * @return 组织咨询管理
     */
    @Override
    public List<OrganizationNews> selectOrganizationNewsList(OrganizationNews organizationNews)
    {
        return organizationNewsMapper.selectOrganizationNewsList(organizationNews);
    }

    /**
     * 新增组织咨询管理
     * 
     * @param organizationNews 组织咨询管理
     * @return 结果
     */
    @Override
    public int insertOrganizationNews(OrganizationNews organizationNews)
    {
        return organizationNewsMapper.insertOrganizationNews(organizationNews);
    }

    /**
     * 修改组织咨询管理
     * 
     * @param organizationNews 组织咨询管理
     * @return 结果
     */
    @Override
    public int updateOrganizationNews(OrganizationNews organizationNews)
    {
        return organizationNewsMapper.updateOrganizationNews(organizationNews);
    }

    /**
     * 批量删除组织咨询管理
     * 
     * @param ids 需要删除的组织咨询管理主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationNewsByIds(String ids)
    {
        return organizationNewsMapper.deleteOrganizationNewsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除组织咨询管理信息
     * 
     * @param id 组织咨询管理主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationNewsById(String id)
    {
        return organizationNewsMapper.deleteOrganizationNewsById(id);
    }
}
