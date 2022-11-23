package com.ruoyi.project.system.judgequestion.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 判断题管理对象 judge_question
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class JudgeQuestion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 题目 */
    @Excel(name = "题目")
    private String content;

    /** 答案 */
    @Excel(name = "答案")
    private String trueAnswer;

    /** 是/否 */
    @Excel(name = "是/否")
    private Long checked;

    /** 选项 */
    @Excel(name = "选项")
    private String options;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setTrueAnswer(String trueAnswer)
    {
        this.trueAnswer = trueAnswer;
    }

    public String getTrueAnswer()
    {
        return trueAnswer;
    }
    public void setChecked(Long checked)
    {
        this.checked = checked;
    }

    public Long getChecked()
    {
        return checked;
    }
    public void setOptions(String options)
    {
        this.options = options;
    }

    public String getOptions()
    {
        return options;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("content", getContent())
            .append("trueAnswer", getTrueAnswer())
            .append("checked", getChecked())
            .append("options", getOptions())
            .toString();
    }
}
