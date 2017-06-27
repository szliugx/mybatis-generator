package com.youban.ssm.mapper;

import com.youban.ssm.pojo.CCard;
import com.youban.ssm.pojo.CCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CCardMapper {
    long countByExample(CCardExample example);

    int deleteByExample(CCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CCard record);

    int insertSelective(CCard record);

    List<CCard> selectByExample(CCardExample example);

    CCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CCard record, @Param("example") CCardExample example);

    int updateByExample(@Param("record") CCard record, @Param("example") CCardExample example);

    int updateByPrimaryKeySelective(CCard record);

    int updateByPrimaryKey(CCard record);
}