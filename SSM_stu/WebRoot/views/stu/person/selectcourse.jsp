<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="<c:url value="/styles/main.css" />" type="text/css"
    rel="stylesheet" />
<title>选课</title>
<%-- <base href="<c:url value="/" />" /> --%>
<script type="text/javascript" src="<c:url value="/styles/bootstrap/js/jquery-1.10.2.js"/>" ></script>
<script type="text/javascript">
function showmsg(){
      if("${msg}"==1){
           alert("操作成功！");
         }
      }
</script>
</head>
<body onload="showmsg()">
 <div class="main">
         <h2 class="title"><span>选课</span></h2>
         <form action="${pageContext.request.contextPath}/stu/savecourse">
         <table border="1" width="100%" class="tab">
         	<tr><th><input type="checkbox"></th><th>课程名称</th><th>课程类别</th><th>任课老师</th></tr>

        	 <c:forEach var="m" items="${ctclist}">
		        <tr>
			        <td><input type="checkbox" name="ids" value="${m.course.id}_${m.teacher.id}"></td>
			        <td><label class="label label-info">${m.course.name}</label></td>
			        <td><label class="label label-info" >${m.course.type}</label></td>
			        <td><label class="label label-info">${m.teacher.name}</label></td>
		        </tr>
		       
		       </c:forEach>
		 </table>
		 <br>
		 <input type="submit" value="提交" class="btn out"/>
		 </form>
	</div>
</body>
</html>