package cn.cllover.administration.service;

import cn.cllover.administration.dao.RollMapper;
import cn.cllover.administration.dao.StudentsMapper;
import cn.cllover.administration.pojo.Roll;
import cn.cllover.administration.pojo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RollService {

    @Autowired
    private RollMapper rollMapper;

    @Autowired
    private StudentsMapper studentsMapper;
    //查询列表
    public List<Roll> getRollList() {
        return rollMapper.selectByWithThirdExample(null);
    }

    //根据id删除
    public void DeleteRollList(Long rollId) {
        rollMapper.deleteByPrimaryKey(rollId);
    }


    public void SaveRoll(Roll roll) {
        rollMapper.insertSelective(roll);
    }
}
