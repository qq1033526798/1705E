package com.zzk.goods.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzk.goods.domain.Brand;
import com.zzk.goods.domain.Goods;
import com.zzk.goods.domain.Goodskind;
import com.zzk.goods.service.GoodsService;
import com.zzk.goods.util.Pages;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")Integer pageNum ,@RequestParam(defaultValue="")String gname,Model model) {
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = goodsService.list(gname);
		PageInfo<Goods> info = new PageInfo<>(list);
		Pages.page(pageNum, info, model, "&gname="+gname);
		model.addAttribute("list", list);
		model.addAttribute("gname", gname);
		
		return "list";
	}
	
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
	}
	
	@ResponseBody
	@RequestMapping("add")
	public boolean add(Goods goods) {
		try {
			goodsService.add(goods);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping("listbrand")
	public List<Brand> listbrand() {
		return	goodsService.listbrand();
	}
	@ResponseBody
	@RequestMapping("listkind")
	public List<Goodskind> listkind() {
		return	goodsService.listkind();
	}
	
	@ResponseBody
	@RequestMapping("del")
	public boolean del(String mid) {
		try {
			goodsService.del(mid);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(Integer gid,Model model) {
		Goods get = goodsService.get(gid);
		model.addAttribute("get", get);
		return "update";
	}
	
	@ResponseBody
	@RequestMapping("update")
	public boolean update(Goods goods) {
		try {
			goodsService.update(goods);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
