package ec.zeng.dao;

import ec.zeng.model.Public_Notice;

public interface Public_NoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Public_Notice record);

    int insertSelective(Public_Notice record);

    Public_Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Public_Notice record);

    int updateByPrimaryKey(Public_Notice record);
}