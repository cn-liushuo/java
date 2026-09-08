package com.liushuo.service.impl;

import com.liushuo.dao.EmpDao;
import com.liushuo.pojo.Emp;
import com.liushuo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

// @Primary // 设置 Bean 的优先级为最高(解决Bean冲突的第一种方式)
// @Component // 将当前类交给 IOC 容器管理，成为 IOC 容器中的 Bean
@Service //  @Component 的衍生注解，特指逻辑处理层
public class EmpServiceA implements EmpService {

    @Autowired // 运行时 IOC 容器会提供该类型的 Bean 对象，并赋值给该变量 - 依赖注入
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        // 1、调用 dao ，获取数据
        List<Emp> empList = empDao.listEmp();
        // 2、对数据进行转换处理 - gender，job
        empList.stream().forEach(emp -> {
            // 处理 gender - 1: 男, 2: 女
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }

            // 处理 job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });

        return empList;
    }
}
