<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/common.jsp" %>
<title>搜索结果</title>
</head>
<body>
<%@include file="common/header.jsp" %>
<div class="container">
    <c:forEach items="${goodsForCategoryList}" var="goods">
        <div class="icon">
            <a href="${pageContext.request.contextPath}/goods/showDesc?gid=${goods.gid}">
                <img src="${pageContext.request.contextPath}/image/${goods.image}" border="0"/></a> <br/>
            <a href="${pageContext.request.contextPath}/goods/showDesc?gid=${goods.gid}">${goods.gname}</a>
        </div>
    </c:forEach>
</div>
</body>
</html>
