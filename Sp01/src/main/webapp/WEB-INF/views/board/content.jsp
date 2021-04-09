<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="cu.board.domain.Board"%>
<!DOCTYPE html>
<style>
	a{text-decoration:none}
</style>
<meta charset="utf-8">
<center>
	<font color='gray' size='4' face='휴먼편지체'>
	<hr width='600' size='2' color='gray' noshade>
	<h3>Spring Board</h3>
	<font color='gray' size='4' face='휴먼편지체'>
	<a href='write.do'>글쓰기</a>
	</font>
	<hr width='600' size='2' color='gray' noshade>
	</font>
	
	<table border='2' width='600' align='center' noshade>
<%
	Board dto = (Board)request.getAttribute("board");
%>
	<tr>
	<td width='20%' align='center'>No</td>
	<td><%= dto.getSeq() %></td>
	</tr>
	<tr>
	<td width='20%' align='center'>Writer</td>
	<td><%= dto.getWriter() %></td>
	</tr>
	<tr>
	<td align='center'>E-mail</td>
	<td><%= dto.getEmail() %></td>
	</tr>
	<tr>
	<td align='center'>Subject</td>
	<td><%= dto.getSubject() %></td>
	</tr>
	<tr>
	<td align='center'>Contents</td>
	<td><%= dto.getContent() %></td>
	</tr>
	</table>
	
	<hr width='600' size='2' color='gray' noshade>
	<font color='gray' size='4' face='휴먼편지체'>
	<a href='update.do?seq=<%= dto.getSeq() %>'>수정</a>
	 &nbsp;&nbsp;| 
	<a href='del.do?seq=<%= dto.getSeq() %>'>삭제</a>
	 &nbsp;&nbsp;| 
	<a href='list.do'>목록</a>
	</font>
	<hr width='600' size='2' color='gray' noshade>
</center>
