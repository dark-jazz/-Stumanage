<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <style type="text/css">
	 span.error{color:red;}
	</style>
  </head>
  
  <body>
    <div class="main">
        <h2 class="title"><span>新增产品</span></h2>
        <form:form modelAttribute="p" action="addSave" method="post">
        <fieldset>
            <legend>产品</legend>
            <p>
                <label for="name">产品名称：</label>
                <form:input path="name"/>
                <form:errors path="name" cssClass="error"/>
            </p>
            <p>
                <label for="title">产品类型：</label>
                <form:select path="productType.id">
                   <form:option value="0">--请选择--</form:option>
                   <form:options items="${ptlist}" itemLabel="name" itemValue="id"/>
                </form:select>
                <form:errors path="productType.id" cssClass="error"/>
            </p>
            <p>
                <label for="price">产品价格：</label>
                <form:input path="price"/>
                <form:errors path="price" cssClass="error"/>
            </p>
            <p>
              <input type="submit" value="保存" class="btn out">
            </p>
        </fieldset>
        </form:form>
        <p>
            <a href="<c:url value="/" />"  class="abtn out">返回列表</a>
        </p>
    </div>
  </body>
</html>
