package ec.zeng.dao;

import ec.zeng.model.Seller_message;

public interface Seller_messageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seller_message record);

    int insertSelective(Seller_message record);

    Seller_message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Seller_message record);

    int updateByPrimaryKey(Seller_message record);
}