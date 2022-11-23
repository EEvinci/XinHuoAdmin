package com.ruoyi.project.system.todo.mapper;

import java.util.List;
import com.ruoyi.project.system.todo.domain.ToDo;

/**
 * 待办事项管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface ToDoMapper 
{
    /**
     * 查询待办事项管理
     * 
     * @param id 待办事项管理主键
     * @return 待办事项管理
     */
    public ToDo selectToDoById(String id);

    /**
     * 查询待办事项管理列表
     * 
     * @param toDo 待办事项管理
     * @return 待办事项管理集合
     */
    public List<ToDo> selectToDoList(ToDo toDo);

    /**
     * 新增待办事项管理
     * 
     * @param toDo 待办事项管理
     * @return 结果
     */
    public int insertToDo(ToDo toDo);

    /**
     * 修改待办事项管理
     * 
     * @param toDo 待办事项管理
     * @return 结果
     */
    public int updateToDo(ToDo toDo);

    /**
     * 删除待办事项管理
     * 
     * @param id 待办事项管理主键
     * @return 结果
     */
    public int deleteToDoById(String id);

    /**
     * 批量删除待办事项管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteToDoByIds(String[] ids);
}
