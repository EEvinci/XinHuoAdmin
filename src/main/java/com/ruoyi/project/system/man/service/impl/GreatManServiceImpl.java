package com.ruoyi.project.system.man.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.man.mapper.GreatManMapper;
import com.ruoyi.project.system.man.domain.GreatMan;
import com.ruoyi.project.system.man.service.IGreatManService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 伟人管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class GreatManServiceImpl implements IGreatManService 
{
    @Autowired
    private GreatManMapper greatManMapper;

    /**
     * 查询伟人管理
     * 
     * @param id 伟人管理主键
     * @return 伟人管理
     */
    @Override
    public GreatMan selectGreatManById(String id)
    {
        return greatManMapper.selectGreatManById(id);
    }

    /**
     * 查询伟人管理列表
     * 
     * @param greatMan 伟人管理
     * @return 伟人管理
     */
    @Override
    public List<GreatMan> selectGreatManList(GreatMan greatMan)
    {
        return greatManMapper.selectGreatManList(greatMan);
    }

    /**
     * 新增伟人管理
     * 
     * @param greatMan 伟人管理
     * @return 结果
     */
    @Override
    public int insertGreatMan(GreatMan greatMan)
    {
        return greatManMapper.insertGreatMan(greatMan);
    }

    /**
     * 修改伟人管理
     * 
     * @param greatMan 伟人管理
     * @return 结果
     */
    @Override
    public int updateGreatMan(GreatMan greatMan)
    {
        return greatManMapper.updateGreatMan(greatMan);
    }

    /**
     * 批量删除伟人管理
     * 
     * @param ids 需要删除的伟人管理主键
     * @return 结果
     */
    @Override
    public int deleteGreatManByIds(String ids)
    {
        return greatManMapper.deleteGreatManByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除伟人管理信息
     * 
     * @param id 伟人管理主键
     * @return 结果
     */
    @Override
    public int deleteGreatManById(String id)
    {
        return greatManMapper.deleteGreatManById(id);
    }
}
