package cn.cllover.administration.controller;

import cn.cllover.administration.pojo.Students;
import cn.cllover.administration.service.StudentsService;
import cn.cllover.administration.util.Status;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    /**
     * 查询学生列表信息
     */
    @RequestMapping(value = "StudentList", method = RequestMethod.GET)
    @ResponseBody()
    public Status getStudentList(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //页码 数量
        PageHelper.startPage(pn, 5);
        List<Students> students = studentsService.getStudentList();
        //传入前台
        PageInfo pageInfo = new PageInfo(students, 5);
        return Status.success().add("pageInfo", pageInfo);

    }
    /*
    * 根据id查询
    * */

    @RequestMapping(value = "Student/{stuId}", method = RequestMethod.GET)
    @ResponseBody()
    public Status getStudent(@PathVariable("stuId")Long stuId){
        Students students =  studentsService.getStudent(stuId);
            /*System.out.println(students);*/
            return Status.success().add("stuId",students);

    }
    /*
     * 判断id是否存在
     * */
    @RequestMapping(value = "CheckStuId", method = RequestMethod.POST)
    @ResponseBody
    public Status CheckStudentId(@RequestParam("stuId") Long stuId){
        boolean check = studentsService.CheckStudentId(stuId);
        if (check) {
            return Status.success();
        }else{
            return Status.fail().add("stuId",stuId);
        }
    }
    /**
     * 删除学生列表信息
     */
    @RequestMapping(value = "StudentList/{Id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Status getStudentsListDelete(@PathVariable("Id") String Id) {
        Long stuId = Long.parseLong(Id);
        studentsService.getStudentsListDelete(stuId);
        return Status.success();
    }

    /*
     * 添加学生信息
     * */
    @RequestMapping(value = "/Student", method = RequestMethod.POST)
    @ResponseBody
    public Status SaveStudent(@RequestBody Students students,HttpServletRequest request) {
        try {
            studentsService.SaveStudent(students);
            System.out.println(students.getStuName());
        } catch (Exception e){
            e.printStackTrace();
        }
        return Status.success();
    }
    /*
    * 修改学生信息
    * */
    @RequestMapping(value = "StudentUpdate/{stuId}", method = RequestMethod.PUT)
    @ResponseBody
    public Status EditStudent(@RequestBody Students students,HttpServletRequest request){
        System.out.println(students);
        studentsService.EditStudent(students);
        return Status.success();
    }
    /*
    * 模糊查询
    * */
    @RequestMapping(value = "/getByName/{stuName}", method = RequestMethod.POST)
    @ResponseBody
    public Status getByName(@RequestParam(value = "pn", defaultValue = "1") Integer pn,  @PathVariable("stuName") String stuName) {
        //打印值
        System.out.println(stuName);
        PageHelper.startPage(pn, 5);
        List<Students> list = studentsService.getByName(stuName);
        //存入分页
        System.out.println("list:"+list);
        PageInfo<Students> pageInfo = new PageInfo(list, 5);
        //存入map
        return Status.success().add("pageInfo",pageInfo);
    }

}
