package com.ruoyi.project.system.examsheet.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 考卷管理对象 exam_test_sheet
 * 
 * @author ruoyi
 * @date 2022-11-21
 */
public class ExamTestSheet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 题目 */
    @Excel(name = "题目")
    private String title;

    /** 面向对象 */
    @Excel(name = "面向对象")
    private String type;

    /** 考试时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "考试时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date testTime;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 使用/未使用 */
    @Excel(name = "使用/未使用")
    private Long hasDone;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void settype(String type)
    {
        this.type = type;
    }

    public String gettype()
    {
        return type;
    }
    public void setTestTime(Date testTime)
    {
        this.testTime = testTime;
    }

    public Date getTestTime()
    {
        return testTime;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setHasDone(Long hasDone)
    {
        this.hasDone = hasDone;
    }

    public Long getHasDone()
    {
        return hasDone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("type", gettype())
            .append("testTime", getTestTime())
            .append("content", getContent())
            .append("hasDone", getHasDone())
            .toString();
    }
}
