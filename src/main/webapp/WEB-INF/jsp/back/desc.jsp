<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp" %>
<title>详情</title>
</head>
<body>
<%@include file="common/header.jsp" %>
<div class="container">
    <table class="table table-hover">
        <tr>
            <td>商品名称：</td>
            <td>${goods.gname}</td>
        </tr>
        <tr>
            <td>商品价格：</td>
            <td>${goods.price}</td>
        </tr>
        <tr>
            <td>商品品牌：</td>
            <td>${goods.brand}</td>
        </tr>
        <tr>
            <td>商品库存：</td>
            <td>${goods.inventory}</td>
        </tr>
        <tr>
            <td>商品分类：</td>
            <td>${goods.category.cname}</td>
        </tr>
        <tr>
            <td>主图：</td>
            <td><img src="${pageContext.request.contextPath}/image/${goods.image}"></td>
        </tr>
    </table>
</div>
</body>
</html>
