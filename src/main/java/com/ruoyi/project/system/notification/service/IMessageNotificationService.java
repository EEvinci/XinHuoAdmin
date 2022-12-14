package com.ruoyi.project.system.notification.service;

import java.util.List;
import com.ruoyi.project.system.notification.domain.MessageNotification;

/**
 * 管理通知Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface IMessageNotificationService 
{
    /**
     * 查询管理通知
     * 
     * @param id 管理通知主键
     * @return 管理通知
     */
    public MessageNotification selectMessageNotificationById(String id);

    /**
     * 查询管理通知列表
     * 
     * @param messageNotification 管理通知
     * @return 管理通知集合
     */
    public List<MessageNotification> selectMessageNotificationList(MessageNotification messageNotification);

    /**
     * 新增管理通知
     * 
     * @param messageNotification 管理通知
     * @return 结果
     */
    public int insertMessageNotification(MessageNotification messageNotification);

    /**
     * 修改管理通知
     * 
     * @param messageNotification 管理通知
     * @return 结果
     */
    public int updateMessageNotification(MessageNotification messageNotification);

    /**
     * 批量删除管理通知
     * 
     * @param ids 需要删除的管理通知主键集合
     * @return 结果
     */
    public int deleteMessageNotificationByIds(String ids);

    /**
     * 删除管理通知信息
     * 
     * @param id 管理通知主键
     * @return 结果
     */
    public int deleteMessageNotificationById(String id);
}
