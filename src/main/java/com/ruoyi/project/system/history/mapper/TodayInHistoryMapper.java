package com.ruoyi.project.system.history.mapper;

import java.util.List;
import com.ruoyi.project.system.history.domain.TodayInHistory;

/**
 * 党史管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface TodayInHistoryMapper 
{
    /**
     * 查询党史管理
     * 
     * @param id 党史管理主键
     * @return 党史管理
     */
    public TodayInHistory selectTodayInHistoryById(String id);

    /**
     * 查询党史管理列表
     * 
     * @param todayInHistory 党史管理
     * @return 党史管理集合
     */
    public List<TodayInHistory> selectTodayInHistoryList(TodayInHistory todayInHistory);

    /**
     * 新增党史管理
     * 
     * @param todayInHistory 党史管理
     * @return 结果
     */
    public int insertTodayInHistory(TodayInHistory todayInHistory);

    /**
     * 修改党史管理
     * 
     * @param todayInHistory 党史管理
     * @return 结果
     */
    public int updateTodayInHistory(TodayInHistory todayInHistory);

    /**
     * 删除党史管理
     * 
     * @param id 党史管理主键
     * @return 结果
     */
    public int deleteTodayInHistoryById(String id);

    /**
     * 批量删除党史管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTodayInHistoryByIds(String[] ids);
}
