package com.ruoyi.project.system.giftrecord.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 得分管理对象 gift_score_record
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class GiftScoreRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 学号 */
    @Excel(name = "学号")
    private String stuNumber;

    /** 得分操作 */
    @Excel(name = "得分操作")
    private String action;

    /** 得分时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "得分时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 积分值 */
    @Excel(name = "积分值")
    private Long value;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setStuNumber(String stuNumber)
    {
        this.stuNumber = stuNumber;
    }

    public String getStuNumber()
    {
        return stuNumber;
    }
    public void setAction(String action)
    {
        this.action = action;
    }

    public String getAction()
    {
        return action;
    }
    public void setTime(Date time)
    {
        this.time = time;
    }

    public Date getTime()
    {
        return time;
    }
    public void setValue(Long value)
    {
        this.value = value;
    }

    public Long getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuNumber", getStuNumber())
            .append("action", getAction())
            .append("time", getTime())
            .append("value", getValue())
            .toString();
    }
}
