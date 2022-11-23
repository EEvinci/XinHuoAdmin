package com.ruoyi.project.system.exchange.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 礼品管理对象 item_exchange
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class ItemExchange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 礼品名 */
    @Excel(name = "礼品名")
    private String name;

    /** 积分值 */
    @Excel(name = "积分值")
    private String value;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String image;

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
    public void setValue(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
    public void setImage(String image)
    {
        this.image = image;
    }

    public String getImage()
    {
        return image;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("value", getValue())
            .append("image", getImage())
            .toString();
    }
}
