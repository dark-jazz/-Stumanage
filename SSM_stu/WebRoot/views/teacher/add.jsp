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
<body>
    <div class="main">
        <h2 class="title"><span>添加教师</span></h2>
        <form:form action="${pageContext.request.contextPath }/tea/add" modelAttribute="teacher">
        <fieldset>
            <legend>教师</legend>
            <p>
                <label for="name">教师名称：</label>
                <form:input path="name" size="50"/>
                <form:errors path="name" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="workid">教师工号：</label>
                <form:input path="workid" size="50"/>
                <form:errors path="workid" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="teatype.id">教师类别：</label>
                <form:select path="teatype.id">
                     <form:option value="0">--请选择--</form:option>
                     <form:options items="${teatypelist }" itemLabel="type" itemValue="id"/>
                </form:select>
                <form:errors path="type" cssClass="error"></form:errors>
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
                <label for="role">角色：</label>
                <form:select path="role">
                     <form:option value="2">教师</form:option>
                </form:select>
                <form:errors path="role" cssClass="error"></form:errors>
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
</body>
</html>
