package com.ruoyi.project.system.fillinquestion.controller;

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
import com.ruoyi.project.system.fillinquestion.domain.FillInQuestion;
import com.ruoyi.project.system.fillinquestion.service.IFillInQuestionService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 管理填空题Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/fillinquestion")
public class FillInQuestionController extends BaseController
{
    private String prefix = "system/fillinquestion";

    @Autowired
    private IFillInQuestionService fillInQuestionService;

    @RequiresPermissions("system:fillinquestion:view")
    @GetMapping()
    public String fillinquestion()
    {
        return prefix + "/fillinquestion";
    }

    /**
     * 查询管理填空题列表
     */
    @RequiresPermissions("system:fillinquestion:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FillInQuestion fillInQuestion)
    {
        startPage();
        List<FillInQuestion> list = fillInQuestionService.selectFillInQuestionList(fillInQuestion);
        return getDataTable(list);
    }

    /**
     * 导出管理填空题列表
     */
    @RequiresPermissions("system:fillinquestion:export")
    @Log(title = "管理填空题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FillInQuestion fillInQuestion)
    {
        List<FillInQuestion> list = fillInQuestionService.selectFillInQuestionList(fillInQuestion);
        ExcelUtil<FillInQuestion> util = new ExcelUtil<FillInQuestion>(FillInQuestion.class);
        return util.exportExcel(list, "管理填空题数据");
    }

    /**
     * 新增管理填空题
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存管理填空题
     */
    @RequiresPermissions("system:fillinquestion:add")
    @Log(title = "管理填空题", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FillInQuestion fillInQuestion)
    {
        return toAjax(fillInQuestionService.insertFillInQuestion(fillInQuestion));
    }

    /**
     * 修改管理填空题
     */
    @RequiresPermissions("system:fillinquestion:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        FillInQuestion fillInQuestion = fillInQuestionService.selectFillInQuestionById(id);
        mmap.put("fillInQuestion", fillInQuestion);
        return prefix + "/edit";
    }

    /**
     * 修改保存管理填空题
     */
    @RequiresPermissions("system:fillinquestion:edit")
    @Log(title = "管理填空题", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FillInQuestion fillInQuestion)
    {
        return toAjax(fillInQuestionService.updateFillInQuestion(fillInQuestion));
    }

    /**
     * 删除管理填空题
     */
    @RequiresPermissions("system:fillinquestion:remove")
    @Log(title = "管理填空题", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fillInQuestionService.deleteFillInQuestionByIds(ids));
    }
}
