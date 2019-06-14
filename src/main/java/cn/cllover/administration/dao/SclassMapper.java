package cn.cllover.administration.dao;

import cn.cllover.administration.pojo.Sclass;
import cn.cllover.administration.pojo.SclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SclassMapper {
    long countByExample(SclassExample example);

    int deleteByExample(SclassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(Sclass record);

    int insertSelective(Sclass record);

    List<Sclass> selectByExample(SclassExample example);

    Sclass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") Sclass record, @Param("example") SclassExample example);

    int updateByExample(@Param("record") Sclass record, @Param("example") SclassExample example);

    int updateByPrimaryKeySelective(Sclass record);

    int updateByPrimaryKey(Sclass record);
}