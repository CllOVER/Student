package cn.cllover.administration.service;

import cn.cllover.administration.dao.RollMapper;
import cn.cllover.administration.dao.StudentsMapper;
import cn.cllover.administration.pojo.Roll;
import cn.cllover.administration.pojo.RollExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentShowService {

    @Autowired
    private StudentsMapper studentsMapper;
    @Autowired
    private RollMapper rollMapper;

    //检查
    public boolean CheckStuRollId(Long stuRollId) {
        RollExample rollExample = new RollExample();
        RollExample.Criteria criteria = rollExample.createCriteria();
        //判断
        criteria.andRollIdEqualTo(stuRollId);
        long count = rollMapper.countByExample(rollExample);
        return count == 1;
    }


    public Roll getShow(Long stuRollId) {
        return rollMapper.selectByWithThirdPrimaryKey(stuRollId);
    }
}
