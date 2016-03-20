package ec.zeng.dao;

import ec.zeng.model.User_product_attend;

public interface User_product_attendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_product_attend record);

    int insertSelective(User_product_attend record);

    User_product_attend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_product_attend record);

    int updateByPrimaryKey(User_product_attend record);
}