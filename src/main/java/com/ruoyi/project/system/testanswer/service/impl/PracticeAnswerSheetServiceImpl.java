package com.ruoyi.project.system.testanswer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.testanswer.mapper.PracticeAnswerSheetMapper;
import com.ruoyi.project.system.testanswer.domain.PracticeAnswerSheet;
import com.ruoyi.project.system.testanswer.service.IPracticeAnswerSheetService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 练习答卷管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class PracticeAnswerSheetServiceImpl implements IPracticeAnswerSheetService 
{
    @Autowired
    private PracticeAnswerSheetMapper practiceAnswerSheetMapper;

    /**
     * 查询练习答卷管理
     * 
     * @param id 练习答卷管理主键
     * @return 练习答卷管理
     */
    @Override
    public PracticeAnswerSheet selectPracticeAnswerSheetById(String id)
    {
        return practiceAnswerSheetMapper.selectPracticeAnswerSheetById(id);
    }

    /**
     * 查询练习答卷管理列表
     * 
     * @param practiceAnswerSheet 练习答卷管理
     * @return 练习答卷管理
     */
    @Override
    public List<PracticeAnswerSheet> selectPracticeAnswerSheetList(PracticeAnswerSheet practiceAnswerSheet)
    {
        return practiceAnswerSheetMapper.selectPracticeAnswerSheetList(practiceAnswerSheet);
    }

    /**
     * 新增练习答卷管理
     * 
     * @param practiceAnswerSheet 练习答卷管理
     * @return 结果
     */
    @Override
    public int insertPracticeAnswerSheet(PracticeAnswerSheet practiceAnswerSheet)
    {
        return practiceAnswerSheetMapper.insertPracticeAnswerSheet(practiceAnswerSheet);
    }

    /**
     * 修改练习答卷管理
     * 
     * @param practiceAnswerSheet 练习答卷管理
     * @return 结果
     */
    @Override
    public int updatePracticeAnswerSheet(PracticeAnswerSheet practiceAnswerSheet)
    {
        return practiceAnswerSheetMapper.updatePracticeAnswerSheet(practiceAnswerSheet);
    }

    /**
     * 批量删除练习答卷管理
     * 
     * @param ids 需要删除的练习答卷管理主键
     * @return 结果
     */
    @Override
    public int deletePracticeAnswerSheetByIds(String ids)
    {
        return practiceAnswerSheetMapper.deletePracticeAnswerSheetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除练习答卷管理信息
     * 
     * @param id 练习答卷管理主键
     * @return 结果
     */
    @Override
    public int deletePracticeAnswerSheetById(String id)
    {
        return practiceAnswerSheetMapper.deletePracticeAnswerSheetById(id);
    }
}
