package ec.zeng.dao;

import ec.zeng.model.License;

public interface LicenseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(License record);

    int insertSelective(License record);

    License selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(License record);

    int updateByPrimaryKey(License record);
}