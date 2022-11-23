package com.ruoyi.project.system.judgequestion.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.judgequestion.mapper.JudgeQuestionMapper;
import com.ruoyi.project.system.judgequestion.domain.JudgeQuestion;
import com.ruoyi.project.system.judgequestion.service.IJudgeQuestionService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 判断题管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class JudgeQuestionServiceImpl implements IJudgeQuestionService 
{
    @Autowired
    private JudgeQuestionMapper judgeQuestionMapper;

    /**
     * 查询判断题管理
     * 
     * @param id 判断题管理主键
     * @return 判断题管理
     */
    @Override
    public JudgeQuestion selectJudgeQuestionById(String id)
    {
        return judgeQuestionMapper.selectJudgeQuestionById(id);
    }

    /**
     * 查询判断题管理列表
     * 
     * @param judgeQuestion 判断题管理
     * @return 判断题管理
     */
    @Override
    public List<JudgeQuestion> selectJudgeQuestionList(JudgeQuestion judgeQuestion)
    {
        return judgeQuestionMapper.selectJudgeQuestionList(judgeQuestion);
    }

    /**
     * 新增判断题管理
     * 
     * @param judgeQuestion 判断题管理
     * @return 结果
     */
    @Override
    public int insertJudgeQuestion(JudgeQuestion judgeQuestion)
    {
        return judgeQuestionMapper.insertJudgeQuestion(judgeQuestion);
    }

    /**
     * 修改判断题管理
     * 
     * @param judgeQuestion 判断题管理
     * @return 结果
     */
    @Override
    public int updateJudgeQuestion(JudgeQuestion judgeQuestion)
    {
        return judgeQuestionMapper.updateJudgeQuestion(judgeQuestion);
    }

    /**
     * 批量删除判断题管理
     * 
     * @param ids 需要删除的判断题管理主键
     * @return 结果
     */
    @Override
    public int deleteJudgeQuestionByIds(String ids)
    {
        return judgeQuestionMapper.deleteJudgeQuestionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除判断题管理信息
     * 
     * @param id 判断题管理主键
     * @return 结果
     */
    @Override
    public int deleteJudgeQuestionById(String id)
    {
        return judgeQuestionMapper.deleteJudgeQuestionById(id);
    }
}
