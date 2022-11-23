package com.ruoyi.project.system.news.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.news.domain.OrganizationNews;
import com.ruoyi.project.system.news.service.IOrganizationNewsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 组织咨询管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/news")
public class OrganizationNewsController extends BaseController
{
    private String prefix = "system/news";

    @Autowired
    private IOrganizationNewsService organizationNewsService;

    @RequiresPermissions("system:news:view")
    @GetMapping()
    public String news()
    {
        return prefix + "/news";
    }

    /**
     * 查询组织咨询管理列表
     */
    @RequiresPermissions("system:news:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrganizationNews organizationNews)
    {
        startPage();
        List<OrganizationNews> list = organizationNewsService.selectOrganizationNewsList(organizationNews);
        return getDataTable(list);
    }

    /**
     * 导出组织咨询管理列表
     */
    @RequiresPermissions("system:news:export")
    @Log(title = "组织咨询管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrganizationNews organizationNews)
    {
        List<OrganizationNews> list = organizationNewsService.selectOrganizationNewsList(organizationNews);
        ExcelUtil<OrganizationNews> util = new ExcelUtil<OrganizationNews>(OrganizationNews.class);
        return util.exportExcel(list, "组织咨询管理数据");
    }

    /**
     * 新增组织咨询管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存组织咨询管理
     */
    @RequiresPermissions("system:news:add")
    @Log(title = "组织咨询管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrganizationNews organizationNews)
    {
        return toAjax(organizationNewsService.insertOrganizationNews(organizationNews));
    }

    /**
     * 修改组织咨询管理
     */
    @RequiresPermissions("system:news:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        OrganizationNews organizationNews = organizationNewsService.selectOrganizationNewsById(id);
        mmap.put("organizationNews", organizationNews);
        return prefix + "/edit";
    }

    /**
     * 修改保存组织咨询管理
     */
    @RequiresPermissions("system:news:edit")
    @Log(title = "组织咨询管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrganizationNews organizationNews)
    {
        return toAjax(organizationNewsService.updateOrganizationNews(organizationNews));
    }

    /**
     * 删除组织咨询管理
     */
    @RequiresPermissions("system:news:remove")
    @Log(title = "组织咨询管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(organizationNewsService.deleteOrganizationNewsByIds(ids));
    }
}
