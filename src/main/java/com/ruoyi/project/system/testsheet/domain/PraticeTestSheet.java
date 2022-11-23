package com.ruoyi.project.system.testsheet.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 练习试卷管理对象 pratice_test_sheet
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class PraticeTestSheet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 考卷名称 */
    @Excel(name = "考卷名称")
    private String title;

    /** 面向对象 */
    @Excel(name = "面向对象")
    private String type;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

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
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
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
            .append("title", getTitle())
            .append("type", getType())
            .append("content", getContent())
            .toString();
    }
}
