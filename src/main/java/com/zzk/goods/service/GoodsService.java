package com.zzk.goods.service;

import java.util.List;

import com.zzk.goods.domain.Brand;
import com.zzk.goods.domain.Goods;
import com.zzk.goods.domain.Goodskind;

public interface GoodsService {
	List<Goods> list(String gname);
	
	void add(Goods goods);
	
	List<Brand> listbrand();
	
	List<Goodskind> listkind();
	
	void del(String mid);
	
	Goods get(Integer gid);

	void update(Goods goods);
}
