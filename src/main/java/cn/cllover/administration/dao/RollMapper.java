package cn.cllover.administration.dao;

import cn.cllover.administration.pojo.Roll;
import cn.cllover.administration.pojo.RollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RollMapper {
    long countByExample(RollExample example);

    int deleteByExample(RollExample example);

    int deleteByPrimaryKey(Long rollId);

    int insert(Roll record);

    int insertSelective(Roll record);

    List<Roll> selectByExample(RollExample example);

    Roll selectByPrimaryKey(Long rollId);

    List<Roll> selectByWithThirdExample(RollExample example);

    Roll selectByWithThirdPrimaryKey(Long rollId);


    int updateByExampleSelective(@Param("record") Roll record, @Param("example") RollExample example);

    int updateByExample(@Param("record") Roll record, @Param("example") RollExample example);

    int updateByPrimaryKeySelective(Roll record);

    int updateByPrimaryKey(Roll record);
}