package com.ruoyi.project.system.singlequestion.controller;

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
import com.ruoyi.project.system.singlequestion.domain.SingleOptionQuestion;
import com.ruoyi.project.system.singlequestion.service.ISingleOptionQuestionService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 单选题管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/singlequestion")
public class SingleOptionQuestionController extends BaseController
{
    private String prefix = "system/singlequestion";

    @Autowired
    private ISingleOptionQuestionService singleOptionQuestionService;

    @RequiresPermissions("system:singlequestion:view")
    @GetMapping()
    public String singlequestion()
    {
        return prefix + "/singlequestion";
    }

    /**
     * 查询单选题管理列表
     */
    @RequiresPermissions("system:singlequestion:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SingleOptionQuestion singleOptionQuestion)
    {
        startPage();
        List<SingleOptionQuestion> list = singleOptionQuestionService.selectSingleOptionQuestionList(singleOptionQuestion);
        return getDataTable(list);
    }

    /**
     * 导出单选题管理列表
     */
    @RequiresPermissions("system:singlequestion:export")
    @Log(title = "单选题管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SingleOptionQuestion singleOptionQuestion)
    {
        List<SingleOptionQuestion> list = singleOptionQuestionService.selectSingleOptionQuestionList(singleOptionQuestion);
        ExcelUtil<SingleOptionQuestion> util = new ExcelUtil<SingleOptionQuestion>(SingleOptionQuestion.class);
        return util.exportExcel(list, "单选题管理数据");
    }

    /**
     * 新增单选题管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存单选题管理
     */
    @RequiresPermissions("system:singlequestion:add")
    @Log(title = "单选题管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SingleOptionQuestion singleOptionQuestion)
    {
        return toAjax(singleOptionQuestionService.insertSingleOptionQuestion(singleOptionQuestion));
    }

    /**
     * 修改单选题管理
     */
    @RequiresPermissions("system:singlequestion:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        SingleOptionQuestion singleOptionQuestion = singleOptionQuestionService.selectSingleOptionQuestionById(id);
        mmap.put("singleOptionQuestion", singleOptionQuestion);
        return prefix + "/edit";
    }

    /**
     * 修改保存单选题管理
     */
    @RequiresPermissions("system:singlequestion:edit")
    @Log(title = "单选题管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SingleOptionQuestion singleOptionQuestion)
    {
        return toAjax(singleOptionQuestionService.updateSingleOptionQuestion(singleOptionQuestion));
    }

    /**
     * 删除单选题管理
     */
    @RequiresPermissions("system:singlequestion:remove")
    @Log(title = "单选题管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(singleOptionQuestionService.deleteSingleOptionQuestionByIds(ids));
    }
}
