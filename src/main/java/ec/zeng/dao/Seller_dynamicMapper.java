package ec.zeng.dao;

import ec.zeng.model.Seller_dynamic;

public interface Seller_dynamicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seller_dynamic record);

    int insertSelective(Seller_dynamic record);

    Seller_dynamic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Seller_dynamic record);

    int updateByPrimaryKey(Seller_dynamic record);
}