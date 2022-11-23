package com.ruoyi.project.system.man.service;

import java.util.List;
import com.ruoyi.project.system.man.domain.GreatMan;

/**
 * 伟人管理Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface IGreatManService 
{
    /**
     * 查询伟人管理
     * 
     * @param id 伟人管理主键
     * @return 伟人管理
     */
    public GreatMan selectGreatManById(String id);

    /**
     * 查询伟人管理列表
     * 
     * @param greatMan 伟人管理
     * @return 伟人管理集合
     */
    public List<GreatMan> selectGreatManList(GreatMan greatMan);

    /**
     * 新增伟人管理
     * 
     * @param greatMan 伟人管理
     * @return 结果
     */
    public int insertGreatMan(GreatMan greatMan);

    /**
     * 修改伟人管理
     * 
     * @param greatMan 伟人管理
     * @return 结果
     */
    public int updateGreatMan(GreatMan greatMan);

    /**
     * 批量删除伟人管理
     * 
     * @param ids 需要删除的伟人管理主键集合
     * @return 结果
     */
    public int deleteGreatManByIds(String ids);

    /**
     * 删除伟人管理信息
     * 
     * @param id 伟人管理主键
     * @return 结果
     */
    public int deleteGreatManById(String id);
}
