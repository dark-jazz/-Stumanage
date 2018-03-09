<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="<c:url value="/styles/main.css" />" type="text/css" rel="stylesheet" />
<title>添加教师</title>
</head>
<body onload="showmsg()">
    <div class="main">
        <h2 class="title"><span>添加学生</span></h2>
        <form:form action="${pageContext.request.contextPath }/stu/add" modelAttribute="stu">
        <fieldset>
            <legend>学生</legend>
            <p>
                <label for="name">学生姓名：</label>
                <form:input path="name" size="50"/>
                <form:errors path="name" cssClass="error"></form:errors>
            </p>
            
            <p>
                <label for="sex">性别：</label>
                <form:radiobutton path="sex" value="男" checked="checked"/>男
                <form:radiobutton path="sex" value="女"/>女
            </p>
            <p>
                <label for="address">地址：</label>
                <form:input path="address" size="50"/>
                <form:errors path="address" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="classes.id">班级：</label>
                <form:select path="classes.id">
                     <form:option value="0">--请选择--</form:option>
                      <form:options items="${clist }" itemLabel="name" itemValue="id"></form:options>
                </form:select>
                <form:errors path="classes.id" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="tel">电话：</label>
                <form:input path="tel" size="50"/>
                <form:errors path="tel" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="loginname">登录名：</label>
                <form:input path="loginname" size="50"/>
                <form:errors path="loginname" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="password">密码：</label>
                <form:password path="password" size="50"/>
                <form:errors path="password" cssClass="error"></form:errors>
            </p>
            <p>
              <input type="submit" value="保存" class="btn out">
            </p>
        </fieldset>
        </form:form>
        <p style="color: red">${message}</p>
        <form:errors path="*"></form:errors>
        <p>
            <a href="<c:url value="/tea/list" />"  class="abtn out">返回列表</a>
        </p>
    </div>
    
    <script type="text/javascript" src="<c:url value="/styles/bootstrap/js/jquery-1.10.2.js"/>" ></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>
