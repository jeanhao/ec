package ec.zeng.dao;

import ec.zeng.model.Specs_amount;

public interface Specs_amountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Specs_amount record);

    int insertSelective(Specs_amount record);

    Specs_amount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Specs_amount record);

    int updateByPrimaryKey(Specs_amount record);
}