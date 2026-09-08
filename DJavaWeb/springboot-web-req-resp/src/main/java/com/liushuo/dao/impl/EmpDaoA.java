package com.liushuo.dao.impl;

import com.liushuo.dao.EmpDao;
import com.liushuo.pojo.Emp;
import com.liushuo.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Component // 将当前类交给 IOC 容器管理，成为 IOC 容器中的 Bean
@Repository //  @Component 的衍生注解，特指数据访问层
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        // 1、加载并解析 xml 文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
