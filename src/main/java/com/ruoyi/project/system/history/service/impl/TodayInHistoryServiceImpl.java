package com.ruoyi.project.system.history.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.history.mapper.TodayInHistoryMapper;
import com.ruoyi.project.system.history.domain.TodayInHistory;
import com.ruoyi.project.system.history.service.ITodayInHistoryService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 党史管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class TodayInHistoryServiceImpl implements ITodayInHistoryService 
{
    @Autowired
    private TodayInHistoryMapper todayInHistoryMapper;

    /**
     * 查询党史管理
     * 
     * @param id 党史管理主键
     * @return 党史管理
     */
    @Override
    public TodayInHistory selectTodayInHistoryById(String id)
    {
        return todayInHistoryMapper.selectTodayInHistoryById(id);
    }

    /**
     * 查询党史管理列表
     * 
     * @param todayInHistory 党史管理
     * @return 党史管理
     */
    @Override
    public List<TodayInHistory> selectTodayInHistoryList(TodayInHistory todayInHistory)
    {
        return todayInHistoryMapper.selectTodayInHistoryList(todayInHistory);
    }

    /**
     * 新增党史管理
     * 
     * @param todayInHistory 党史管理
     * @return 结果
     */
    @Override
    public int insertTodayInHistory(TodayInHistory todayInHistory)
    {
        return todayInHistoryMapper.insertTodayInHistory(todayInHistory);
    }

    /**
     * 修改党史管理
     * 
     * @param todayInHistory 党史管理
     * @return 结果
     */
    @Override
    public int updateTodayInHistory(TodayInHistory todayInHistory)
    {
        return todayInHistoryMapper.updateTodayInHistory(todayInHistory);
    }

    /**
     * 批量删除党史管理
     * 
     * @param ids 需要删除的党史管理主键
     * @return 结果
     */
    @Override
    public int deleteTodayInHistoryByIds(String ids)
    {
        return todayInHistoryMapper.deleteTodayInHistoryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除党史管理信息
     * 
     * @param id 党史管理主键
     * @return 结果
     */
    @Override
    public int deleteTodayInHistoryById(String id)
    {
        return todayInHistoryMapper.deleteTodayInHistoryById(id);
    }
}
