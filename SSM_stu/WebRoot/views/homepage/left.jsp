<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">

	<title></title>
	<link href="styles/bootstrap/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="styles/bootstrap/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="styles/bootstrap/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
   <style type="text/css">
    .sidebar-collapse .nav{margin-top: -50px}
   </style>
</head>
<body>
<br/>
<ul class="nav nav-pills nav-stacked">
    <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <c:if test="${user.role==1}">
                    <li>
                        <a href="${pageContext.request.contextPath }/stu" target="right"><i class="fa fa-desktop "></i>学生管理 </a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath }/tea"  target="right"><i class="fa fa-table "></i>教师管理</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/cou"  target="right"><i class="fa fa-edit "></i>课程管理</a>
                    </li>
                    <li>
                        <a  href="${pageContext.request.contextPath }/cla"  target="right"><i class="fa fa-qrcode "></i>班级管理</a>
                    </li>
                    </c:if>
                     <c:if test="${user.role==2}">
                    <li>
                        <a href="${pageContext.request.contextPath }/tea/showInfo/${user.rid}" target="right"><i class="fa fa-desktop "></i>个人信息 </a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath }/tea/mycourse/${user.rid}"  target="right"><i class="fa fa-table "></i>查看课表</a>
                    </li>
                    <li>
                        <a  href="${pageContext.request.contextPath }/tea/mystu/${user.rid}"  target="right"><i class="fa fa-qrcode "></i>查看学生</a>
                    </li>
                   
                    </c:if>
                    <c:if test="${user.role==3}">
                    <li>
                        <a href="${pageContext.request.contextPath }/stu/showInfo/${user.rid}" target="right"><i class="fa fa-desktop "></i>个人信息 </a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath }/stu/mycourse/${user.rid}"  target="right"><i class="fa fa-table "></i>查看课表</a>
                    </li>
                    <li>
                        <a  href="${pageContext.request.contextPath }/stu/selectCourse/${user.rid}"  target="right"><i class="fa fa-qrcode "></i>选课</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/stu/getGrade/${user.rid}"  target="right"><i class="fa fa-bar-chart-o"></i>成绩查询</a>
                    </li>
                    </c:if>
                </ul>
             </div>

        </nav>
</ul>
</body>
</html>
