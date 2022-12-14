package com.ruoyi.project.system.record.service;

import java.util.List;
import com.ruoyi.project.system.record.domain.OrganizationMeetingRecord;

/**
 * 会议管理Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface IOrganizationMeetingRecordService 
{
    /**
     * 查询会议管理
     * 
     * @param id 会议管理主键
     * @return 会议管理
     */
    public OrganizationMeetingRecord selectOrganizationMeetingRecordById(String id);

    /**
     * 查询会议管理列表
     * 
     * @param organizationMeetingRecord 会议管理
     * @return 会议管理集合
     */
    public List<OrganizationMeetingRecord> selectOrganizationMeetingRecordList(OrganizationMeetingRecord organizationMeetingRecord);

    /**
     * 新增会议管理
     * 
     * @param organizationMeetingRecord 会议管理
     * @return 结果
     */
    public int insertOrganizationMeetingRecord(OrganizationMeetingRecord organizationMeetingRecord);

    /**
     * 修改会议管理
     * 
     * @param organizationMeetingRecord 会议管理
     * @return 结果
     */
    public int updateOrganizationMeetingRecord(OrganizationMeetingRecord organizationMeetingRecord);

    /**
     * 批量删除会议管理
     * 
     * @param ids 需要删除的会议管理主键集合
     * @return 结果
     */
    public int deleteOrganizationMeetingRecordByIds(String ids);

    /**
     * 删除会议管理信息
     * 
     * @param id 会议管理主键
     * @return 结果
     */
    public int deleteOrganizationMeetingRecordById(String id);
}
