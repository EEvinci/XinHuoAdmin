package com.ruoyi.project.system.examanswer.controller;

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
import com.ruoyi.project.system.examanswer.domain.ExamAnswerSheet;
import com.ruoyi.project.system.examanswer.service.IExamAnswerSheetService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 答卷管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/examanswer")
public class ExamAnswerSheetController extends BaseController
{
    private String prefix = "system/examanswer";

    @Autowired
    private IExamAnswerSheetService examAnswerSheetService;

    @RequiresPermissions("system:examanswer:view")
    @GetMapping()
    public String examanswer()
    {
        return prefix + "/examanswer";
    }

    /**
     * 查询答卷管理列表
     */
    @RequiresPermissions("system:examanswer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ExamAnswerSheet examAnswerSheet)
    {
        startPage();
        List<ExamAnswerSheet> list = examAnswerSheetService.selectExamAnswerSheetList(examAnswerSheet);
        return getDataTable(list);
    }

    /**
     * 导出答卷管理列表
     */
    @RequiresPermissions("system:examanswer:export")
    @Log(title = "答卷管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ExamAnswerSheet examAnswerSheet)
    {
        List<ExamAnswerSheet> list = examAnswerSheetService.selectExamAnswerSheetList(examAnswerSheet);
        ExcelUtil<ExamAnswerSheet> util = new ExcelUtil<ExamAnswerSheet>(ExamAnswerSheet.class);
        return util.exportExcel(list, "答卷管理数据");
    }

    /**
     * 新增答卷管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存答卷管理
     */
    @RequiresPermissions("system:examanswer:add")
    @Log(title = "答卷管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ExamAnswerSheet examAnswerSheet)
    {
        return toAjax(examAnswerSheetService.insertExamAnswerSheet(examAnswerSheet));
    }

    /**
     * 修改答卷管理
     */
    @RequiresPermissions("system:examanswer:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        ExamAnswerSheet examAnswerSheet = examAnswerSheetService.selectExamAnswerSheetById(id);
        mmap.put("examAnswerSheet", examAnswerSheet);
        return prefix + "/edit";
    }

    /**
     * 修改保存答卷管理
     */
    @RequiresPermissions("system:examanswer:edit")
    @Log(title = "答卷管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ExamAnswerSheet examAnswerSheet)
    {
        return toAjax(examAnswerSheetService.updateExamAnswerSheet(examAnswerSheet));
    }

    /**
     * 删除答卷管理
     */
    @RequiresPermissions("system:examanswer:remove")
    @Log(title = "答卷管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(examAnswerSheetService.deleteExamAnswerSheetByIds(ids));
    }
}
