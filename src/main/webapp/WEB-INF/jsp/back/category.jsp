<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp"%>
    <title>分类管理</title>
</head>
<body>
<%@include file="common/header.jsp"%>
<div class="container">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>序号</th>
            <th>分类名称</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${categoryList}" var="category">
            <tr>
                <td>${category.cid}</td>
                <td>${category.cname}</td>
                <td><a href="/GDPU/admin/deleteCategory?cid=${category.cid}">删除</a>|<a
                        href="/GDPU/admin/alterCategory">修改</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <h3>添加分类</h3>
    <form class="bs-example bs-example-form" action="${pageContext.request.contextPath}/admin/addCategory" method="post">
        <div class="row">
            <div class="col-lg-6">
                <div class="input-group">
                    <input type="text" class="form-control" name="cname">
                    <span class="input-group-btn">
                    <button class="btn btn-default" type="submit">添加</button>
                </span>
                </div><!-- /input-group -->
            </div><!-- /.col-lg-6 -->
        </div><!-- /.row -->
    </form>
</div>
</body>
</html>
