package com.ruoyi.project.system.fillinquestion.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.fillinquestion.mapper.FillInQuestionMapper;
import com.ruoyi.project.system.fillinquestion.domain.FillInQuestion;
import com.ruoyi.project.system.fillinquestion.service.IFillInQuestionService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 管理填空题Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class FillInQuestionServiceImpl implements IFillInQuestionService 
{
    @Autowired
    private FillInQuestionMapper fillInQuestionMapper;

    /**
     * 查询管理填空题
     * 
     * @param id 管理填空题主键
     * @return 管理填空题
     */
    @Override
    public FillInQuestion selectFillInQuestionById(String id)
    {
        return fillInQuestionMapper.selectFillInQuestionById(id);
    }

    /**
     * 查询管理填空题列表
     * 
     * @param fillInQuestion 管理填空题
     * @return 管理填空题
     */
    @Override
    public List<FillInQuestion> selectFillInQuestionList(FillInQuestion fillInQuestion)
    {
        return fillInQuestionMapper.selectFillInQuestionList(fillInQuestion);
    }

    /**
     * 新增管理填空题
     * 
     * @param fillInQuestion 管理填空题
     * @return 结果
     */
    @Override
    public int insertFillInQuestion(FillInQuestion fillInQuestion)
    {
        return fillInQuestionMapper.insertFillInQuestion(fillInQuestion);
    }

    /**
     * 修改管理填空题
     * 
     * @param fillInQuestion 管理填空题
     * @return 结果
     */
    @Override
    public int updateFillInQuestion(FillInQuestion fillInQuestion)
    {
        return fillInQuestionMapper.updateFillInQuestion(fillInQuestion);
    }

    /**
     * 批量删除管理填空题
     * 
     * @param ids 需要删除的管理填空题主键
     * @return 结果
     */
    @Override
    public int deleteFillInQuestionByIds(String ids)
    {
        return fillInQuestionMapper.deleteFillInQuestionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除管理填空题信息
     * 
     * @param id 管理填空题主键
     * @return 结果
     */
    @Override
    public int deleteFillInQuestionById(String id)
    {
        return fillInQuestionMapper.deleteFillInQuestionById(id);
    }
}
