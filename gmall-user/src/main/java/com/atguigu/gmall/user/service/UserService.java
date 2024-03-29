package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    public List<UmsMember>  getUserAll();
    public List<UmsMemberReceiveAddress>  getReceiveAddressByMemberId(String memberId);
}
