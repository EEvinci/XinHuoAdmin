package com.ruoyi.project.system.todo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 待办事项管理对象 to_do
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class ToDo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 学号 */
    @Excel(name = "学号")
    private String studentNumber;

    /** 待办事项 */
    @Excel(name = "待办事项")
    private String content;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentNumber", getStudentNumber())
            .append("content", getContent())
            .toString();
    }
}
