package ec.zeng.dao;

import ec.zeng.model.System_reply_message;

public interface System_reply_messageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(System_reply_message record);

    int insertSelective(System_reply_message record);

    System_reply_message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(System_reply_message record);

    int updateByPrimaryKey(System_reply_message record);
}