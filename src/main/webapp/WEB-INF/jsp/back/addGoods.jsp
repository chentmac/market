<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp" %>
<title>添加商品</title>
</head>
<body>
<%@include file="common/header.jsp" %>
<div class="container">
    <form action="${pageContext.request.contextPath}/admin/addGoods"
          method="POST" enctype="multipart/form-data">
        <table class="table table-hover">
            <tr>
                <td>商品名称：</td>
                <td><input class="form-control" type="text" name="gname"></td>
            </tr>
            <tr>
                <td>商品价格：</td>
                <td><input class="form-control" type="text" name="price"></td>
            </tr>
            <tr>
                <td>商品品牌：</td>
                <td><input class="form-control" type="text" name="brand"></td>
            </tr>
            <tr>
                <td>商品库存：</td>
                <td><input class="form-control" type="text" name="inventory"></td>
            </tr>
            <tr>
                <td>商品分类：</td>
                <td>
                    <select class="selectpicker" name="cid">
                        <c:forEach items="${categoryList }" var="category">
                            <option value="${category.cid }">${category.cname }</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>主图：</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr>
                <td>
                    <button class="btn btn-default" type="submit" value="提交">提交</button>
                </td>
                <td></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
