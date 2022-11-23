package com.ruoyi.project.system.swear.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 宣誓管理对象 swear_record
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class SwearRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 学号 */
    @Excel(name = "学号")
    private String stuNumber;

    /** 宣誓次数 */
    @Excel(name = "宣誓次数")
    private Long swearCount;

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
    public void setSwearCount(Long swearCount)
    {
        this.swearCount = swearCount;
    }

    public Long getSwearCount()
    {
        return swearCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuNumber", getStuNumber())
            .append("swearCount", getSwearCount())
            .toString();
    }
}
