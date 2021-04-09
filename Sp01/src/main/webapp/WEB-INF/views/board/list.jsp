<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, cu.board.domain.Board"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring Board</title>
<meta charset="utf-8">
<style>
a {
	text-decoration: none
}
</style>
</head>
<body>
	<center>
		<font color='gray' size='4' face='휴먼편지체' />
		<hr width='600' size='2' color='gray' noshade />
		<h3>Spring Board</h3> 
		<font color='gray' size='4' face='휴먼편지체'>
			<a href='../'>인덱스</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			<a href='write.do'>글쓰기</a><br />
		</font>
		<hr width='600' size='2' color='gray' noshade /> 
		<TABLE border='2' width='600' align='center' noshade>
			<TR size='2' align='center' noshade bgcolor='AliceBlue'>
				<th bgcolor='AliceBlue'>no</th>
				<th color='gray'>writer</th>
				<th color='gray'>e-mail</th>
				<th color='gray'>subject</th>
				<th color='gray'>date</th>
			</TR>
<%
List<Board> list = (List<Board>)request.getAttribute("list");
   if(list.size() != 0){
   	for(Board dto : list) {
%>
			<TR align='center' noshade>
				<TD><%= dto.getSeq() %></TD>
				<TD><%= dto.getWriter() %></TD>
				<TD><%= dto.getEmail() %></TD>
				<TD><a href="detail.do?seq=<%= dto.getSeq() %>"><%= dto.getSubject() %></a></TD>
				<TD><%= dto.getRdate() %></TD>
			</TR>
<%
   	}
   }
%>
		</TABLE>
		<hr width='600' size='2' color='gray' noshade /> 
		<font color='gray' size='3' face='휴먼편지체'> (총페이지수 : 3)
			&nbsp;&nbsp;&nbsp; 
			<a href="list.do?cp=1"> 
				<strong>1</strong>
			</a>&nbsp; <a href="list.do?cp=2"> 2 </a>&nbsp; 
			<a href="list.do?cp=3"> 3 </a>
			&nbsp; ( TOTAL : 9 ) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 페이지 싸이즈 : 
			<select id="psId" name="ps" onchange="f(this)">
				<option value="3" selected>3</option>
				<option value="5">5</option>
				<option value="10">10</option>
			</select> 
			<script language="javascript">
				function f(select) {
					//var el = document.getElementById("psId");
					var ps = select.value;
					//alert("ps : " + ps);
					location.href = "list.do?ps=" + ps;
				}
			</script>

		</font>
		<hr width='600' size='2' color='gray' noshade />
	</center>
</body>
</html>