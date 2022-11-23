package com.ruoyi.project.system.history.service;

import java.util.List;
import com.ruoyi.project.system.history.domain.TodayInHistory;

/**
 * 党史管理Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface ITodayInHistoryService 
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
     * 批量删除党史管理
     * 
     * @param ids 需要删除的党史管理主键集合
     * @return 结果
     */
    public int deleteTodayInHistoryByIds(String ids);

    /**
     * 删除党史管理信息
     * 
     * @param id 党史管理主键
     * @return 结果
     */
    public int deleteTodayInHistoryById(String id);
}
