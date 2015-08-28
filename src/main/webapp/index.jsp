<%String path = request.getContextPath(); %>
<html>
<body>


	<form action="<%=path %>/login.action" method="post">
		<input type="text" name="username">
		<input type="submit"  value="提交">
	</form>
	<a href="<%=path %>/salary!add.action">add</a>
	<a href="<%=path %>/salary!show.action">show</a>
	<a href="<%=path %>/salary!update.action">update</a>
	<a href="<%=path %>/salary!delete.action">delete</a>
</body>
</html>
