package com.ruoyi.project.system.notification.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.notification.mapper.MessageNotificationMapper;
import com.ruoyi.project.system.notification.domain.MessageNotification;
import com.ruoyi.project.system.notification.service.IMessageNotificationService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 管理通知Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
@Service
public class MessageNotificationServiceImpl implements IMessageNotificationService 
{
    @Autowired
    private MessageNotificationMapper messageNotificationMapper;

    /**
     * 查询管理通知
     * 
     * @param id 管理通知主键
     * @return 管理通知
     */
    @Override
    public MessageNotification selectMessageNotificationById(String id)
    {
        return messageNotificationMapper.selectMessageNotificationById(id);
    }

    /**
     * 查询管理通知列表
     * 
     * @param messageNotification 管理通知
     * @return 管理通知
     */
    @Override
    public List<MessageNotification> selectMessageNotificationList(MessageNotification messageNotification)
    {
        return messageNotificationMapper.selectMessageNotificationList(messageNotification);
    }

    /**
     * 新增管理通知
     * 
     * @param messageNotification 管理通知
     * @return 结果
     */
    @Override
    public int insertMessageNotification(MessageNotification messageNotification)
    {
        return messageNotificationMapper.insertMessageNotification(messageNotification);
    }

    /**
     * 修改管理通知
     * 
     * @param messageNotification 管理通知
     * @return 结果
     */
    @Override
    public int updateMessageNotification(MessageNotification messageNotification)
    {
        return messageNotificationMapper.updateMessageNotification(messageNotification);
    }

    /**
     * 批量删除管理通知
     * 
     * @param ids 需要删除的管理通知主键
     * @return 结果
     */
    @Override
    public int deleteMessageNotificationByIds(String ids)
    {
        return messageNotificationMapper.deleteMessageNotificationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除管理通知信息
     * 
     * @param id 管理通知主键
     * @return 结果
     */
    @Override
    public int deleteMessageNotificationById(String id)
    {
        return messageNotificationMapper.deleteMessageNotificationById(id);
    }
}
