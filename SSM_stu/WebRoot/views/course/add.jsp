<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="<c:url value="/styles/main.css" />" type="text/css" rel="stylesheet" />
<title>添加课程</title>
</head>
<body>
    <div class="main">
        <h2 class="title"><span>添加课程</span></h2>
        <form:form action="${pageContext.request.contextPath }/cou/add" modelAttribute="course">
        <fieldset>
            <legend>课程</legend>
            <p>
                <label for="name">课程名称：</label>
                <form:input path="name" size="50"/>
                <form:errors path="name" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="type">课程类别：</label>
                <form:select path="type">
                     <form:option value="必修">必修</form:option>
                     <form:option value="选修">选修</form:option>
                </form:select>
                <form:errors path="type" cssClass="error"></form:errors>
            </p>
            
            <p>
              <input type="submit" value="保存" class="btn out">
            </p>
        </fieldset>
        </form:form>
        <p style="color: red">${message}</p>
        <form:errors path="*"></form:errors>
        <p>
            <a href="<c:url value="/cou/list" />"  class="abtn out">返回列表</a>
        </p>
    </div>
</body>
</html>
