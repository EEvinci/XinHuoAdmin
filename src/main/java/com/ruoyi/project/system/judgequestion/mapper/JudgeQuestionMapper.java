package com.ruoyi.project.system.judgequestion.mapper;

import java.util.List;
import com.ruoyi.project.system.judgequestion.domain.JudgeQuestion;

/**
 * 判断题管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface JudgeQuestionMapper 
{
    /**
     * 查询判断题管理
     * 
     * @param id 判断题管理主键
     * @return 判断题管理
     */
    public JudgeQuestion selectJudgeQuestionById(String id);

    /**
     * 查询判断题管理列表
     * 
     * @param judgeQuestion 判断题管理
     * @return 判断题管理集合
     */
    public List<JudgeQuestion> selectJudgeQuestionList(JudgeQuestion judgeQuestion);

    /**
     * 新增判断题管理
     * 
     * @param judgeQuestion 判断题管理
     * @return 结果
     */
    public int insertJudgeQuestion(JudgeQuestion judgeQuestion);

    /**
     * 修改判断题管理
     * 
     * @param judgeQuestion 判断题管理
     * @return 结果
     */
    public int updateJudgeQuestion(JudgeQuestion judgeQuestion);

    /**
     * 删除判断题管理
     * 
     * @param id 判断题管理主键
     * @return 结果
     */
    public int deleteJudgeQuestionById(String id);

    /**
     * 批量删除判断题管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteJudgeQuestionByIds(String[] ids);
}
