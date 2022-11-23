package com.ruoyi.project.system.judgequestion.controller;

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
import com.ruoyi.project.system.judgequestion.domain.JudgeQuestion;
import com.ruoyi.project.system.judgequestion.service.IJudgeQuestionService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 判断题管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/judgequestion")
public class JudgeQuestionController extends BaseController
{
    private String prefix = "system/judgequestion";

    @Autowired
    private IJudgeQuestionService judgeQuestionService;

    @RequiresPermissions("system:judgequestion:view")
    @GetMapping()
    public String judgequestion()
    {
        return prefix + "/judgequestion";
    }

    /**
     * 查询判断题管理列表
     */
    @RequiresPermissions("system:judgequestion:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JudgeQuestion judgeQuestion)
    {
        startPage();
        List<JudgeQuestion> list = judgeQuestionService.selectJudgeQuestionList(judgeQuestion);
        return getDataTable(list);
    }

    /**
     * 导出判断题管理列表
     */
    @RequiresPermissions("system:judgequestion:export")
    @Log(title = "判断题管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JudgeQuestion judgeQuestion)
    {
        List<JudgeQuestion> list = judgeQuestionService.selectJudgeQuestionList(judgeQuestion);
        ExcelUtil<JudgeQuestion> util = new ExcelUtil<JudgeQuestion>(JudgeQuestion.class);
        return util.exportExcel(list, "判断题管理数据");
    }

    /**
     * 新增判断题管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存判断题管理
     */
    @RequiresPermissions("system:judgequestion:add")
    @Log(title = "判断题管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JudgeQuestion judgeQuestion)
    {
        return toAjax(judgeQuestionService.insertJudgeQuestion(judgeQuestion));
    }

    /**
     * 修改判断题管理
     */
    @RequiresPermissions("system:judgequestion:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        JudgeQuestion judgeQuestion = judgeQuestionService.selectJudgeQuestionById(id);
        mmap.put("judgeQuestion", judgeQuestion);
        return prefix + "/edit";
    }

    /**
     * 修改保存判断题管理
     */
    @RequiresPermissions("system:judgequestion:edit")
    @Log(title = "判断题管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JudgeQuestion judgeQuestion)
    {
        return toAjax(judgeQuestionService.updateJudgeQuestion(judgeQuestion));
    }

    /**
     * 删除判断题管理
     */
    @RequiresPermissions("system:judgequestion:remove")
    @Log(title = "判断题管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(judgeQuestionService.deleteJudgeQuestionByIds(ids));
    }
}
