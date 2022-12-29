package com.ruoyi.project.system.test.controller;

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
import com.ruoyi.project.system.test.domain.Test;
import com.ruoyi.project.system.test.service.ITestService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2022-12-14
 */
@Controller
@RequestMapping("/system/test")
public class TestController extends BaseController
{
    private String prefix = "system/test";

    @Autowired
    private ITestService testService;

    @RequiresPermissions("system:test:view")
    @GetMapping()
    public String test()
    {
        return prefix + "/test";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:test:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Test test)
    {
        startPage();
        List<Test> list = testService.selectTestList(test);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:test:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Test test)
    {
        List<Test> list = testService.selectTestList(test);
        ExcelUtil<Test> util = new ExcelUtil<Test>(Test.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:test:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Test test)
    {
        return toAjax(testService.insertTest(test));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:test:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Test test = testService.selectTestById(id);
        mmap.put("test", test);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:test:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Test test)
    {
        return toAjax(testService.updateTest(test));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:test:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testService.deleteTestByIds(ids));
    }
}
