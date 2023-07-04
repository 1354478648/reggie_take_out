package com.sues.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sues.entity.AddressBook;
import com.sues.mapper.AddressBookMapper;
import com.sues.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
