package com.ruoyi.project.system.swear.mapper;

import java.util.List;
import com.ruoyi.project.system.swear.domain.SwearRecord;

/**
 * 宣誓管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface SwearRecordMapper 
{
    /**
     * 查询宣誓管理
     * 
     * @param id 宣誓管理主键
     * @return 宣誓管理
     */
    public SwearRecord selectSwearRecordById(String id);

    /**
     * 查询宣誓管理列表
     * 
     * @param swearRecord 宣誓管理
     * @return 宣誓管理集合
     */
    public List<SwearRecord> selectSwearRecordList(SwearRecord swearRecord);

    /**
     * 新增宣誓管理
     * 
     * @param swearRecord 宣誓管理
     * @return 结果
     */
    public int insertSwearRecord(SwearRecord swearRecord);

    /**
     * 修改宣誓管理
     * 
     * @param swearRecord 宣誓管理
     * @return 结果
     */
    public int updateSwearRecord(SwearRecord swearRecord);

    /**
     * 删除宣誓管理
     * 
     * @param id 宣誓管理主键
     * @return 结果
     */
    public int deleteSwearRecordById(String id);

    /**
     * 批量删除宣誓管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSwearRecordByIds(String[] ids);
}
