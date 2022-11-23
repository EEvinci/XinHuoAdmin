package com.ruoyi.project.system.examsheet.mapper;

import java.util.List;
import com.ruoyi.project.system.examsheet.domain.ExamTestSheet;

/**
 * 考卷管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-21
 */
public interface ExamTestSheetMapper 
{
    /**
     * 查询考卷管理
     * 
     * @param id 考卷管理主键
     * @return 考卷管理
     */
    public ExamTestSheet selectExamTestSheetById(String id);

    /**
     * 查询考卷管理列表
     * 
     * @param examTestSheet 考卷管理
     * @return 考卷管理集合
     */
    public List<ExamTestSheet> selectExamTestSheetList(ExamTestSheet examTestSheet);

    /**
     * 新增考卷管理
     * 
     * @param examTestSheet 考卷管理
     * @return 结果
     */
    public int insertExamTestSheet(ExamTestSheet examTestSheet);

    /**
     * 修改考卷管理
     * 
     * @param examTestSheet 考卷管理
     * @return 结果
     */
    public int updateExamTestSheet(ExamTestSheet examTestSheet);

    /**
     * 删除考卷管理
     * 
     * @param id 考卷管理主键
     * @return 结果
     */
    public int deleteExamTestSheetById(String id);

    /**
     * 批量删除考卷管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamTestSheetByIds(String[] ids);
}
