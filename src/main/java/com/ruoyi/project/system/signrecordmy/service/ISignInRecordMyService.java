package com.ruoyi.project.system.signrecordmy.service;

import java.util.List;
import com.ruoyi.project.system.signrecordmy.domain.SignInRecordMy;

/**
 * 管理签到Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface ISignInRecordMyService 
{
    /**
     * 查询管理签到
     * 
     * @param id 管理签到主键
     * @return 管理签到
     */
    public SignInRecordMy selectSignInRecordMyById(String id);

    /**
     * 查询管理签到列表
     * 
     * @param signInRecordMy 管理签到
     * @return 管理签到集合
     */
    public List<SignInRecordMy> selectSignInRecordMyList(SignInRecordMy signInRecordMy);

    /**
     * 新增管理签到
     * 
     * @param signInRecordMy 管理签到
     * @return 结果
     */
    public int insertSignInRecordMy(SignInRecordMy signInRecordMy);

    /**
     * 修改管理签到
     * 
     * @param signInRecordMy 管理签到
     * @return 结果
     */
    public int updateSignInRecordMy(SignInRecordMy signInRecordMy);

    /**
     * 批量删除管理签到
     * 
     * @param ids 需要删除的管理签到主键集合
     * @return 结果
     */
    public int deleteSignInRecordMyByIds(String ids);

    /**
     * 删除管理签到信息
     * 
     * @param id 管理签到主键
     * @return 结果
     */
    public int deleteSignInRecordMyById(String id);
}
