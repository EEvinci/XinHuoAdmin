package com.ruoyi.project.system.giftrecord.controller;

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

import com.ruoyi.project.system.giftrecord.domain.GiftScoreRecord;
import com.ruoyi.project.system.giftrecord.service.IGiftScoreRecordService;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 得分管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/giftrecord")
public class GiftScoreRecordController extends BaseController
{
    private String prefix = "system/giftrecord";

    @Autowired
    private IGiftScoreRecordService giftScoreRecordService;

    @RequiresPermissions("system:giftrecord:view")
    @GetMapping()
    public String giftrecord()
    {
        return prefix + "/giftrecord";
    }


    /**
     * 查询得分管理列表
     */
    @RequiresPermissions("system:giftrecord:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GiftScoreRecord giftScoreRecord)
    {
        startPage();
        List<GiftScoreRecord> list = giftScoreRecordService.selectGiftScoreRecordList(giftScoreRecord);
        return getDataTable(list);
    }


    /**
     * 导出得分管理列表
     */
    @RequiresPermissions("system:giftrecord:export")
    @Log(title = "得分管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GiftScoreRecord giftScoreRecord)
    {
        List<GiftScoreRecord> list = giftScoreRecordService.selectGiftScoreRecordList(giftScoreRecord);
        ExcelUtil<GiftScoreRecord> util = new ExcelUtil<GiftScoreRecord>(GiftScoreRecord.class);
        return util.exportExcel(list, "得分管理数据");
    }


    /**
     * 新增得分管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }


    /**
     * 新增保存得分管理
     */
    @RequiresPermissions("system:giftrecord:add")
    @Log(title = "得分管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GiftScoreRecord giftScoreRecord)
    {
        return toAjax(giftScoreRecordService.insertGiftScoreRecord(giftScoreRecord));
    }



    /**
     * 修改得分管理
     */
    @RequiresPermissions("system:giftrecord:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        GiftScoreRecord giftScoreRecord = giftScoreRecordService.selectGiftScoreRecordById(id);
        mmap.put("giftScoreRecord", giftScoreRecord);
        return prefix + "/edit";
    }



    /**
     * 修改保存得分管理
     */
    @RequiresPermissions("system:giftrecord:edit")
    @Log(title = "得分管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GiftScoreRecord giftScoreRecord)
    {
        return toAjax(giftScoreRecordService.updateGiftScoreRecord(giftScoreRecord));
    }


    /**
     * 删除得分管理
     */
    @RequiresPermissions("system:giftrecord:remove")
    @Log(title = "得分管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(giftScoreRecordService.deleteGiftScoreRecordByIds(ids));
    }
}
