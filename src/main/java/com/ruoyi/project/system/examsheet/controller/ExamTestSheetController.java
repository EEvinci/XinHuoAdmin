package com.ruoyi.project.system.examsheet.controller;

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
import com.ruoyi.project.system.examsheet.domain.ExamTestSheet;
import com.ruoyi.project.system.examsheet.service.IExamTestSheetService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 考卷管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-21
 */
@Controller
@RequestMapping("/system/examsheet")
public class ExamTestSheetController extends BaseController
{
    private String prefix = "system/examsheet";

    @Autowired
    private IExamTestSheetService examTestSheetService;

    @RequiresPermissions("system:examsheet:view")
    @GetMapping()
    public String examsheet()
    {
        return prefix + "/examsheet";
    }

    /**
     * 查询考卷管理列表
     */
    @RequiresPermissions("system:examsheet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ExamTestSheet examTestSheet)
    {
        startPage();
        List<ExamTestSheet> list = examTestSheetService.selectExamTestSheetList(examTestSheet);
        return getDataTable(list);
    }

    /**
     * 导出考卷管理列表
     */
    @RequiresPermissions("system:examsheet:export")
    @Log(title = "考卷管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ExamTestSheet examTestSheet)
    {
        List<ExamTestSheet> list = examTestSheetService.selectExamTestSheetList(examTestSheet);
        ExcelUtil<ExamTestSheet> util = new ExcelUtil<ExamTestSheet>(ExamTestSheet.class);
        return util.exportExcel(list, "考卷管理数据");
    }

    /**
     * 新增考卷管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存考卷管理
     */
    @RequiresPermissions("system:examsheet:add")
    @Log(title = "考卷管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ExamTestSheet examTestSheet)
    {
        return toAjax(examTestSheetService.insertExamTestSheet(examTestSheet));
    }

    /**
     * 修改考卷管理
     */
    @RequiresPermissions("system:examsheet:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        ExamTestSheet examTestSheet = examTestSheetService.selectExamTestSheetById(id);
        mmap.put("examTestSheet", examTestSheet);
        return prefix + "/edit";
    }

    /**
     * 修改保存考卷管理
     */
    @RequiresPermissions("system:examsheet:edit")
    @Log(title = "考卷管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ExamTestSheet examTestSheet)
    {
        return toAjax(examTestSheetService.updateExamTestSheet(examTestSheet));
    }

    /**
     * 删除考卷管理
     */
    @RequiresPermissions("system:examsheet:remove")
    @Log(title = "考卷管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(examTestSheetService.deleteExamTestSheetByIds(ids));
    }
}
