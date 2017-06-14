<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>res/bootstrap/css/bootstrap.min.css">
	

  </head>
  
  <body>
    	<div class="container">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="panel panel-primary">
				<div class="panel-heading">用户登录</div>
				<div class="panel-body">
					<form method="post">
						<div class="form-group">
							<label>用户名：</label>
							<input type="text" name="username" class="form-control">
							<span class="help-block"><form:errors path="register.username"/></span>
						</div>
						<div class="form-group">
							<label>密码：</label>
							<input type="password" name="password" class="form-control">
							<span class="help-block"><form:errors path="register.password"/></span>
						</div>
						<div class="form-group">
							<label>重复密码：</label>
							<input type="password" name="passwordRepeat" class="form-control">
							<span class="help-block"><form:errors path="register.passwordRepeat"/></span>
						</div>
						<div class="form-group">
							<label>姓名：</label>
							<input type="text" name="name" class="form-control">
							<span class="help-block"><form:errors path="register.name"/></span>
						</div>
						<div class="form-group">
							<label>性别：</label>
							<select name="sex" class="form-control">
								<option>男</option>
								<option>女</option>
							</select>
						</div>
						<div class="form-group">
							<label>班级：</label>
							<select name="classes" class="form-control">
								<option>15级软件1班</option>
								<option>15级信科1班</option>
							</select>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-danger">注册</button>
						</div>
					</form>
				</div>
			</div>	
		</div>
		<div class="col-md-4"></div>
	</div>
  </body>
</html>
