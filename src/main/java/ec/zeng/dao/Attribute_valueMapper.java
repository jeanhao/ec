package ec.zeng.dao;

import ec.zeng.model.Attribute_value;

public interface Attribute_valueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attribute_value record);

    int insertSelective(Attribute_value record);

    Attribute_value selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attribute_value record);

    int updateByPrimaryKey(Attribute_value record);
}