package com.ruoyi.project.system.notification.controller;

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
import com.ruoyi.project.system.notification.domain.MessageNotification;
import com.ruoyi.project.system.notification.service.IMessageNotificationService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 管理通知Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/notification")
public class MessageNotificationController extends BaseController
{
    private String prefix = "system/notification";

    @Autowired
    private IMessageNotificationService messageNotificationService;

    @RequiresPermissions("system:notification:view")
    @GetMapping()
    public String notification()
    {
        return prefix + "/notification";
    }

    /**
     * 查询管理通知列表
     */
    @RequiresPermissions("system:notification:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MessageNotification messageNotification)
    {
        startPage();
        List<MessageNotification> list = messageNotificationService.selectMessageNotificationList(messageNotification);
        return getDataTable(list);
    }

    /**
     * 导出管理通知列表
     */
    @RequiresPermissions("system:notification:export")
    @Log(title = "管理通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MessageNotification messageNotification)
    {
        List<MessageNotification> list = messageNotificationService.selectMessageNotificationList(messageNotification);
        ExcelUtil<MessageNotification> util = new ExcelUtil<MessageNotification>(MessageNotification.class);
        return util.exportExcel(list, "管理通知数据");
    }

    /**
     * 新增管理通知
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存管理通知
     */
    @RequiresPermissions("system:notification:add")
    @Log(title = "管理通知", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MessageNotification messageNotification)
    {
        return toAjax(messageNotificationService.insertMessageNotification(messageNotification));
    }

    /**
     * 修改管理通知
     */
    @RequiresPermissions("system:notification:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        MessageNotification messageNotification = messageNotificationService.selectMessageNotificationById(id);
        mmap.put("messageNotification", messageNotification);
        return prefix + "/edit";
    }

    /**
     * 修改保存管理通知
     */
    @RequiresPermissions("system:notification:edit")
    @Log(title = "管理通知", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MessageNotification messageNotification)
    {
        return toAjax(messageNotificationService.updateMessageNotification(messageNotification));
    }

    /**
     * 删除管理通知
     */
    @RequiresPermissions("system:notification:remove")
    @Log(title = "管理通知", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(messageNotificationService.deleteMessageNotificationByIds(ids));
    }
}
