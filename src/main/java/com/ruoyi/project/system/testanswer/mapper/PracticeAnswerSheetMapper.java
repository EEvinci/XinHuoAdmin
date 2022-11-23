package com.ruoyi.project.system.testanswer.mapper;

import java.util.List;
import com.ruoyi.project.system.testanswer.domain.PracticeAnswerSheet;

/**
 * 练习答卷管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface PracticeAnswerSheetMapper 
{
    /**
     * 查询练习答卷管理
     * 
     * @param id 练习答卷管理主键
     * @return 练习答卷管理
     */
    public PracticeAnswerSheet selectPracticeAnswerSheetById(String id);

    /**
     * 查询练习答卷管理列表
     * 
     * @param practiceAnswerSheet 练习答卷管理
     * @return 练习答卷管理集合
     */
    public List<PracticeAnswerSheet> selectPracticeAnswerSheetList(PracticeAnswerSheet practiceAnswerSheet);

    /**
     * 新增练习答卷管理
     * 
     * @param practiceAnswerSheet 练习答卷管理
     * @return 结果
     */
    public int insertPracticeAnswerSheet(PracticeAnswerSheet practiceAnswerSheet);

    /**
     * 修改练习答卷管理
     * 
     * @param practiceAnswerSheet 练习答卷管理
     * @return 结果
     */
    public int updatePracticeAnswerSheet(PracticeAnswerSheet practiceAnswerSheet);

    /**
     * 删除练习答卷管理
     * 
     * @param id 练习答卷管理主键
     * @return 结果
     */
    public int deletePracticeAnswerSheetById(String id);

    /**
     * 批量删除练习答卷管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePracticeAnswerSheetByIds(String[] ids);
}
