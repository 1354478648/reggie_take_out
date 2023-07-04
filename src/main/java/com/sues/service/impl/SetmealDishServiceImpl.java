package com.sues.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sues.entity.SetmealDish;
import com.sues.mapper.SetmealDishMapper;
import com.sues.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
