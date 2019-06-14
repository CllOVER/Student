package cn.cllover.administration.dao;

import cn.cllover.administration.pojo.Students;
import cn.cllover.administration.pojo.StudentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsMapper {
    long countByExample(StudentsExample example);

    int deleteByExample(StudentsExample example);

    int deleteByPrimaryKey(Long stuId);

    int insert(Students record);

    int insertSelective(Students record);

    List<Students> selectByWithNationExample(StudentsExample example);

    List<Students> getByStuName(@Param("stuName")String stuName);

    Students selectByWithNationPrimaryKey(Long stuId);

    List<Students> selectByExample(StudentsExample example);

    //List<Students>
    List<Students> selectByPrimaryKey(Long stuId);

    int updateByExampleSelective(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByExample(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}