package com.ruoyi.project.system.testanswer.controller;

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
import com.ruoyi.project.system.testanswer.domain.PracticeAnswerSheet;
import com.ruoyi.project.system.testanswer.service.IPracticeAnswerSheetService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 练习答卷管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/testanswer")
public class PracticeAnswerSheetController extends BaseController
{
    private String prefix = "system/testanswer";

    @Autowired
    private IPracticeAnswerSheetService practiceAnswerSheetService;

    @RequiresPermissions("system:testanswer:view")
    @GetMapping()
    public String testanswer()
    {
        return prefix + "/testanswer";
    }

    /**
     * 查询练习答卷管理列表
     */
    @RequiresPermissions("system:testanswer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PracticeAnswerSheet practiceAnswerSheet)
    {
        startPage();
        List<PracticeAnswerSheet> list = practiceAnswerSheetService.selectPracticeAnswerSheetList(practiceAnswerSheet);
        return getDataTable(list);
    }

    /**
     * 导出练习答卷管理列表
     */
    @RequiresPermissions("system:testanswer:export")
    @Log(title = "练习答卷管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PracticeAnswerSheet practiceAnswerSheet)
    {
        List<PracticeAnswerSheet> list = practiceAnswerSheetService.selectPracticeAnswerSheetList(practiceAnswerSheet);
        ExcelUtil<PracticeAnswerSheet> util = new ExcelUtil<PracticeAnswerSheet>(PracticeAnswerSheet.class);
        return util.exportExcel(list, "练习答卷管理数据");
    }

    /**
     * 新增练习答卷管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存练习答卷管理
     */
    @RequiresPermissions("system:testanswer:add")
    @Log(title = "练习答卷管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PracticeAnswerSheet practiceAnswerSheet)
    {
        return toAjax(practiceAnswerSheetService.insertPracticeAnswerSheet(practiceAnswerSheet));
    }

    /**
     * 修改练习答卷管理
     */
    @RequiresPermissions("system:testanswer:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        PracticeAnswerSheet practiceAnswerSheet = practiceAnswerSheetService.selectPracticeAnswerSheetById(id);
        mmap.put("practiceAnswerSheet", practiceAnswerSheet);
        return prefix + "/edit";
    }

    /**
     * 修改保存练习答卷管理
     */
    @RequiresPermissions("system:testanswer:edit")
    @Log(title = "练习答卷管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PracticeAnswerSheet practiceAnswerSheet)
    {
        return toAjax(practiceAnswerSheetService.updatePracticeAnswerSheet(practiceAnswerSheet));
    }

    /**
     * 删除练习答卷管理
     */
    @RequiresPermissions("system:testanswer:remove")
    @Log(title = "练习答卷管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(practiceAnswerSheetService.deletePracticeAnswerSheetByIds(ids));
    }
}
