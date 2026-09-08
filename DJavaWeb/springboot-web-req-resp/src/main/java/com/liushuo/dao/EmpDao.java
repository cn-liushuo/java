package com.liushuo.dao;

import com.liushuo.pojo.Emp;

import java.util.List;

public interface EmpDao {
    // 获取员工列表数据
    public List<Emp> listEmp();
}
