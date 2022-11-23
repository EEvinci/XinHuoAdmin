package com.ruoyi.project.system.singlequestion.service;

import java.util.List;
import com.ruoyi.project.system.singlequestion.domain.SingleOptionQuestion;

/**
 * 单选题管理Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface ISingleOptionQuestionService 
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
     * 批量删除单选题管理
     * 
     * @param ids 需要删除的单选题管理主键集合
     * @return 结果
     */
    public int deleteSingleOptionQuestionByIds(String ids);

    /**
     * 删除单选题管理信息
     * 
     * @param id 单选题管理主键
     * @return 结果
     */
    public int deleteSingleOptionQuestionById(String id);
}
