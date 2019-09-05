package com.zzk.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zzk.goods.dao.GoodsMapper;
import com.zzk.goods.domain.Brand;
import com.zzk.goods.domain.Goods;
import com.zzk.goods.domain.Goodskind;
import com.zzk.goods.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource 
	private GoodsMapper goodsMapper;
	
	@Override
	public List<Goods> list(String gname) {
		return goodsMapper.list(gname);
	}

	@Override
	public void add(Goods goods) {
		goodsMapper.add(goods);
	}

	@Override
	public List<Brand> listbrand() {
		return goodsMapper.listbrand();
	}

	@Override
	public List<Goodskind> listkind() {
		return goodsMapper.listkind();
	}

	@Override
	public void del(String mid) {
		goodsMapper.del(mid);
	}

	@Override
	public Goods get(Integer gid) {
		return goodsMapper.get(gid);
	}

	@Override
	public void update(Goods goods) {
		goodsMapper.update(goods);
	}

}
