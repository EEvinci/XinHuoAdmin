package com.ruoyi.project.system.swear.controller;

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
import com.ruoyi.project.system.swear.domain.SwearRecord;
import com.ruoyi.project.system.swear.service.ISwearRecordService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 宣誓管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/swear")
public class SwearRecordController extends BaseController
{
    private String prefix = "system/swear";

    @Autowired
    private ISwearRecordService swearRecordService;

    @RequiresPermissions("system:swear:view")
    @GetMapping()
    public String swear()
    {
        return prefix + "/swear";
    }

    /**
     * 查询宣誓管理列表
     */
    @RequiresPermissions("system:swear:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SwearRecord swearRecord)
    {
        startPage();
        List<SwearRecord> list = swearRecordService.selectSwearRecordList(swearRecord);
        return getDataTable(list);
    }

    /**
     * 导出宣誓管理列表
     */
    @RequiresPermissions("system:swear:export")
    @Log(title = "宣誓管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SwearRecord swearRecord)
    {
        List<SwearRecord> list = swearRecordService.selectSwearRecordList(swearRecord);
        ExcelUtil<SwearRecord> util = new ExcelUtil<SwearRecord>(SwearRecord.class);
        return util.exportExcel(list, "宣誓管理数据");
    }

    /**
     * 新增宣誓管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存宣誓管理
     */
    @RequiresPermissions("system:swear:add")
    @Log(title = "宣誓管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SwearRecord swearRecord)
    {
        return toAjax(swearRecordService.insertSwearRecord(swearRecord));
    }

    /**
     * 修改宣誓管理
     */
    @RequiresPermissions("system:swear:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        SwearRecord swearRecord = swearRecordService.selectSwearRecordById(id);
        mmap.put("swearRecord", swearRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存宣誓管理
     */
    @RequiresPermissions("system:swear:edit")
    @Log(title = "宣誓管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SwearRecord swearRecord)
    {
        return toAjax(swearRecordService.updateSwearRecord(swearRecord));
    }

    /**
     * 删除宣誓管理
     */
    @RequiresPermissions("system:swear:remove")
    @Log(title = "宣誓管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(swearRecordService.deleteSwearRecordByIds(ids));
    }
}
