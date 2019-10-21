package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getUserAll")
    @ResponseBody
    public List<UmsMember> getUserAll(){

        List<UmsMember> userAll = userService.getUserAll();
        return  userAll;

    }

    @RequestMapping("/getReceiveAddressByMemberById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMember(String  memberId){

        List<UmsMemberReceiveAddress> receiveAddress= userService.getReceiveAddressByMemberId(memberId);

        return  receiveAddress;
    }


}
