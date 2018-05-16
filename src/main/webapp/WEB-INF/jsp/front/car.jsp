<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp" %>
<title>购物车</title>
</head>
<body>
<%@include file="common/header.jsp" %>

<div class="container cart">
    <div class="span24">
        <form action="${pageContext.request.contextPath}/orders/newOrders" method="post">
            <table>
                <tbody>
                <tr>
                    <th>图片</th>
                    <th>商品</th>
                    <th>价格</th>
                    <th>数量</th>
                    <th>小计</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${car.carItemsList}" var="carItems">
                    <tr>
                        <td width="60">
                            <input type="hidden" name="id" value="22">
                            <img src="${pageContext.request.contextPath}/image/${carItems.goods.image}">
                        </td>
                        <td>
                            <a target="_blank">${carItems.goods.gname}</a>
                        </td>
                        <td>
                                ${carItems.goods.price}
                        </td>
                        <td class="quantity" width="60">
                                ${carItems.counts}
                        </td>
                        <td width="140">
                            <span class="subtotal">${carItems.subTotal}</span>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/car/deleteByCiid?ciid=${carItems.ciid}" class="delete">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <dl id="giftItems" class="hidden" style="display: none;">
            </dl>
            <div class="total">
                <em id="promotion"></em>
                商品金额: <strong id="effectivePrice">￥${car.total}元</strong>
            </div>
            <div class="bottom">
                <a href="${pageContext.request.contextPath}/car/deleteAll" id="clear" class="clear">清空购物车</a>
                <button class="button submit" type="submit">提交订单</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
