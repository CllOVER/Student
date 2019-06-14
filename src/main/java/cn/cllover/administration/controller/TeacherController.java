package cn.cllover.administration.controller;

import cn.cllover.administration.pojo.Teacher;
import cn.cllover.administration.service.TeacherService;
import cn.cllover.administration.util.Status;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "TeachersLists",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getTeachersLists(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<Teacher> list = teacherService.getTeachersLists();
        PageInfo pageInfo = new PageInfo(list,5);
        Map map = new HashMap();
        map.put("pageInfo",pageInfo);
        return map;
    }

    @RequestMapping(value = "Teacherstatus/{teaId}",method = RequestMethod.PUT)
    @ResponseBody
    public Status updateStatus(Teacher teacher){
        teacherService.updateStatus(teacher);
        return Status.success();
    }
}
