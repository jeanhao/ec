package ec.zeng.dao;

import ec.zeng.model.Seller_reply_message;

public interface Seller_reply_messageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seller_reply_message record);

    int insertSelective(Seller_reply_message record);

    Seller_reply_message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Seller_reply_message record);

    int updateByPrimaryKey(Seller_reply_message record);
}