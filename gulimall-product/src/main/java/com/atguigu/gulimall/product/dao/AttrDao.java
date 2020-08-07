package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhulei
 * @email sunlightcs@gmail.com
 * @date 2020-08-06 17:20:13
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
