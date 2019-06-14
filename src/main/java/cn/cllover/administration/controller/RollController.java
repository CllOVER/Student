package cn.cllover.administration.controller;

import cn.cllover.administration.pojo.Roll;
import cn.cllover.administration.pojo.Students;
import cn.cllover.administration.service.RollService;
import cn.cllover.administration.util.Status;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RollController {

    @Autowired
    private RollService rollService;

    /*
    *学籍信息列表
    */
    @RequestMapping(value = "RollList",method = RequestMethod.GET)
    @ResponseBody
    public Status getRollList(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<Roll> roll = rollService.getRollList();
        PageInfo pageInfo = new PageInfo(roll,5);
        return Status.success().add("pageInfo",pageInfo);

    }

    /*
    * 删除学籍信息
    * */
    @RequestMapping(value = "RollList/{Id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Status DeleteRollList(@PathVariable("Id") String RollId){
        System.out.println("执行成功");
        Long rollId = Long.parseLong(RollId);
        rollService.DeleteRollList(rollId);
        System.out.println(rollId);
        return Status.success();
    }

    @RequestMapping(value = "Roll",method = RequestMethod.POST)
    @ResponseBody
    public Status SaveRoll(@RequestParam Roll roll){

        rollService.SaveRoll(roll);
        System.out.println(roll.getRollStatus());
        return Status.success();
    }



}
