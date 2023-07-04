package com.sues.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sues.entity.Employee;
import com.sues.mapper.EmployeeMapper;
import com.sues.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService{
}
