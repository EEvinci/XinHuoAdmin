package com.ruoyi.project.system.signrecordmy.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 管理签到对象 sign_in_record
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class SignInRecordMy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 学号 */
    @Excel(name = "学号")
    private String stuNumber;

    /** 登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

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
    public void setDate(Date date)
    {
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuNumber", getStuNumber())
            .append("date", getDate())
            .toString();
    }
}
