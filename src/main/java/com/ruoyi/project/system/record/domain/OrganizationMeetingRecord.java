package com.ruoyi.project.system.record.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 会议管理对象 organization_meeting_record
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class OrganizationMeetingRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 会议类型 */
    @Excel(name = "会议类型")
    private String type;

    /** 参与人员 */
    @Excel(name = "参与人员")
    private String participants;

    /** 会议时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "会议时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 会议主题 */
    @Excel(name = "会议主题")
    private String title;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setParticipants(String participants)
    {
        this.participants = participants;
    }

    public String getParticipants()
    {
        return participants;
    }
    public void setTime(Date time)
    {
        this.time = time;
    }

    public Date getTime()
    {
        return time;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("participants", getParticipants())
            .append("time", getTime())
            .append("title", getTitle())
            .toString();
    }
}
