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
        <h2 class="title"><span>查看课表</span></h2><label for="type">课程类别：</label>
        <select id="coutype" onchange="changeType()">
        	<option value="选修">选修</option>
        	<option value="必修">必修</option>
        </select>
        <br>
        <br>
        <table border="1" width="100%" class="tab">
            <tr>
				<th>课程名称</th>
				<th>课程类型</th>
				<th>班级</th>
				<th>班级类型</th>
				<th>任课老师</th>
            </tr>
            <tbody id="tbody">
            <c:forEach var="m" items="${stulist}" varStatus="status">
            	<c:forEach items="${m.sc}" var="mm">
            		<tr>
                	<td>${mm.course.name }</td>
					<td>${mm.course.type }</td>
					<td>${m.classes.name }</td>
					<td>${m.classes.type }</td>
					<td>${mm.teacher.name }</td>
                </tr>
            	</c:forEach>
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
               location.href="<c:url value="/stu/mycourse/${user.rid}"/>?pageNO="+(new_page_index+1)+"&type="+$("#coutype").val();
           }
          
           function changeType(){
           		var rid=${user.rid};
           		var type=$("#coutype").val();
           		$.ajax({
           			type:'post',
           			url:'${pageContext.request.contextPath }/stu/changeCouType/'+rid,
           		    contentType:'application/x-www-form-urlencoded; charset=UTF-8',
           			data:{
           				type:type
           			},
           			dataType:'json',
           			success:function(arr){
           				var str="";
           				for(var i=0;i<arr.length;i++){
           					for(var j=0;j<arr[i].sc.length;j++){
           						str+="<tr><td>"+arr[i].sc[j].course.name+"</td>"+"<td>"+arr[i].sc[j].course.type+"</td>";
                				str+="<td>"+arr[i].classes.name+"</td>"+"<td>"+arr[i].classes.type+"</td>"+"<td>"+arr[i].sc[j].teacher.name+"</td>";
           					}
           				}
           				$("#tbody").html(str);
           			}
           		})
           }
        </script>
    </div>
</body>
</html>
