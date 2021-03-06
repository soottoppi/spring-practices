<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("newline", "\n");
%>
<!DOCTYPE html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
</head>
<body>
	<div id="container">

		<div id="content">
			<div id="guestbook">
				<form action="${pageContext.request.contextPath }/add" method="post">
					<input type="hidden" name="a" value="add">
					<table border=1 width=510>
						<tr>
							<td>이름</td>
							<td><input type="text" name="name"></td>
							<td>비밀번호</td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>
							<td colspan=4><textarea name="message" id="content"></textarea></td>
						</tr>
						<tr>
							<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
						</tr>
					</table>
				</form>

				<c:set var='count' value='${fn:length(list) }' />
				<c:set var='newline' value='\n' />
				<c:forEach items='${list }' var='vo' varStatus='status'>

					<table width=510 border=1>
						<tr>
							<td>[${count-status.index }]</td>
							<td>${vo.name }</td>
							<td>${vo.date }</td>
							<td><a
								href="${pageContext.request.contextPath }/deleteform/${vo.no } ">삭제</a></td>
						</tr>
						<tr>
							<td colspan=4>${fn:replace(vo.message, newline, "<br/>") }</td>
						</tr>
					</table>
					<br>

				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>