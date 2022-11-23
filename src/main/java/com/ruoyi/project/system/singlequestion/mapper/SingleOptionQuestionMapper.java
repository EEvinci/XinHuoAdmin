package com.ruoyi.project.system.singlequestion.mapper;

import java.util.List;
import com.ruoyi.project.system.singlequestion.domain.SingleOptionQuestion;

/**
 * 单选题管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface SingleOptionQuestionMapper 
{
    /**
     * 查询单选题管理
     * 
     * @param id 单选题管理主键
     * @return 单选题管理
     */
    public SingleOptionQuestion selectSingleOptionQuestionById(String id);

    /**
     * 查询单选题管理列表
     * 
     * @param singleOptionQuestion 单选题管理
     * @return 单选题管理集合
     */
    public List<SingleOptionQuestion> selectSingleOptionQuestionList(SingleOptionQuestion singleOptionQuestion);

    /**
     * 新增单选题管理
     * 
     * @param singleOptionQuestion 单选题管理
     * @return 结果
     */
    public int insertSingleOptionQuestion(SingleOptionQuestion singleOptionQuestion);

    /**
     * 修改单选题管理
     * 
     * @param singleOptionQuestion 单选题管理
     * @return 结果
     */
    public int updateSingleOptionQuestion(SingleOptionQuestion singleOptionQuestion);

    /**
     * 删除单选题管理
     * 
     * @param id 单选题管理主键
     * @return 结果
     */
    public int deleteSingleOptionQuestionById(String id);

    /**
     * 批量删除单选题管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSingleOptionQuestionByIds(String[] ids);
}
