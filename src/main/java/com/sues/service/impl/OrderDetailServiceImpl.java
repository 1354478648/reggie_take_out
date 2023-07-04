package com.sues.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sues.entity.OrderDetail;
import com.sues.mapper.OrderDetailMapper;
import com.sues.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
