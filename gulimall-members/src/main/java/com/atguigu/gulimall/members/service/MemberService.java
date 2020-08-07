package com.atguigu.gulimall.members.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.members.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhulei
 * @email sunlightcs@gmail.com
 * @date 2020-08-07 11:01:23
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

