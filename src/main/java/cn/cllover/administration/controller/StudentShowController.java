package cn.cllover.administration.controller;

import cn.cllover.administration.pojo.Roll;
import cn.cllover.administration.service.StudentShowService;
import cn.cllover.administration.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentShowController {

    @Autowired
    private StudentShowService studentShowService;


    /*
    * 根据id 查询
    * */
    @RequestMapping(value = "ShowStuRollId/{stuRollId}", method = RequestMethod.GET)
    @ResponseBody
    public Status getShow(@PathVariable Long stuRollId){

        Roll roll  = studentShowService.getShow(stuRollId);
        return Status.success().add("RollSHow",roll);
    }

    /*
     * 判断id是否存在
     * */
    @RequestMapping(value = "CheckStuRollId", method = RequestMethod.POST)
    @ResponseBody
    public Status CheckStuRollId(@RequestParam("stuRollId") Long stuRollId){
        boolean check = studentShowService.CheckStuRollId(stuRollId);
        if (check) {
            return Status.success();
        }else{
            return Status.fail().add("stuRollId",stuRollId);
        }
    }
}
