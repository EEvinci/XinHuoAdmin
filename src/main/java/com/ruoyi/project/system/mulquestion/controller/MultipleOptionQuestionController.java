package com.ruoyi.project.system.mulquestion.controller;

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
import com.ruoyi.project.system.mulquestion.domain.MultipleOptionQuestion;
import com.ruoyi.project.system.mulquestion.service.IMultipleOptionQuestionService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 管理多选题Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/mulquestion")
public class MultipleOptionQuestionController extends BaseController
{
    private String prefix = "system/mulquestion";

    @Autowired
    private IMultipleOptionQuestionService multipleOptionQuestionService;

    @RequiresPermissions("system:mulquestion:view")
    @GetMapping()
    public String mulquestion()
    {
        return prefix + "/mulquestion";
    }

    /**
     * 查询管理多选题列表
     */
    @RequiresPermissions("system:mulquestion:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MultipleOptionQuestion multipleOptionQuestion)
    {
        startPage();
        List<MultipleOptionQuestion> list = multipleOptionQuestionService.selectMultipleOptionQuestionList(multipleOptionQuestion);
        return getDataTable(list);
    }

    /**
     * 导出管理多选题列表
     */
    @RequiresPermissions("system:mulquestion:export")
    @Log(title = "管理多选题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MultipleOptionQuestion multipleOptionQuestion)
    {
        List<MultipleOptionQuestion> list = multipleOptionQuestionService.selectMultipleOptionQuestionList(multipleOptionQuestion);
        ExcelUtil<MultipleOptionQuestion> util = new ExcelUtil<MultipleOptionQuestion>(MultipleOptionQuestion.class);
        return util.exportExcel(list, "管理多选题数据");
    }

    /**
     * 新增管理多选题
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存管理多选题
     */
    @RequiresPermissions("system:mulquestion:add")
    @Log(title = "管理多选题", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MultipleOptionQuestion multipleOptionQuestion)
    {
        return toAjax(multipleOptionQuestionService.insertMultipleOptionQuestion(multipleOptionQuestion));
    }

    /**
     * 修改管理多选题
     */
    @RequiresPermissions("system:mulquestion:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        MultipleOptionQuestion multipleOptionQuestion = multipleOptionQuestionService.selectMultipleOptionQuestionById(id);
        mmap.put("multipleOptionQuestion", multipleOptionQuestion);
        return prefix + "/edit";
    }

    /**
     * 修改保存管理多选题
     */
    @RequiresPermissions("system:mulquestion:edit")
    @Log(title = "管理多选题", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MultipleOptionQuestion multipleOptionQuestion)
    {
        return toAjax(multipleOptionQuestionService.updateMultipleOptionQuestion(multipleOptionQuestion));
    }

    /**
     * 删除管理多选题
     */
    @RequiresPermissions("system:mulquestion:remove")
    @Log(title = "管理多选题", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(multipleOptionQuestionService.deleteMultipleOptionQuestionByIds(ids));
    }
}
