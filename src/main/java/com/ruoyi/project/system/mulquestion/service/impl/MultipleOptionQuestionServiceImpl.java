package com.ruoyi.project.system.mulquestion.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mulquestion.mapper.MultipleOptionQuestionMapper;
import com.ruoyi.project.system.mulquestion.domain.MultipleOptionQuestion;
import com.ruoyi.project.system.mulquestion.service.IMultipleOptionQuestionService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 管理多选题Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class MultipleOptionQuestionServiceImpl implements IMultipleOptionQuestionService 
{
    @Autowired
    private MultipleOptionQuestionMapper multipleOptionQuestionMapper;

    /**
     * 查询管理多选题
     * 
     * @param id 管理多选题主键
     * @return 管理多选题
     */
    @Override
    public MultipleOptionQuestion selectMultipleOptionQuestionById(String id)
    {
        return multipleOptionQuestionMapper.selectMultipleOptionQuestionById(id);
    }

    /**
     * 查询管理多选题列表
     * 
     * @param multipleOptionQuestion 管理多选题
     * @return 管理多选题
     */
    @Override
    public List<MultipleOptionQuestion> selectMultipleOptionQuestionList(MultipleOptionQuestion multipleOptionQuestion)
    {
        return multipleOptionQuestionMapper.selectMultipleOptionQuestionList(multipleOptionQuestion);
    }

    /**
     * 新增管理多选题
     * 
     * @param multipleOptionQuestion 管理多选题
     * @return 结果
     */
    @Override
    public int insertMultipleOptionQuestion(MultipleOptionQuestion multipleOptionQuestion)
    {
        return multipleOptionQuestionMapper.insertMultipleOptionQuestion(multipleOptionQuestion);
    }

    /**
     * 修改管理多选题
     * 
     * @param multipleOptionQuestion 管理多选题
     * @return 结果
     */
    @Override
    public int updateMultipleOptionQuestion(MultipleOptionQuestion multipleOptionQuestion)
    {
        return multipleOptionQuestionMapper.updateMultipleOptionQuestion(multipleOptionQuestion);
    }

    /**
     * 批量删除管理多选题
     * 
     * @param ids 需要删除的管理多选题主键
     * @return 结果
     */
    @Override
    public int deleteMultipleOptionQuestionByIds(String ids)
    {
        return multipleOptionQuestionMapper.deleteMultipleOptionQuestionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除管理多选题信息
     * 
     * @param id 管理多选题主键
     * @return 结果
     */
    @Override
    public int deleteMultipleOptionQuestionById(String id)
    {
        return multipleOptionQuestionMapper.deleteMultipleOptionQuestionById(id);
    }
}
