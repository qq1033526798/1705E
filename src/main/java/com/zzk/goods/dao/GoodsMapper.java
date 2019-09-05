package com.zzk.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzk.goods.domain.Brand;
import com.zzk.goods.domain.Goods;
import com.zzk.goods.domain.Goodskind;

public interface GoodsMapper {
	
	List<Goods> list(@Param("gname")String gname);
	
	void add(Goods goods);
	
	List<Brand> listbrand();
	
	List<Goodskind> listkind();
	
	void del(String mid);
	
	Goods get(Integer gid);
	
	void update(Goods goods);
}
