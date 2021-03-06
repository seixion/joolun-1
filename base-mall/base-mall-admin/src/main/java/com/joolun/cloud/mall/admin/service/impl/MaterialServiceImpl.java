/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.mall.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joolun.cloud.mall.common.entity.Material;
import com.joolun.cloud.mall.admin.mapper.MaterialMapper;
import com.joolun.cloud.mall.admin.service.MaterialService;
import com.joolun.cloud.mall.common.entity.MaterialGroup;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 素材
 *
 * @author JL
 * @date 2019-10-26 19:23:45
 */
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material> implements MaterialService {

	@Autowired
	private MaterialMapper materialMapper;

	@Override
	public IPage<Material> select(Page<Material> page) {
		return materialMapper.selectPageVo(page);
	}

	@Override
	public IPage<Material> selectPageByGroupIdVo(Page<Material> page, String groupId) {
		return materialMapper.selectPageByGroupIdVo(page,groupId);
	}


}
