<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp" %>
<title>详情</title>
</head>
<body>
<%@include file="common/header.jsp" %>
<div class="container">
    <form action="${pageContext.request.contextPath}/car/addToCar">
        <input type="hidden" name="gid" value="${goods.gid}">
        <input class="realCounts" type="hidden" name="counts" value="1">
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
                <td>购买数量：</td>
                <td>
                    <input class="sub" name="" type="button" value="-"/>
                    <input class="text_box" type="text" value="1"
                           style="width:25px;"/>
                    <input class="add" name="" type="button" value="+"/>
                </td>
            </tr>
            <tr>
                <td>小计：</td>
                <td>
                    <span class="subTotal">${goods.price}</span><input class="realSubTotal" name="subTotal" type="hidden" value="${goods.price}"/>
                </td>
            </tr>
            <tr>
                <td>商品分类：</td>
                <td>${goods.category.cname}</td>
            </tr>
            <tr>
                <td>主图：</td>
                <td><img src="${pageContext.request.contextPath}/image/${goods.image}"></td>
            </tr>
            <tr>
                <td>
                    <button class="btn btn-default" type="submit">加入购物车</button>
                </td>
                <td></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
