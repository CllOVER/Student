package cn.cllover.administration.service;

import cn.cllover.administration.dao.TeacherMapper;
import cn.cllover.administration.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> getTeachersLists() {
        return teacherMapper.selectByWithNationExample(null);
    }

    public void updateStatus(Teacher teacher) {

         teacherMapper.updateByPrimaryKeySelective(teacher);
    }

}
