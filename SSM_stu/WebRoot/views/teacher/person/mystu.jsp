<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/styles/main.css"/>"  type="text/css" rel="stylesheet" />
<title>查看课表</title>
</head>
<body>
    <div class="main">
        <h2 class="title"><span>查看课表</span></h2>
        <table border="1" width="100%" class="tab">
            <tr>
				<th>学生姓名</th>
				<th>性别</th>
				<th>地址</th>
				<th>联系方式</th>
				<th>班级</th>
				<th>班级类型</th>
				<th>所选课程</th>
				<th>平时成绩</th>
				<th>考试成绩</th>
				<th>总成绩</th>
				<th>操作</th>
            </tr>
            <c:forEach var="m" items="${stulist}" varStatus="status">
                <tr>
					<td>${m.name }</td>
					<td>${m.sex }</td>
					<td>${m.address }</td>
					<td>${m.tel }</td>
					<td>${m.sc.classes.name }</td>
					<td>${m.sc.classes.type }</td>
					<td>${m.sc.course.name }</td>
					<td>${m.grade.pgrade }</td>
					<td>${m.grade.kgrade }</td>
					<td>${m.grade.zgrade }</td>
					<td>
                    <a href="${pageContext.request.contextPath }/tea/addgrade/${m.id}/${m.sc.course.id}" class="abtn">录入成绩</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <div id="pager"></div>
       
        <p style="color: red">${message}</p>
        <!--分页 -->
        <script type="text/javascript" src="<c:url value="/styles/bootstrap/js/jquery-1.10.2.js"/>" ></script>
        <link href="<c:url value="/styles/pagination.css"/>"  type="text/css" rel="stylesheet" />
        <script type="text/javascript" src="<c:url value="/scripts/jquery.pagination.js"/>" ></script>
        <script type="text/javascript">
           //初始化分页组件
           var count=${count};
           var size=${size};
           var pageNO=${pageNO};
           $("#pager").pagination(count, {
              items_per_page:size,
               current_page:pageNO-1,
               next_text:"下一页",
               prev_text:"上一页",
               num_edge_entries:2,
               load_first_page:false,
              callback:handlePaginationClick
            });
           
           //回调方法
           function handlePaginationClick(new_page_index, pagination_container){
               location.href="<c:url value="/tea/mystu/${user.rid}"/>?pageNO="+(new_page_index+1);
           }
           
           /* var defaultSrc="<c:url value="/images/default.jpg"/>";
           $(".tab img").bind("error",function(){
               $(this).prop("src",defaultSrc);
           }); */
           
        </script>
    </div>
</body>
</html>
