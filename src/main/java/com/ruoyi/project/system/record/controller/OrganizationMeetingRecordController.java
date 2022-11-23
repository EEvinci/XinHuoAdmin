package com.ruoyi.project.system.record.controller;

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
import com.ruoyi.project.system.record.domain.OrganizationMeetingRecord;
import com.ruoyi.project.system.record.service.IOrganizationMeetingRecordService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 会议管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/record")
public class OrganizationMeetingRecordController extends BaseController
{
    private String prefix = "system/record";

    @Autowired
    private IOrganizationMeetingRecordService organizationMeetingRecordService;

    @RequiresPermissions("system:record:view")
    @GetMapping()
    public String record()
    {
        return prefix + "/record";
    }

    /**
     * 查询会议管理列表
     */
    @RequiresPermissions("system:record:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrganizationMeetingRecord organizationMeetingRecord)
    {
        startPage();
        List<OrganizationMeetingRecord> list = organizationMeetingRecordService.selectOrganizationMeetingRecordList(organizationMeetingRecord);
        return getDataTable(list);
    }

    /**
     * 导出会议管理列表
     */
    @RequiresPermissions("system:record:export")
    @Log(title = "会议管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrganizationMeetingRecord organizationMeetingRecord)
    {
        List<OrganizationMeetingRecord> list = organizationMeetingRecordService.selectOrganizationMeetingRecordList(organizationMeetingRecord);
        ExcelUtil<OrganizationMeetingRecord> util = new ExcelUtil<OrganizationMeetingRecord>(OrganizationMeetingRecord.class);
        return util.exportExcel(list, "会议管理数据");
    }

    /**
     * 新增会议管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存会议管理
     */
    @RequiresPermissions("system:record:add")
    @Log(title = "会议管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrganizationMeetingRecord organizationMeetingRecord)
    {
        return toAjax(organizationMeetingRecordService.insertOrganizationMeetingRecord(organizationMeetingRecord));
    }

    /**
     * 修改会议管理
     */
    @RequiresPermissions("system:record:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        OrganizationMeetingRecord organizationMeetingRecord = organizationMeetingRecordService.selectOrganizationMeetingRecordById(id);
        mmap.put("organizationMeetingRecord", organizationMeetingRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存会议管理
     */
    @RequiresPermissions("system:record:edit")
    @Log(title = "会议管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrganizationMeetingRecord organizationMeetingRecord)
    {
        return toAjax(organizationMeetingRecordService.updateOrganizationMeetingRecord(organizationMeetingRecord));
    }

    /**
     * 删除会议管理
     */
    @RequiresPermissions("system:record:remove")
    @Log(title = "会议管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(organizationMeetingRecordService.deleteOrganizationMeetingRecordByIds(ids));
    }
}
