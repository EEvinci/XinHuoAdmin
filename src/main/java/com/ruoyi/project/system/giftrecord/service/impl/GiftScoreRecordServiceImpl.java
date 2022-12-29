package com.ruoyi.project.system.giftrecord.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.project.system.giftrecord.mapper.GiftScoreRecordMapper;
import com.ruoyi.project.system.giftrecord.domain.GiftScoreRecord;
import com.ruoyi.project.system.giftrecord.service.IGiftScoreRecordService;

import com.ruoyi.common.utils.text.Convert;

/**
 * 得分管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class GiftScoreRecordServiceImpl implements IGiftScoreRecordService 
{
    @Autowired
    private GiftScoreRecordMapper giftScoreRecordMapper;

    /**
     * 查询得分管理
     * 
     * @param id 得分管理主键
     * @return 得分管理
     */
    @Override
    public GiftScoreRecord selectGiftScoreRecordById(String id)
    {
        return giftScoreRecordMapper.selectGiftScoreRecordById(id);
    }

    /**
     * 查询得分管理列表
     * 
     * @param giftScoreRecord 得分管理
     * @return 得分管理
     */
    @Override
    public List<GiftScoreRecord> selectGiftScoreRecordList(GiftScoreRecord giftScoreRecord)
    {
        return giftScoreRecordMapper.selectGiftScoreRecordList(giftScoreRecord);
    }

    /**
     * 新增得分管理
     * 
     * @param giftScoreRecord 得分管理
     * @return 结果
     */
    @Override
    public int insertGiftScoreRecord(GiftScoreRecord giftScoreRecord)
    {
        return giftScoreRecordMapper.insertGiftScoreRecord(giftScoreRecord);
    }

    /**
     * 修改得分管理
     * 
     * @param giftScoreRecord 得分管理
     * @return 结果
     */
    @Override
    public int updateGiftScoreRecord(GiftScoreRecord giftScoreRecord)
    {
        return giftScoreRecordMapper.updateGiftScoreRecord(giftScoreRecord);
    }

    /**
     * 批量删除得分管理
     * 
     * @param ids 需要删除的得分管理主键
     * @return 结果
     */
    @Override
    public int deleteGiftScoreRecordByIds(String ids)
    {
        return giftScoreRecordMapper.deleteGiftScoreRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除得分管理信息
     * 
     * @param id 得分管理主键
     * @return 结果
     */
    @Override
    public int deleteGiftScoreRecordById(String id)
    {
        return giftScoreRecordMapper.deleteGiftScoreRecordById(id);
    }
}
