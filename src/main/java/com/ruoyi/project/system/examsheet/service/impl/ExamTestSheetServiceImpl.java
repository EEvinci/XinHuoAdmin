package com.ruoyi.project.system.examsheet.service.impl;

import java.util.List;

import com.ruoyi.project.system.singlequestion.domain.SingleOptionQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.examsheet.mapper.ExamTestSheetMapper;
import com.ruoyi.project.system.examsheet.domain.ExamTestSheet;
import com.ruoyi.project.system.examsheet.service.IExamTestSheetService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 考卷管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-21
 */
@Service
public class ExamTestSheetServiceImpl implements IExamTestSheetService 
{
    @Autowired
    private ExamTestSheetMapper examTestSheetMapper;

    /**
     * 查询考卷管理
     * 
     * @param id 考卷管理主键
     * @return 考卷管理
     */
    @Override
    public ExamTestSheet selectExamTestSheetById(String id)
    {
        return examTestSheetMapper.selectExamTestSheetById(id);
    }

    /**
     * 查询考卷管理列表
     * 
     * @param examTestSheet 考卷管理
     * @return 考卷管理
     */
    @Override
    public List<ExamTestSheet> selectExamTestSheetList(ExamTestSheet examTestSheet)
    {
        return examTestSheetMapper.selectExamTestSheetList(examTestSheet);
    }

    /**
     * 新增考卷管理
     * 
     * @param examTestSheet 考卷管理
     * @return 结果
     */
    @Override
    public int insertExamTestSheet(ExamTestSheet examTestSheet)
    {
        return examTestSheetMapper.insertExamTestSheet(examTestSheet);
    }

    /**
     * 修改考卷管理
     * 
     * @param examTestSheet 考卷管理
     * @return 结果
     */
    @Override
    public int updateExamTestSheet(ExamTestSheet examTestSheet)
    {
        return examTestSheetMapper.updateExamTestSheet(examTestSheet);
    }

    /**
     * 批量删除考卷管理
     * 
     * @param ids 需要删除的考卷管理主键
     * @return 结果
     */
    @Override
    public int deleteExamTestSheetByIds(String ids)
    {
        return examTestSheetMapper.deleteExamTestSheetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除考卷管理信息
     * 
     * @param id 考卷管理主键
     * @return 结果
     */
    @Override
    public int deleteExamTestSheetById(String id)
    {
        return examTestSheetMapper.deleteExamTestSheetById(id);
    }




    /**
     * 生成试卷
     */
    /**
     * 开始巡检
     *
     * @param inspectionNewDemo 开始巡检
     * @return 结果
     */

}
