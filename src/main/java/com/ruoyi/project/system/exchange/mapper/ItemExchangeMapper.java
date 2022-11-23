package com.ruoyi.project.system.exchange.mapper;

import java.util.List;
import com.ruoyi.project.system.exchange.domain.ItemExchange;

/**
 * 礼品管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface ItemExchangeMapper 
{
    /**
     * 查询礼品管理
     * 
     * @param id 礼品管理主键
     * @return 礼品管理
     */
    public ItemExchange selectItemExchangeById(String id);

    /**
     * 查询礼品管理列表
     * 
     * @param itemExchange 礼品管理
     * @return 礼品管理集合
     */
    public List<ItemExchange> selectItemExchangeList(ItemExchange itemExchange);

    /**
     * 新增礼品管理
     * 
     * @param itemExchange 礼品管理
     * @return 结果
     */
    public int insertItemExchange(ItemExchange itemExchange);

    /**
     * 修改礼品管理
     * 
     * @param itemExchange 礼品管理
     * @return 结果
     */
    public int updateItemExchange(ItemExchange itemExchange);

    /**
     * 删除礼品管理
     * 
     * @param id 礼品管理主键
     * @return 结果
     */
    public int deleteItemExchangeById(String id);

    /**
     * 批量删除礼品管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteItemExchangeByIds(String[] ids);
}
