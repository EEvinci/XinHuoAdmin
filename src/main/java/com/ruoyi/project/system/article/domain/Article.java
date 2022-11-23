package com.ruoyi.project.system.article.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 文章管理对象 article
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class Article extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 作者 */
    @Excel(name = "作者")
    private String writer;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 文章类型 */
    @Excel(name = "文章类型")
    private String type;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String images;

    /** 组织 */
    @Excel(name = "组织")
    private String organization;

    /** 学生名称 */
    @Excel(name = "学生名称")
    private String stuName;

    /** 学生班级 */
    @Excel(name = "学生班级")
    private String stuClass;

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
    public void setTime(Date time)
    {
        this.time = time;
    }

    public Date getTime()
    {
        return time;
    }
    public void setWriter(String writer)
    {
        this.writer = writer;
    }

    public String getWriter()
    {
        return writer;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setImages(String images)
    {
        this.images = images;
    }

    public String getImages()
    {
        return images;
    }
    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public String getOrganization()
    {
        return organization;
    }
    public void setStuName(String stuName)
    {
        this.stuName = stuName;
    }

    public String getStuName()
    {
        return stuName;
    }
    public void setStuClass(String stuClass)
    {
        this.stuClass = stuClass;
    }

    public String getStuClass()
    {
        return stuClass;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("time", getTime())
            .append("writer", getWriter())
            .append("content", getContent())
            .append("type", getType())
            .append("images", getImages())
            .append("organization", getOrganization())
            .append("stuName", getStuName())
            .append("stuClass", getStuClass())
            .toString();
    }
}
