package com.ruoyi.project.system.man.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 伟人管理对象 great_man
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class GreatMan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String image;

    /** 伟人介绍 */
    @Excel(name = "伟人介绍")
    private String description;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setImage(String image)
    {
        this.image = image;
    }

    public String getImage()
    {
        return image;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("image", getImage())
            .append("description", getDescription())
            .toString();
    }
}
