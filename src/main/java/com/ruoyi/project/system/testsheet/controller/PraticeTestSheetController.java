package com.ruoyi.project.system.testsheet.controller;

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
import com.ruoyi.project.system.testsheet.domain.PraticeTestSheet;
import com.ruoyi.project.system.testsheet.service.IPraticeTestSheetService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 练习试卷管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-21
 */
@Controller
@RequestMapping("/system/testsheet")
public class PraticeTestSheetController extends BaseController
{
    private String prefix = "system/testsheet";

    @Autowired
    private IPraticeTestSheetService praticeTestSheetService;

    @RequiresPermissions("system:testsheet:view")
    @GetMapping()
    public String testsheet()
    {
        return prefix + "/testsheet";
    }

    /**
     * 查询练习试卷管理列表
     */
    @RequiresPermissions("system:testsheet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PraticeTestSheet praticeTestSheet)
    {
        startPage();
        List<PraticeTestSheet> list = praticeTestSheetService.selectPraticeTestSheetList(praticeTestSheet);
        return getDataTable(list);
    }

    /**
     * 导出练习试卷管理列表
     */
    @RequiresPermissions("system:testsheet:export")
    @Log(title = "练习试卷管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PraticeTestSheet praticeTestSheet)
    {
        List<PraticeTestSheet> list = praticeTestSheetService.selectPraticeTestSheetList(praticeTestSheet);
        ExcelUtil<PraticeTestSheet> util = new ExcelUtil<PraticeTestSheet>(PraticeTestSheet.class);
        return util.exportExcel(list, "练习试卷管理数据");
    }

    /**
     * 新增练习试卷管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存练习试卷管理
     */
    @RequiresPermissions("system:testsheet:add")
    @Log(title = "练习试卷管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PraticeTestSheet praticeTestSheet)
    {
        return toAjax(praticeTestSheetService.insertPraticeTestSheet(praticeTestSheet));
    }

    /**
     * 修改练习试卷管理
     */
    @RequiresPermissions("system:testsheet:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        PraticeTestSheet praticeTestSheet = praticeTestSheetService.selectPraticeTestSheetById(id);
        mmap.put("praticeTestSheet", praticeTestSheet);
        return prefix + "/edit";
    }

    /**
     * 修改保存练习试卷管理
     */
    @RequiresPermissions("system:testsheet:edit")
    @Log(title = "练习试卷管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PraticeTestSheet praticeTestSheet)
    {
        return toAjax(praticeTestSheetService.updatePraticeTestSheet(praticeTestSheet));
    }

    /**
     * 删除练习试卷管理
     */
    @RequiresPermissions("system:testsheet:remove")
    @Log(title = "练习试卷管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(praticeTestSheetService.deletePraticeTestSheetByIds(ids));
    }
}
