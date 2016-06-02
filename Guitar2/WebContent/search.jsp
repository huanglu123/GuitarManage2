<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">

<title></title>
<link href="Css/bootstrap.css" rel="stylesheet">
<style type="text/css">
table {
	width:600px
}

td {
	border-width: 2px;
	border-style: solid;
	text-align: center;
	height: 60px;
}
</style>
</head>
<body>
	<h2>查询结果</h2>
	<c:forEach items="${res}" var="p">
		<table>
			<tr>
				<td>序列号</td>
				<td>制造商</td>
				<td>型号</td>
				<td>类型</td>
				<td>顶部材料</td>
				<td>背部材料</td>
				<td>价格</td>
			</tr>
			<tr>
				<td>${p.serialNumber}</td>
				<td>${p.getSpec().getBuilder()}</td>
				<td>${p.getSpec().getModel()}</td>
				<td>${p.getSpec().getType()}</td>
				<td>${p.getSpec().getBackWood()}</td>
				<td>${p.getSpec().getTopWood()}</td>
				<td>${p.price}</td>
			</tr>

			</c:forEach>
		</table>
</body>
</html>