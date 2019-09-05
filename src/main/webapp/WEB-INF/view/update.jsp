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
$(function () {
	
	$.post("listbrand", function(list) {
		for (var i in list) {
		$("#bid").append("<option value='"+list[i].bid+"'>"+list[i].bname+"</option>");
}
	})			
})
$(function () {
	
	$.post("listkind", function(list) {
		for (var i in list) {
		$("#kid").append("<option value='"+list[i].kid+"'>"+list[i].kname+"</option>");
}
	})			
})
function update() {
	$.post("update", $("form").serialize(), function(obj) {
		if(obj){
			alert("修改成功");
			location.href="list";
		}else{
			alert("修改失败");
		}
	})
}
	
</script>
</head>
<body>
<form >
<input type="hidden" name="gid" value="${get.gid }">
		<table>
			<tr>
				<td>商品名称:<input type="text" name="gname" value="${get.gname }"></td>
			</tr>
			<tr>
				<td>英文名称:<input type="text" name="Englishname" value="${get.Englishname }"></td>
			</tr>
			<tr>
				<td>商品尺寸:<input type="text" name="chicun" value="${get.chicun }"></td>
			</tr>
			<tr>
				<td>商品价格:<input type="text" name="money" value="${get.money }"></td>
			</tr>
			<tr>
				<td>商品库存:<input type="text" name="sum" value="${get.sum }"></td>
			</tr>
			<tr>
				<td>商品标签:<input type="text" name="biaoqian" value="${get.biaoqian }"></td>
			</tr>
			<tr>
				<td>商品品牌:<select id="bid" name="bid.bname" ></select></td>
			</tr>
			<tr>
				<td>商品类型:<select id="kid" name="kid.kname"></select></td>
			</tr>
			<tr>
				<td><button type="button" onclick="update()">修改</button></td>
			</tr>
		</table>
	</form>
</body>
</html>