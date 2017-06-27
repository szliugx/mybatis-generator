package com.youban.ssm.mapper;

import com.youban.ssm.pojo.BusOrder;
import com.youban.ssm.pojo.BusOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusOrderMapper {
    long countByExample(BusOrderExample example);

    int deleteByExample(BusOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusOrder record);

    int insertSelective(BusOrder record);

    List<BusOrder> selectByExampleWithBLOBs(BusOrderExample example);

    List<BusOrder> selectByExample(BusOrderExample example);

    BusOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusOrder record, @Param("example") BusOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") BusOrder record, @Param("example") BusOrderExample example);

    int updateByExample(@Param("record") BusOrder record, @Param("example") BusOrderExample example);

    int updateByPrimaryKeySelective(BusOrder record);

    int updateByPrimaryKeyWithBLOBs(BusOrder record);

    int updateByPrimaryKey(BusOrder record);
}