package com.sues.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sues.entity.Orders;

public interface OrdersService extends IService<Orders> {

    //用户下单
    public void submit(Orders orders);
}
