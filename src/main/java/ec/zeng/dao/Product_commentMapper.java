package ec.zeng.dao;

import ec.zeng.model.Product_comment;

public interface Product_commentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_comment record);

    int insertSelective(Product_comment record);

    Product_comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_comment record);

    int updateByPrimaryKey(Product_comment record);
}