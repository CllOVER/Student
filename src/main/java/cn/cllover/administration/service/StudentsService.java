package cn.cllover.administration.service;

import cn.cllover.administration.dao.StudentsMapper;
import cn.cllover.administration.pojo.Students;
import cn.cllover.administration.pojo.StudentsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {


    @Autowired
    private StudentsMapper studentsMapper;

    //查询
    public List<Students> getStudentList() {
         return studentsMapper.selectByWithNationExample(null);
    }

    //单个删除
    public void getStudentsListDelete(Long stuId) {
        studentsMapper.deleteByPrimaryKey(stuId);
    }

    //保存这个
    public void SaveStudent(Students students){
       try {
           studentsMapper.insertSelective(students);
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    //通过名字查询
    public List<Students> getByName(String stuName) {
        return studentsMapper.getByStuName(stuName);
    }

    //修改
    public void EditStudent(Students students) {
        studentsMapper.updateByPrimaryKeySelective(students);
    }

    //根据id查询
    public Students getStudent(Long stuId) {
          return studentsMapper.selectByWithNationPrimaryKey(stuId);
    }
//检查是否存在
    public boolean CheckStudentId(Long stuId) {
        StudentsExample studentsExample = new StudentsExample();
        StudentsExample.Criteria criteria = studentsExample.createCriteria();
        criteria.andStuIdEqualTo(stuId);
        long count = studentsMapper.countByExample(studentsExample);
        return count == 1;
    }
}
