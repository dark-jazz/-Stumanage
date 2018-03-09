<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/styles/main.css"/>"  type="text/css" rel="stylesheet" />
<title>查看个人信息</title>
<script type="text/javascript" src="<c:url value="/styles/bootstrap/js/jquery-1.10.2.js"/>" ></script>
<script type="text/javascript">
      function showmsg(){
          if("${msg}"==1){
           	alert("操作成功！");
           	 parent.location.href="${pageContext.request.contextPath}/views/login.jsp";
          }
      }
        </script>
</head>
<body onload="showmsg()">
    <div class="main">
        <h2 class="title"><span>个人信息</span></h2>
         <table class="table">
		        <tr>
			        <th>姓　名：</th>
			        <td><label class="label label-info">${student.name}</label></td>
		        </tr>
		        <tr>
			        <th>性　别：</th>
			        <td><label class="label label-info" >${student.sex}</label></td>
		        </tr>
		        <tr>
			        <th>地　址：</th>
			        <td><label class="label label-info">${student.address}</label></td>
		        </tr>
		        <tr>
			        <th>电　话：</th>
			        <td><label class="label label-info">${student.tel}</label></td>
		        </tr>
		        <tr>
			        <th>班　级：</th>
			        <td><label class="label label-info">${student.classes.name}</label></td>
		        </tr>
		        <tr>
			        <th>类　型：</th>
			        <td><label class="label label-info">${student.classes.type}</label></td>
		        </tr>
		        <tr>
			        <th>登录名：</th>
			        <td><label class="label label-info">${student.login.loginname }</label></td>
		        </tr>
		        <tr>
		           <th>密　码：</th>
			       <td>
			           <form action="${pageContext.request.contextPath}/stu/updatePwd">
			           <input type="hidden" name="rid" value="${student.id}">
			           <input type="hidden" name="loginname" value="${student.login.loginname }">
			           <input type="text" name="password" value="${student.login.password}" placeholder="请输入密码">
			           <input type="submit" value="修改密码" class="btn out"/>
			           </form>
			       </td>
		        </tr>
		 </table>
    </div>
</body>
</html>
