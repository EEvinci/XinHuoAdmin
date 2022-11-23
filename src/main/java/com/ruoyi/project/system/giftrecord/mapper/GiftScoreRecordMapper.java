package com.ruoyi.project.system.giftrecord.mapper;

import java.util.List;
import com.ruoyi.project.system.giftrecord.domain.GiftScoreRecord;

/**
 * 得分管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface GiftScoreRecordMapper 
{
    /**
     * 查询得分管理
     * 
     * @param id 得分管理主键
     * @return 得分管理
     */
    public GiftScoreRecord selectGiftScoreRecordById(String id);

    /**
     * 查询得分管理列表
     * 
     * @param giftScoreRecord 得分管理
     * @return 得分管理集合
     */
    public List<GiftScoreRecord> selectGiftScoreRecordList(GiftScoreRecord giftScoreRecord);

    /**
     * 新增得分管理
     * 
     * @param giftScoreRecord 得分管理
     * @return 结果
     */
    public int insertGiftScoreRecord(GiftScoreRecord giftScoreRecord);

    /**
     * 修改得分管理
     * 
     * @param giftScoreRecord 得分管理
     * @return 结果
     */
    public int updateGiftScoreRecord(GiftScoreRecord giftScoreRecord);

    /**
     * 删除得分管理
     * 
     * @param id 得分管理主键
     * @return 结果
     */
    public int deleteGiftScoreRecordById(String id);

    /**
     * 批量删除得分管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGiftScoreRecordByIds(String[] ids);
}
