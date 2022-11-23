package com.ruoyi.project.system.signrecordmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.signrecordmy.mapper.SignInRecordMyMapper;
import com.ruoyi.project.system.signrecordmy.domain.SignInRecordMy;
import com.ruoyi.project.system.signrecordmy.service.ISignInRecordMyService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 管理签到Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class SignInRecordMyServiceImpl implements ISignInRecordMyService 
{
    @Autowired
    private SignInRecordMyMapper signInRecordMyMapper;

    /**
     * 查询管理签到
     * 
     * @param id 管理签到主键
     * @return 管理签到
     */
    @Override
    public SignInRecordMy selectSignInRecordMyById(String id)
    {
        return signInRecordMyMapper.selectSignInRecordMyById(id);
    }

    /**
     * 查询管理签到列表
     * 
     * @param signInRecordMy 管理签到
     * @return 管理签到
     */
    @Override
    public List<SignInRecordMy> selectSignInRecordMyList(SignInRecordMy signInRecordMy)
    {
        return signInRecordMyMapper.selectSignInRecordMyList(signInRecordMy);
    }

    /**
     * 新增管理签到
     * 
     * @param signInRecordMy 管理签到
     * @return 结果
     */
    @Override
    public int insertSignInRecordMy(SignInRecordMy signInRecordMy)
    {
        return signInRecordMyMapper.insertSignInRecordMy(signInRecordMy);
    }

    /**
     * 修改管理签到
     * 
     * @param signInRecordMy 管理签到
     * @return 结果
     */
    @Override
    public int updateSignInRecordMy(SignInRecordMy signInRecordMy)
    {
        return signInRecordMyMapper.updateSignInRecordMy(signInRecordMy);
    }

    /**
     * 批量删除管理签到
     * 
     * @param ids 需要删除的管理签到主键
     * @return 结果
     */
    @Override
    public int deleteSignInRecordMyByIds(String ids)
    {
        return signInRecordMyMapper.deleteSignInRecordMyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除管理签到信息
     * 
     * @param id 管理签到主键
     * @return 结果
     */
    @Override
    public int deleteSignInRecordMyById(String id)
    {
        return signInRecordMyMapper.deleteSignInRecordMyById(id);
    }
}
