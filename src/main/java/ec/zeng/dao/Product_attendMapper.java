package ec.zeng.dao;

import ec.zeng.model.Product_attend;

public interface Product_attendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_attend record);

    int insertSelective(Product_attend record);

    Product_attend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_attend record);

    int updateByPrimaryKey(Product_attend record);
}