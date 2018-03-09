<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/styles/main.css"/>"  type="text/css" rel="stylesheet" />
<title>查看成绩</title>
</head>
<body>
    <div class="main">
        <h2 class="title"><span>查看成绩</span></h2><label for="type">课程类别：</label>
        
        <br>
        <br>
        <table border="1" width="100%" class="tab">
            <tr>
				<th>课程名称</th>
				<th>课程类型</th>
				<th>任课老师</th>
				<th>平时成绩</th>
				<th>考试成绩</th>
				<th>最终成绩</th>
            </tr>
            <tbody id="tbody">
            <c:forEach var="m" items="${gradelist}" varStatus="status">
                <tr>
                	<td>${m.course.name }</td>
					<td>${m.course.type }</td>
					<td>${m.teacher.name }</td>
					<td>${m.pgrade }</td>
					<td>${m.kgrade }</td>
					<td>${m.zgrade }</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br>
        <div id="pager"></div>
       
        <p style="color: red">${message}</p>
        <!--分页 -->
        <script type="text/javascript" src="<c:url value="/styles/bootstrap/js/jquery-1.10.2.js"/>" ></script>
        <link href="<c:url value="/styles/pagination.css"/>"  type="text/css" rel="stylesheet" />
        <script type="text/javascript" src="<c:url value="/scripts/jquery.pagination.js"/>" ></script>
       <!--  <script type="text/javascript">
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
               location.href="<c:url value="/stu/mycourse/${user.rid}"/>?pageNO="+(new_page_index+1)+"&type="+$("#coutype").val();
           }
          
          
        </script> -->
    </div>
</body>
</html>
