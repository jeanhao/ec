package ec.zeng.dao;

import ec.zeng.model.System_message;

public interface System_messageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(System_message record);

    int insertSelective(System_message record);

    System_message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(System_message record);

    int updateByPrimaryKey(System_message record);
}