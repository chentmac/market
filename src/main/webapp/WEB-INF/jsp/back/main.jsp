<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp"%>
    <title>后台主页</title>
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="container">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>序号</th>
            <th>商品名称</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${goodsList}" var="goods">
            <tr>
                <td>${goods.gid}</td>
                <td><a href="${pageContext.request.contextPath}/admin/showDesc?gid=${goods.gid}">${goods.gname}</a></td>
                <td><a href="${pageContext.request.contextPath}/admin/deleteById?gid=${goods.gid}">删除</a>|<a href="/GDPU/admin/alterCategory">修改</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
