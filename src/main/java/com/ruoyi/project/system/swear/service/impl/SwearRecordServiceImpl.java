package com.ruoyi.project.system.swear.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.swear.mapper.SwearRecordMapper;
import com.ruoyi.project.system.swear.domain.SwearRecord;
import com.ruoyi.project.system.swear.service.ISwearRecordService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 宣誓管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class SwearRecordServiceImpl implements ISwearRecordService 
{
    @Autowired
    private SwearRecordMapper swearRecordMapper;

    /**
     * 查询宣誓管理
     * 
     * @param id 宣誓管理主键
     * @return 宣誓管理
     */
    @Override
    public SwearRecord selectSwearRecordById(String id)
    {
        return swearRecordMapper.selectSwearRecordById(id);
    }

    /**
     * 查询宣誓管理列表
     * 
     * @param swearRecord 宣誓管理
     * @return 宣誓管理
     */
    @Override
    public List<SwearRecord> selectSwearRecordList(SwearRecord swearRecord)
    {
        return swearRecordMapper.selectSwearRecordList(swearRecord);
    }

    /**
     * 新增宣誓管理
     * 
     * @param swearRecord 宣誓管理
     * @return 结果
     */
    @Override
    public int insertSwearRecord(SwearRecord swearRecord)
    {
        return swearRecordMapper.insertSwearRecord(swearRecord);
    }

    /**
     * 修改宣誓管理
     * 
     * @param swearRecord 宣誓管理
     * @return 结果
     */
    @Override
    public int updateSwearRecord(SwearRecord swearRecord)
    {
        return swearRecordMapper.updateSwearRecord(swearRecord);
    }

    /**
     * 批量删除宣誓管理
     * 
     * @param ids 需要删除的宣誓管理主键
     * @return 结果
     */
    @Override
    public int deleteSwearRecordByIds(String ids)
    {
        return swearRecordMapper.deleteSwearRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除宣誓管理信息
     * 
     * @param id 宣誓管理主键
     * @return 结果
     */
    @Override
    public int deleteSwearRecordById(String id)
    {
        return swearRecordMapper.deleteSwearRecordById(id);
    }
}
