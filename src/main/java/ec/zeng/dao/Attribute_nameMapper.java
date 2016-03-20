package ec.zeng.dao;

import ec.zeng.model.Attribute_name;

public interface Attribute_nameMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attribute_name record);

    int insertSelective(Attribute_name record);

    Attribute_name selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attribute_name record);

    int updateByPrimaryKey(Attribute_name record);
}