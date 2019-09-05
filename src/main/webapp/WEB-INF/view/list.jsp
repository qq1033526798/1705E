<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/mystyles.css" type="">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<title>列表</title>
<script type="text/javascript">
	function ck(obj) {
		if(obj==1){
			$(".ids").prop("checked", true)
		}else if(obj==2){
			$(".ids").prop("checked",false)
		}else{
			$(".ids").each(function() {
				this.checked = ! this.checked;
			})
		}
	}
	function toAdd() {
		location.href="toAdd";
	}
	function toUpdate(gid) {
		location.href="toUpdate?gid="+gid;
	}
	function del(mid) {
		$.post("del", {mid:mid}, function(obj) {
			if(obj){
				alert("删除成功");
				location.href="list";
			}else{
				alert("删除失败");
			}
		})
	}
	function deletePatch() {
		var ids = "";
		$("[name='ck']:checked").each(function() {
			ids+=","+$(this).val();
		})
		ids=ids.substring(1);
		del(ids);
	}
</script>
</head>
<body>
<form action="list" method="post">
姓名：<input type="text" name="gname" value="${a.gname }">
	<input type="submit" value="查找">
	<button type="button" onclick="toAdd()">添加</button>
	<button type="button" onclick="deletePatch()">批量删除</button>
</form>
	<table>
		<tr>
			<td>
			<button type="button" onclick="ck(1)">全选</button>
			<button type="button" onclick="ck(2)">全不选</button>
			<button type="button" onclick="ck(3)">反选</button>
			</td>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品尺寸</td>
			<td>商品价格</td>
			<td>商品库存</td>
			<td>商品标签</td>
			<td>商品品牌</td>
			<td>商品类型</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="a">
		<tr>
		<td>
			<input type="checkbox" class="ids" name="ck" value="${a.gid }">
		</td>
			<td>${a.gid }</td>
			<td>${a.gname }</td>
			<td>${a.Englishname }</td>
			<td>${a.chicun }</td>
			<td>${a.money }</td>
			<td>${a.sum }</td>
			<td>${a.biaoqian }</td>
			<td>${a.bname }</td>
			<td>${a.kname }</td>
			<td>
				<button type="button" onclick="del(${a.gid})">删除</button>
				<button type="button" onclick="toUpdate(${a.gid})">修改</button>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="11">${fenye }</td>
		</tr>
	</table>
</body>
</html>