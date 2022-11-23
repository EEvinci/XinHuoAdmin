package com.ruoyi.project.system.todo.controller;

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
import com.ruoyi.project.system.todo.domain.ToDo;
import com.ruoyi.project.system.todo.service.IToDoService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 待办事项管理Controller
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Controller
@RequestMapping("/system/todo")
public class ToDoController extends BaseController
{
    private String prefix = "system/todo";

    @Autowired
    private IToDoService toDoService;

    @RequiresPermissions("system:todo:view")
    @GetMapping()
    public String todo()
    {
        return prefix + "/todo";
    }

    /**
     * 查询待办事项管理列表
     */
    @RequiresPermissions("system:todo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ToDo toDo)
    {
        startPage();
        List<ToDo> list = toDoService.selectToDoList(toDo);
        return getDataTable(list);
    }

    /**
     * 导出待办事项管理列表
     */
    @RequiresPermissions("system:todo:export")
    @Log(title = "待办事项管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ToDo toDo)
    {
        List<ToDo> list = toDoService.selectToDoList(toDo);
        ExcelUtil<ToDo> util = new ExcelUtil<ToDo>(ToDo.class);
        return util.exportExcel(list, "待办事项管理数据");
    }

    /**
     * 新增待办事项管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存待办事项管理
     */
    @RequiresPermissions("system:todo:add")
    @Log(title = "待办事项管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ToDo toDo)
    {
        return toAjax(toDoService.insertToDo(toDo));
    }

    /**
     * 修改待办事项管理
     */
    @RequiresPermissions("system:todo:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        ToDo toDo = toDoService.selectToDoById(id);
        mmap.put("toDo", toDo);
        return prefix + "/edit";
    }

    /**
     * 修改保存待办事项管理
     */
    @RequiresPermissions("system:todo:edit")
    @Log(title = "待办事项管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ToDo toDo)
    {
        return toAjax(toDoService.updateToDo(toDo));
    }

    /**
     * 删除待办事项管理
     */
    @RequiresPermissions("system:todo:remove")
    @Log(title = "待办事项管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(toDoService.deleteToDoByIds(ids));
    }
}
