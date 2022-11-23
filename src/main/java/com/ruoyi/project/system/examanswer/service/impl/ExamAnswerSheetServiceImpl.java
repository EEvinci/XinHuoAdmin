package com.ruoyi.project.system.examanswer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.examanswer.mapper.ExamAnswerSheetMapper;
import com.ruoyi.project.system.examanswer.domain.ExamAnswerSheet;
import com.ruoyi.project.system.examanswer.service.IExamAnswerSheetService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 答卷管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class ExamAnswerSheetServiceImpl implements IExamAnswerSheetService 
{
    @Autowired
    private ExamAnswerSheetMapper examAnswerSheetMapper;

    /**
     * 查询答卷管理
     * 
     * @param id 答卷管理主键
     * @return 答卷管理
     */
    @Override
    public ExamAnswerSheet selectExamAnswerSheetById(String id)
    {
        return examAnswerSheetMapper.selectExamAnswerSheetById(id);
    }

    /**
     * 查询答卷管理列表
     * 
     * @param examAnswerSheet 答卷管理
     * @return 答卷管理
     */
    @Override
    public List<ExamAnswerSheet> selectExamAnswerSheetList(ExamAnswerSheet examAnswerSheet)
    {
        return examAnswerSheetMapper.selectExamAnswerSheetList(examAnswerSheet);
    }

    /**
     * 新增答卷管理
     * 
     * @param examAnswerSheet 答卷管理
     * @return 结果
     */
    @Override
    public int insertExamAnswerSheet(ExamAnswerSheet examAnswerSheet)
    {
        return examAnswerSheetMapper.insertExamAnswerSheet(examAnswerSheet);
    }

    /**
     * 修改答卷管理
     * 
     * @param examAnswerSheet 答卷管理
     * @return 结果
     */
    @Override
    public int updateExamAnswerSheet(ExamAnswerSheet examAnswerSheet)
    {
        return examAnswerSheetMapper.updateExamAnswerSheet(examAnswerSheet);
    }

    /**
     * 批量删除答卷管理
     * 
     * @param ids 需要删除的答卷管理主键
     * @return 结果
     */
    @Override
    public int deleteExamAnswerSheetByIds(String ids)
    {
        return examAnswerSheetMapper.deleteExamAnswerSheetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除答卷管理信息
     * 
     * @param id 答卷管理主键
     * @return 结果
     */
    @Override
    public int deleteExamAnswerSheetById(String id)
    {
        return examAnswerSheetMapper.deleteExamAnswerSheetById(id);
    }
}
