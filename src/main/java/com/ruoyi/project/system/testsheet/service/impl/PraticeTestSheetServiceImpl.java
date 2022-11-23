package com.ruoyi.project.system.testsheet.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.testsheet.mapper.PraticeTestSheetMapper;
import com.ruoyi.project.system.testsheet.domain.PraticeTestSheet;
import com.ruoyi.project.system.testsheet.service.IPraticeTestSheetService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 练习试卷管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-21
 */
@Service
public class PraticeTestSheetServiceImpl implements IPraticeTestSheetService 
{
    @Autowired
    private PraticeTestSheetMapper praticeTestSheetMapper;

    /**
     * 查询练习试卷管理
     * 
     * @param id 练习试卷管理主键
     * @return 练习试卷管理
     */
    @Override
    public PraticeTestSheet selectPraticeTestSheetById(String id)
    {
        return praticeTestSheetMapper.selectPraticeTestSheetById(id);
    }

    /**
     * 查询练习试卷管理列表
     * 
     * @param praticeTestSheet 练习试卷管理
     * @return 练习试卷管理
     */
    @Override
    public List<PraticeTestSheet> selectPraticeTestSheetList(PraticeTestSheet praticeTestSheet)
    {
        return praticeTestSheetMapper.selectPraticeTestSheetList(praticeTestSheet);
    }

    /**
     * 新增练习试卷管理
     * 
     * @param praticeTestSheet 练习试卷管理
     * @return 结果
     */
    @Override
    public int insertPraticeTestSheet(PraticeTestSheet praticeTestSheet)
    {
        return praticeTestSheetMapper.insertPraticeTestSheet(praticeTestSheet);
    }

    /**
     * 修改练习试卷管理
     * 
     * @param praticeTestSheet 练习试卷管理
     * @return 结果
     */
    @Override
    public int updatePraticeTestSheet(PraticeTestSheet praticeTestSheet)
    {
        return praticeTestSheetMapper.updatePraticeTestSheet(praticeTestSheet);
    }

    /**
     * 批量删除练习试卷管理
     * 
     * @param ids 需要删除的练习试卷管理主键
     * @return 结果
     */
    @Override
    public int deletePraticeTestSheetByIds(String ids)
    {
        return praticeTestSheetMapper.deletePraticeTestSheetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除练习试卷管理信息
     * 
     * @param id 练习试卷管理主键
     * @return 结果
     */
    @Override
    public int deletePraticeTestSheetById(String id)
    {
        return praticeTestSheetMapper.deletePraticeTestSheetById(id);
    }
}
