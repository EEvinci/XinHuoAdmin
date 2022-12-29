package com.ruoyi.project.system.exchange.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.project.system.exchange.mapper.ItemExchangeMapper;
import com.ruoyi.project.system.exchange.domain.ItemExchange;
import com.ruoyi.project.system.exchange.service.IItemExchangeService;

import com.ruoyi.common.utils.text.Convert;

/**
 * 礼品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class ItemExchangeServiceImpl implements IItemExchangeService 
{
    @Autowired
    private ItemExchangeMapper itemExchangeMapper;

    /**
     * 查询礼品管理
     * 
     * @param id 礼品管理主键
     * @return 礼品管理
     */
    @Override
    public ItemExchange selectItemExchangeById(String id)
    {
        return itemExchangeMapper.selectItemExchangeById(id);
    }

    /**
     * 查询礼品管理列表
     * 
     * @param itemExchange 礼品管理
     * @return 礼品管理
     */
    @Override
    public List<ItemExchange> selectItemExchangeList(ItemExchange itemExchange)
    {
        return itemExchangeMapper.selectItemExchangeList(itemExchange);
    }

    /**
     * 新增礼品管理
     * 
     * @param itemExchange 礼品管理
     * @return 结果
     */
    @Override
    public int insertItemExchange(ItemExchange itemExchange)
    {
        return itemExchangeMapper.insertItemExchange(itemExchange);
    }

    /**
     * 修改礼品管理
     * 
     * @param itemExchange 礼品管理
     * @return 结果
     */
    @Override
    public int updateItemExchange(ItemExchange itemExchange)
    {
        return itemExchangeMapper.updateItemExchange(itemExchange);
    }

    /**
     * 批量删除礼品管理
     * 
     * @param ids 需要删除的礼品管理主键
     * @return 结果
     */
    @Override
    public int deleteItemExchangeByIds(String ids)
    {
        return itemExchangeMapper.deleteItemExchangeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除礼品管理信息
     * 
     * @param id 礼品管理主键
     * @return 结果
     */
    @Override
    public int deleteItemExchangeById(String id)
    {
        return itemExchangeMapper.deleteItemExchangeById(id);
    }
}
