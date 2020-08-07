package com.atguigu.gulimall.members.dao;

import com.atguigu.gulimall.members.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author zhulei
 * @email sunlightcs@gmail.com
 * @date 2020-08-07 11:01:23
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
