package com.ruoyi.project.system.testanswer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 练习答卷管理对象 practice_answer_sheet
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class PracticeAnswerSheet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 试卷名 */
    @Excel(name = "试卷名")
    private String title;

    /** 学号 */
    @Excel(name = "学号")
    private String studentNumber;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 成绩 */
    @Excel(name = "成绩")
    private String score;

    /** 面向对象 */
    @Excel(name = "面向对象")
    private String type;

    /** 答题时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "答题时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

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
    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setScore(String score)
    {
        this.score = score;
    }

    public String getScore()
    {
        return score;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
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
            .append("title", getTitle())
            .append("studentNumber", getStudentNumber())
            .append("content", getContent())
            .append("score", getScore())
            .append("type", getType())
            .append("date", getDate())
            .toString();
    }
}
