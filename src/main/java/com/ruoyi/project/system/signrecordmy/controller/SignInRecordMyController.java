package com.ruoyi.project.system.signrecordmy.controller;

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
import com.ruoyi.project.system.signrecordmy.domain.SignInRecordMy;
import com.ruoyi.project.system.signrecordmy.service.ISignInRecordMyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 管理签到Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/signrecordmy")
public class SignInRecordMyController extends BaseController
{
    private String prefix = "system/signrecordmy";

    @Autowired
    private ISignInRecordMyService signInRecordMyService;

    @RequiresPermissions("system:signrecordmy:view")
    @GetMapping()
    public String signrecordmy()
    {
        return prefix + "/signrecordmy";
    }

    /**
     * 查询管理签到列表
     */
    @RequiresPermissions("system:signrecordmy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SignInRecordMy signInRecordMy)
    {
        startPage();
        List<SignInRecordMy> list = signInRecordMyService.selectSignInRecordMyList(signInRecordMy);
        return getDataTable(list);
    }

    /**
     * 导出管理签到列表
     */
    @RequiresPermissions("system:signrecordmy:export")
    @Log(title = "管理签到", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SignInRecordMy signInRecordMy)
    {
        List<SignInRecordMy> list = signInRecordMyService.selectSignInRecordMyList(signInRecordMy);
        ExcelUtil<SignInRecordMy> util = new ExcelUtil<SignInRecordMy>(SignInRecordMy.class);
        return util.exportExcel(list, "管理签到数据");
    }

    /**
     * 新增管理签到
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存管理签到
     */
    @RequiresPermissions("system:signrecordmy:add")
    @Log(title = "管理签到", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SignInRecordMy signInRecordMy)
    {
        return toAjax(signInRecordMyService.insertSignInRecordMy(signInRecordMy));
    }

    /**
     * 修改管理签到
     */
    @RequiresPermissions("system:signrecordmy:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        SignInRecordMy signInRecordMy = signInRecordMyService.selectSignInRecordMyById(id);
        mmap.put("signInRecordMy", signInRecordMy);
        return prefix + "/edit";
    }

    /**
     * 修改保存管理签到
     */
    @RequiresPermissions("system:signrecordmy:edit")
    @Log(title = "管理签到", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SignInRecordMy signInRecordMy)
    {
        return toAjax(signInRecordMyService.updateSignInRecordMy(signInRecordMy));
    }

    /**
     * 删除管理签到
     */
    @RequiresPermissions("system:signrecordmy:remove")
    @Log(title = "管理签到", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(signInRecordMyService.deleteSignInRecordMyByIds(ids));
    }
}
