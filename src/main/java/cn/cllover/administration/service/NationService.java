package cn.cllover.administration.service;

import cn.cllover.administration.dao.NationMapper;
import cn.cllover.administration.pojo.Nation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationService {

    @Autowired
    private NationMapper nationMapper;


    public List<Nation> getNationList() {
        return nationMapper.selectByExample(null);
    }
}
