package cn.cllover.administration.controller;

import cn.cllover.administration.pojo.Nation;
import cn.cllover.administration.service.NationService;
import cn.cllover.administration.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NationController {

    @Autowired
    private NationService nationService;


    /**
     * 查询民族所有列表
     * @return
     */
    @RequestMapping(value = "/NationList",method = RequestMethod.GET)
    @ResponseBody
    public Status getNationList(){
       List<Nation> nation =  nationService.getNationList();
       return Status.success().add("NationList",nation);
    }
}
