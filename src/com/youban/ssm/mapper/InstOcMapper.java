package com.youban.ssm.mapper;

import com.youban.ssm.pojo.InstOc;
import com.youban.ssm.pojo.InstOcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstOcMapper {
    long countByExample(InstOcExample example);

    int deleteByExample(InstOcExample example);

    int deleteByPrimaryKey(Long ocId);

    int insert(InstOc record);

    int insertSelective(InstOc record);

    List<InstOc> selectByExample(InstOcExample example);

    InstOc selectByPrimaryKey(Long ocId);

    int updateByExampleSelective(@Param("record") InstOc record, @Param("example") InstOcExample example);

    int updateByExample(@Param("record") InstOc record, @Param("example") InstOcExample example);

    int updateByPrimaryKeySelective(InstOc record);

    int updateByPrimaryKey(InstOc record);
}