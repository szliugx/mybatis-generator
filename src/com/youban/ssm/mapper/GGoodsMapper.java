package com.youban.ssm.mapper;

import com.youban.ssm.pojo.GGoods;
import com.youban.ssm.pojo.GGoodsExample;
import com.youban.ssm.pojo.GGoodsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GGoodsMapper {
    long countByExample(GGoodsExample example);

    int deleteByExample(GGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GGoodsWithBLOBs record);

    int insertSelective(GGoodsWithBLOBs record);

    List<GGoodsWithBLOBs> selectByExampleWithBLOBs(GGoodsExample example);

    List<GGoods> selectByExample(GGoodsExample example);

    GGoodsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GGoodsWithBLOBs record, @Param("example") GGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") GGoodsWithBLOBs record, @Param("example") GGoodsExample example);

    int updateByExample(@Param("record") GGoods record, @Param("example") GGoodsExample example);

    int updateByPrimaryKeySelective(GGoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GGoodsWithBLOBs record);

    int updateByPrimaryKey(GGoods record);
}