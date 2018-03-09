<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="multidel" method="post">
      <table border="=1" style="margin:40px auto;width:80%">
        <tr>
                <th><input type="checkbox" id="chbAll"></th>
                <th>编号</th>
                <th>产品名</th>
                <th>价格</th>
                <th>类型</th>
                <th>操作</th>
        </tr>
        <c:forEach items="${plist}" var="p">
        <tr>
          <td><input type="checkbox" name="id" value="${p.id}"></td>
          <td>${p.id }</td>
          <td>${p.name }</td>
          <td>${p.price }</td>
          <td>${p.pt.name}</td>
          <td>
            <a href="del/${p.id}">删除</a>
            <a href="edit?id=${p.id }">编辑</a>
          </td>
        </tr>
        </c:forEach>
      </table>
      <div id="pager"></div>
      <!-- 分页 -->
      <script type="text/javascript" src="<c:url value="/scripts/jquery-1.10.2.min.js"/>" ></script>
        <link href="<c:url value="/scripts/pagination.css"/>"  type="text/css" rel="stylesheet" />
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
               //alert(new_page_index+1);
               //location.href="getplist?pageNO="+(new_page_index+1);
               location.href="<c:url value="/"/>getplist?pageNO="+(new_page_index+1);
           }
        </script>
      
      <div style="margin-left: 200px">
        <a href="add">添加</a>
        <input type="submit" value="删除所选项"/>
      </div>
    </form>
  </body>
</html>
