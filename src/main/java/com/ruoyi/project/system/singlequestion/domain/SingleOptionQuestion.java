package com.ruoyi.project.system.singlequestion.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 单选题管理对象 single_option_question
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class SingleOptionQuestion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 是/否 */
    @Excel(name = "是/否")
    private Long checked;

    /** 题目 */
    @Excel(name = "题目")
    private String question;

    /** 答案 */
    @Excel(name = "答案")
    private String trueAnswer;

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
    public void setChecked(Long checked)
    {
        this.checked = checked;
    }

    public Long getChecked()
    {
        return checked;
    }
    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getQuestion()
    {
        return question;
    }
    public void setTrueAnswer(String trueAnswer)
    {
        this.trueAnswer = trueAnswer;
    }

    public String getTrueAnswer()
    {
        return trueAnswer;
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
            .append("checked", getChecked())
            .append("question", getQuestion())
            .append("trueAnswer", getTrueAnswer())
            .append("options", getOptions())
            .toString();
    }
}
