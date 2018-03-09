<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="<c:url value="/styles/main.css" />" type="text/css" rel="stylesheet" />
<title>添加班级</title>
</head>
<body>
    <div class="main">
        <h2 class="title"><span>添加班级</span></h2>
        <form:form action="${pageContext.request.contextPath }/cla/add" modelAttribute="classes">
        <fieldset>
            <legend>班级</legend>
            <p>
                <label for="name">班级名称：</label>
                <form:input path="name" size="50"/>
                <form:errors path="name" cssClass="error"></form:errors>
            </p>
            <p>
                <label for="type">班级类别：</label>
                <form:select path="type">
                     <form:option value="基础班">基础班</form:option>
                     <form:option value="实验班">实验班</form:option>
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
            <a href="<c:url value="/cla/list" />"  class="abtn out">返回列表</a>
        </p>
    </div>
</body>
</html>
