package com.ruoyi.project.system.student.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 学生管理对象 student
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
public class Student extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 学号 */
    private String number;

    /** 积分 */
    @Excel(name = "积分")
    private String giftScore;

    /** 组织 */
    @Excel(name = "组织")
    private String organization;

    /** 电话 */
    @Excel(name = "电话")
    private String phoneNumber;

    /** 身份 */
    @Excel(name = "身份")
    private String identity;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }
    public void setGiftScore(String giftScore)
    {
        this.giftScore = giftScore;
    }

    public String getGiftScore()
    {
        return giftScore;
    }
    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public String getOrganization()
    {
        return organization;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setIdentity(String identity)
    {
        this.identity = identity;
    }

    public String getIdentity()
    {
        return identity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("name", getName())
            .append("number", getNumber())
            .append("giftScore", getGiftScore())
            .append("organization", getOrganization())
            .append("phoneNumber", getPhoneNumber())
            .append("identity", getIdentity())
            .toString();
    }
}
