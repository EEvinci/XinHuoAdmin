package com.ruoyi.project.system.exchange.controller;

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
import com.ruoyi.project.system.exchange.domain.ItemExchange;
import com.ruoyi.project.system.exchange.service.IItemExchangeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 礼品管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/exchange")
public class ItemExchangeController extends BaseController
{
    private String prefix = "system/exchange";

    @Autowired
    private IItemExchangeService itemExchangeService;

    @RequiresPermissions("system:exchange:view")
    @GetMapping()
    public String exchange()
    {
        return prefix + "/exchange";
    }

    /**
     * 查询礼品管理列表
     */
    @RequiresPermissions("system:exchange:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ItemExchange itemExchange)
    {
        startPage();
        List<ItemExchange> list = itemExchangeService.selectItemExchangeList(itemExchange);
        return getDataTable(list);
    }

    /**
     * 导出礼品管理列表
     */
    @RequiresPermissions("system:exchange:export")
    @Log(title = "礼品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ItemExchange itemExchange)
    {
        List<ItemExchange> list = itemExchangeService.selectItemExchangeList(itemExchange);
        ExcelUtil<ItemExchange> util = new ExcelUtil<ItemExchange>(ItemExchange.class);
        return util.exportExcel(list, "礼品管理数据");
    }

    /**
     * 新增礼品管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存礼品管理
     */
    @RequiresPermissions("system:exchange:add")
    @Log(title = "礼品管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ItemExchange itemExchange)
    {
        return toAjax(itemExchangeService.insertItemExchange(itemExchange));
    }

    /**
     * 修改礼品管理
     */
    @RequiresPermissions("system:exchange:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        ItemExchange itemExchange = itemExchangeService.selectItemExchangeById(id);
        mmap.put("itemExchange", itemExchange);
        return prefix + "/edit";
    }


    /**
     * 修改保存礼品管理
     */
    @RequiresPermissions("system:exchange:edit")
    @Log(title = "礼品管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ItemExchange itemExchange)
    {
        return toAjax(itemExchangeService.updateItemExchange(itemExchange));
    }


    /**
     * 删除礼品管理
     */
    @RequiresPermissions("system:exchange:remove")
    @Log(title = "礼品管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(itemExchangeService.deleteItemExchangeByIds(ids));
    }
}
