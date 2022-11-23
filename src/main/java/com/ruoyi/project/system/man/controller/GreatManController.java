package com.ruoyi.project.system.man.controller;

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
import com.ruoyi.project.system.man.domain.GreatMan;
import com.ruoyi.project.system.man.service.IGreatManService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 伟人管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/man")
public class GreatManController extends BaseController
{
    private String prefix = "system/man";

    @Autowired
    private IGreatManService greatManService;

    @RequiresPermissions("system:man:view")
    @GetMapping()
    public String man()
    {
        return prefix + "/man";
    }

    /**
     * 查询伟人管理列表
     */
    @RequiresPermissions("system:man:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GreatMan greatMan)
    {
        startPage();
        List<GreatMan> list = greatManService.selectGreatManList(greatMan);
        return getDataTable(list);
    }

    /**
     * 导出伟人管理列表
     */
    @RequiresPermissions("system:man:export")
    @Log(title = "伟人管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GreatMan greatMan)
    {
        List<GreatMan> list = greatManService.selectGreatManList(greatMan);
        ExcelUtil<GreatMan> util = new ExcelUtil<GreatMan>(GreatMan.class);
        return util.exportExcel(list, "伟人管理数据");
    }

    /**
     * 新增伟人管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存伟人管理
     */
    @RequiresPermissions("system:man:add")
    @Log(title = "伟人管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GreatMan greatMan)
    {
        return toAjax(greatManService.insertGreatMan(greatMan));
    }

    /**
     * 修改伟人管理
     */
    @RequiresPermissions("system:man:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        GreatMan greatMan = greatManService.selectGreatManById(id);
        mmap.put("greatMan", greatMan);
        return prefix + "/edit";
    }

    /**
     * 修改保存伟人管理
     */
    @RequiresPermissions("system:man:edit")
    @Log(title = "伟人管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GreatMan greatMan)
    {
        return toAjax(greatManService.updateGreatMan(greatMan));
    }

    /**
     * 删除伟人管理
     */
    @RequiresPermissions("system:man:remove")
    @Log(title = "伟人管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(greatManService.deleteGreatManByIds(ids));
    }
}
