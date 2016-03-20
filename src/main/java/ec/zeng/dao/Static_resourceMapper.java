package ec.zeng.dao;

import ec.zeng.model.Static_resource;

public interface Static_resourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Static_resource record);

    int insertSelective(Static_resource record);

    Static_resource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Static_resource record);

    int updateByPrimaryKey(Static_resource record);
}