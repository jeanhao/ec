package ec.zeng.dao;

import ec.zeng.model.User_seller_attend;

public interface User_seller_attendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_seller_attend record);

    int insertSelective(User_seller_attend record);

    User_seller_attend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_seller_attend record);

    int updateByPrimaryKey(User_seller_attend record);
}