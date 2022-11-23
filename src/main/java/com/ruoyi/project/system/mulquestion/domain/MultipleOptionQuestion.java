package com.ruoyi.project.system.mulquestion.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 管理多选题对象 multiple_option_question
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public class MultipleOptionQuestion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 题目 */
    @Excel(name = "题目")
    private String question;

    /** 答案 */
    @Excel(name = "答案")
    private String trueAnswer;

    /** 选项 */
    @Excel(name = "选项")
    private String options;

    /** 是/否 */
    @Excel(name = "是/否")
    private String checked;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
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
    public void setChecked(String checked)
    {
        this.checked = checked;
    }

    public String getChecked()
    {
        return checked;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("question", getQuestion())
            .append("trueAnswer", getTrueAnswer())
            .append("options", getOptions())
            .append("checked", getChecked())
            .toString();
    }
}
