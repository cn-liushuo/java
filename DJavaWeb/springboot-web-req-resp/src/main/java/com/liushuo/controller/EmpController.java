package com.liushuo.controller;

import com.liushuo.pojo.Emp;
import com.liushuo.pojo.Result;
import com.liushuo.service.EmpService;
import com.liushuo.service.impl.EmpServiceA;
import com.liushuo.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    // @Qualifier("empServiceA") // 使用 Bean 名直接指定(解决Bean冲突的第二种方式)[Spring 提供，按照类型注入]
    // @Autowired
    // private EmpService empService;

    @Resource(name = "empServiceB") // 使用 Bean 名直接指定(解决Bean冲突的第三种方式)[JDK 提供，按照名称注入]
    private EmpService empService;

    // 三层架构的方法
    @RequestMapping("/listEmp")
    public Result list() {
        // 1、调用 service，获取数据
        List<Emp> empList = empService.listEmp();
        // 3、响应数据
        return Result.success(empList);
    }

    // 没有三层架构的方法
    // @RequestMapping("/listEmp")
    // public Result list() {
    //     // 1、加载并解析 xml 文件
    //     String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
    //     System.out.println(file);
    //     List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
    //
    //     // 2、对数据进行转换处理 - gender，job
    //     empList.stream().forEach(emp -> {
    //         // 处理 gender - 1: 男, 2: 女
    //         String gender = emp.getGender();
    //         if ("1".equals(gender)) {
    //             emp.setGender("男");
    //         } else if ("2".equals(gender)) {
    //             emp.setGender("女");
    //         }
    //
    //         // 处理 job - 1: 讲师, 2: 班主任 , 3: 就业指导
    //         String job = emp.getJob();
    //         if ("1".equals(job)) {
    //             emp.setJob("讲师");
    //         } else if ("2".equals(job)) {
    //             emp.setJob("班主任");
    //         } else if ("3".equals(job)) {
    //             emp.setJob("就业指导");
    //         }
    //     });
    //
    //     // 3、响应数据
    //     return Result.success(empList);
    // }
}
