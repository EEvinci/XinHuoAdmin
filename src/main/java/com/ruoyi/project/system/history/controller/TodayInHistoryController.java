package com.ruoyi.project.system.history.controller;

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
import com.ruoyi.project.system.history.domain.TodayInHistory;
import com.ruoyi.project.system.history.service.ITodayInHistoryService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 党史管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/history")
public class TodayInHistoryController extends BaseController
{
    private String prefix = "system/history";

    @Autowired
    private ITodayInHistoryService todayInHistoryService;

    @RequiresPermissions("system:history:view")
    @GetMapping()
    public String history()
    {
        return prefix + "/history";
    }

    /**
     * 查询党史管理列表
     */
    @RequiresPermissions("system:history:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TodayInHistory todayInHistory)
    {
        startPage();
        List<TodayInHistory> list = todayInHistoryService.selectTodayInHistoryList(todayInHistory);
        return getDataTable(list);
    }

    /**
     * 导出党史管理列表
     */
    @RequiresPermissions("system:history:export")
    @Log(title = "党史管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TodayInHistory todayInHistory)
    {
        List<TodayInHistory> list = todayInHistoryService.selectTodayInHistoryList(todayInHistory);
        ExcelUtil<TodayInHistory> util = new ExcelUtil<TodayInHistory>(TodayInHistory.class);
        return util.exportExcel(list, "党史管理数据");
    }

    /**
     * 新增党史管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存党史管理
     */
    @RequiresPermissions("system:history:add")
    @Log(title = "党史管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TodayInHistory todayInHistory)
    {
        return toAjax(todayInHistoryService.insertTodayInHistory(todayInHistory));
    }

    /**
     * 修改党史管理
     */
    @RequiresPermissions("system:history:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        TodayInHistory todayInHistory = todayInHistoryService.selectTodayInHistoryById(id);
        mmap.put("todayInHistory", todayInHistory);
        return prefix + "/edit";
    }

    /**
     * 修改保存党史管理
     */
    @RequiresPermissions("system:history:edit")
    @Log(title = "党史管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TodayInHistory todayInHistory)
    {
        return toAjax(todayInHistoryService.updateTodayInHistory(todayInHistory));
    }

    /**
     * 删除党史管理
     */
    @RequiresPermissions("system:history:remove")
    @Log(title = "党史管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(todayInHistoryService.deleteTodayInHistoryByIds(ids));
    }
}
