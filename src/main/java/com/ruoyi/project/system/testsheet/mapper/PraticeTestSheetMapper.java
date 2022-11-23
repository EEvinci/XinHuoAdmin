package com.ruoyi.project.system.testsheet.mapper;

import java.util.List;
import com.ruoyi.project.system.testsheet.domain.PraticeTestSheet;

/**
 * 练习试卷管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-21
 */
public interface PraticeTestSheetMapper 
{
    /**
     * 查询练习试卷管理
     * 
     * @param id 练习试卷管理主键
     * @return 练习试卷管理
     */
    public PraticeTestSheet selectPraticeTestSheetById(String id);

    /**
     * 查询练习试卷管理列表
     * 
     * @param praticeTestSheet 练习试卷管理
     * @return 练习试卷管理集合
     */
    public List<PraticeTestSheet> selectPraticeTestSheetList(PraticeTestSheet praticeTestSheet);

    /**
     * 新增练习试卷管理
     * 
     * @param praticeTestSheet 练习试卷管理
     * @return 结果
     */
    public int insertPraticeTestSheet(PraticeTestSheet praticeTestSheet);

    /**
     * 修改练习试卷管理
     * 
     * @param praticeTestSheet 练习试卷管理
     * @return 结果
     */
    public int updatePraticeTestSheet(PraticeTestSheet praticeTestSheet);

    /**
     * 删除练习试卷管理
     * 
     * @param id 练习试卷管理主键
     * @return 结果
     */
    public int deletePraticeTestSheetById(String id);

    /**
     * 批量删除练习试卷管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePraticeTestSheetByIds(String[] ids);
}
