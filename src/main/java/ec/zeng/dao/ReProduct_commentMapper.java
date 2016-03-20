package ec.zeng.dao;

import ec.zeng.model.ReProduct_comment;

public interface ReProduct_commentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReProduct_comment record);

    int insertSelective(ReProduct_comment record);

    ReProduct_comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReProduct_comment record);

    int updateByPrimaryKey(ReProduct_comment record);
}