package com.ruoyi.project.system.todo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.todo.mapper.ToDoMapper;
import com.ruoyi.project.system.todo.domain.ToDo;
import com.ruoyi.project.system.todo.service.IToDoService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 待办事项管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class ToDoServiceImpl implements IToDoService 
{
    @Autowired
    private ToDoMapper toDoMapper;

    /**
     * 查询待办事项管理
     * 
     * @param id 待办事项管理主键
     * @return 待办事项管理
     */
    @Override
    public ToDo selectToDoById(String id)
    {
        return toDoMapper.selectToDoById(id);
    }

    /**
     * 查询待办事项管理列表
     * 
     * @param toDo 待办事项管理
     * @return 待办事项管理
     */
    @Override
    public List<ToDo> selectToDoList(ToDo toDo)
    {
        return toDoMapper.selectToDoList(toDo);
    }

    /**
     * 新增待办事项管理
     * 
     * @param toDo 待办事项管理
     * @return 结果
     */
    @Override
    public int insertToDo(ToDo toDo)
    {
        return toDoMapper.insertToDo(toDo);
    }

    /**
     * 修改待办事项管理
     * 
     * @param toDo 待办事项管理
     * @return 结果
     */
    @Override
    public int updateToDo(ToDo toDo)
    {
        return toDoMapper.updateToDo(toDo);
    }

    /**
     * 批量删除待办事项管理
     * 
     * @param ids 需要删除的待办事项管理主键
     * @return 结果
     */
    @Override
    public int deleteToDoByIds(String ids)
    {
        return toDoMapper.deleteToDoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除待办事项管理信息
     * 
     * @param id 待办事项管理主键
     * @return 结果
     */
    @Override
    public int deleteToDoById(String id)
    {
        return toDoMapper.deleteToDoById(id);
    }
}
