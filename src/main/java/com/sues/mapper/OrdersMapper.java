package com.sues.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sues.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
