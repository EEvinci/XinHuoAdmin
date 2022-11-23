package com.ruoyi.project.system.singlequestion.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.singlequestion.mapper.SingleOptionQuestionMapper;
import com.ruoyi.project.system.singlequestion.domain.SingleOptionQuestion;
import com.ruoyi.project.system.singlequestion.service.ISingleOptionQuestionService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 单选题管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class SingleOptionQuestionServiceImpl implements ISingleOptionQuestionService 
{
    @Autowired
    private SingleOptionQuestionMapper singleOptionQuestionMapper;

    /**
     * 查询单选题管理
     * 
     * @param id 单选题管理主键
     * @return 单选题管理
     */
    @Override
    public SingleOptionQuestion selectSingleOptionQuestionById(String id)
    {
        return singleOptionQuestionMapper.selectSingleOptionQuestionById(id);
    }

    /**
     * 查询单选题管理列表
     * 
     * @param singleOptionQuestion 单选题管理
     * @return 单选题管理
     */
    @Override
    public List<SingleOptionQuestion> selectSingleOptionQuestionList(SingleOptionQuestion singleOptionQuestion)
    {
        return singleOptionQuestionMapper.selectSingleOptionQuestionList(singleOptionQuestion);
    }

    /**
     * 新增单选题管理
     * 
     * @param singleOptionQuestion 单选题管理
     * @return 结果
     */
    @Override
    public int insertSingleOptionQuestion(SingleOptionQuestion singleOptionQuestion)
    {
        return singleOptionQuestionMapper.insertSingleOptionQuestion(singleOptionQuestion);
    }

    /**
     * 修改单选题管理
     * 
     * @param singleOptionQuestion 单选题管理
     * @return 结果
     */
    @Override
    public int updateSingleOptionQuestion(SingleOptionQuestion singleOptionQuestion)
    {
        return singleOptionQuestionMapper.updateSingleOptionQuestion(singleOptionQuestion);
    }

    /**
     * 批量删除单选题管理
     * 
     * @param ids 需要删除的单选题管理主键
     * @return 结果
     */
    @Override
    public int deleteSingleOptionQuestionByIds(String ids)
    {
        return singleOptionQuestionMapper.deleteSingleOptionQuestionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除单选题管理信息
     * 
     * @param id 单选题管理主键
     * @return 结果
     */
    @Override
    public int deleteSingleOptionQuestionById(String id)
    {
        return singleOptionQuestionMapper.deleteSingleOptionQuestionById(id);
    }
}
