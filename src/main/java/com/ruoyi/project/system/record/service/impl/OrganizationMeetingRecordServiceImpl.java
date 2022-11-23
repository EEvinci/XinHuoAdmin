package com.ruoyi.project.system.record.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.record.mapper.OrganizationMeetingRecordMapper;
import com.ruoyi.project.system.record.domain.OrganizationMeetingRecord;
import com.ruoyi.project.system.record.service.IOrganizationMeetingRecordService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 会议管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class OrganizationMeetingRecordServiceImpl implements IOrganizationMeetingRecordService 
{
    @Autowired
    private OrganizationMeetingRecordMapper organizationMeetingRecordMapper;

    /**
     * 查询会议管理
     * 
     * @param id 会议管理主键
     * @return 会议管理
     */
    @Override
    public OrganizationMeetingRecord selectOrganizationMeetingRecordById(String id)
    {
        return organizationMeetingRecordMapper.selectOrganizationMeetingRecordById(id);
    }

    /**
     * 查询会议管理列表
     * 
     * @param organizationMeetingRecord 会议管理
     * @return 会议管理
     */
    @Override
    public List<OrganizationMeetingRecord> selectOrganizationMeetingRecordList(OrganizationMeetingRecord organizationMeetingRecord)
    {
        return organizationMeetingRecordMapper.selectOrganizationMeetingRecordList(organizationMeetingRecord);
    }

    /**
     * 新增会议管理
     * 
     * @param organizationMeetingRecord 会议管理
     * @return 结果
     */
    @Override
    public int insertOrganizationMeetingRecord(OrganizationMeetingRecord organizationMeetingRecord)
    {
        return organizationMeetingRecordMapper.insertOrganizationMeetingRecord(organizationMeetingRecord);
    }

    /**
     * 修改会议管理
     * 
     * @param organizationMeetingRecord 会议管理
     * @return 结果
     */
    @Override
    public int updateOrganizationMeetingRecord(OrganizationMeetingRecord organizationMeetingRecord)
    {
        return organizationMeetingRecordMapper.updateOrganizationMeetingRecord(organizationMeetingRecord);
    }

    /**
     * 批量删除会议管理
     * 
     * @param ids 需要删除的会议管理主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationMeetingRecordByIds(String ids)
    {
        return organizationMeetingRecordMapper.deleteOrganizationMeetingRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除会议管理信息
     * 
     * @param id 会议管理主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationMeetingRecordById(String id)
    {
        return organizationMeetingRecordMapper.deleteOrganizationMeetingRecordById(id);
    }
}
