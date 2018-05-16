<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp" %>
<title>我的订单</title>
</head>
<body>
<%@include file="common/header.jsp" %>
<div class="container cart">
    <div class="span24">
        <h3>生成订单成功</h3>
        <table>
            <tbody>
            <tr>
                <th>图片</th>
                <th>商品</th>
                <th>价格</th>
                <th>数量</th>
                <th>小计</th>
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
        <form id="orderForm" action="${ pageContext.request.contextPath }/order_payOrder.action" method="post">
            <input type="hidden" name="oid" value="<s:property value="model.oid"/>"/>
            <div class="span24">
                <p>
                    收货地址：<input name="addr" type="text" value=""
                                style="width:350px"/>
                    <br/>
                    收货人&nbsp;&nbsp;&nbsp;：<input name="name" type="text" value=""
                                                 style="width:150px"/>
                    <br/>
                    联系方式：<input name="phone" type="text" value=""
                                style="width:150px"/>

                </p>
                <hr/>
                <p>
                    选择银行：<br/>
                    <input type="radio" name="pd_FrpId" value="ICBC-NET-B2C" checked="checked"/>工商银行
                    <img src="${ pageContext.request.contextPath }/bank_img/icbc.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="pd_FrpId" value="BOC-NET-B2C"/>中国银行
                    <img src="${ pageContext.request.contextPath }/bank_img/bc.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="pd_FrpId" value="ABC-NET-B2C"/>农业银行
                    <img src="${ pageContext.request.contextPath }/bank_img/abc.bmp" align="middle"/>
                    <br/>
                    <input type="radio" name="pd_FrpId" value="BOCO-NET-B2C"/>交通银行
                    <img src="${ pageContext.request.contextPath }/bank_img/bcc.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="pd_FrpId" value="PINGANBANK-NET"/>平安银行
                    <img src="${ pageContext.request.contextPath }/bank_img/pingan.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="pd_FrpId" value="CCB-NET-B2C"/>建设银行
                    <img src="${ pageContext.request.contextPath }/bank_img/ccb.bmp" align="middle"/>
                    <br/>
                    <input type="radio" name="pd_FrpId" value="CEB-NET-B2C"/>光大银行
                    <img src="${ pageContext.request.contextPath }/bank_img/guangda.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="pd_FrpId" value="CMBCHINA-NET-B2C"/>招商银行
                    <img src="${ pageContext.request.contextPath }/bank_img/cmb.bmp" align="middle"/>
                </p>
                <hr/>
                <p style="text-align:right">
                    <a href="javascript:document.getElementById('orderForm').submit();">
                        <img src="${pageContext.request.contextPath}/images/finalbutton.gif" width="204" height="51"
                             border="0"/>
                    </a>
                </p>
            </div>
        </form>
    </div>

</div>
</body>
</html>
