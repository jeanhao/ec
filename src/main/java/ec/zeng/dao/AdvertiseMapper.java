package ec.zeng.dao;

import ec.zeng.model.Advertise;

public interface AdvertiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertise record);

    int insertSelective(Advertise record);

    Advertise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Advertise record);

    int updateByPrimaryKey(Advertise record);
}