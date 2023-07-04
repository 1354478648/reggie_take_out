package com.sues.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sues.entity.ShoppingCart;
import com.sues.mapper.ShoppingCartMapper;
import com.sues.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
