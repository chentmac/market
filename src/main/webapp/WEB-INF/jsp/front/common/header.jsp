<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${pageContext.request.contextPath}/main">GDPU</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/main">首页 <span class="sr-only">(current)</span></a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" href="#" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
                       aria-expanded="true">
                        分类
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu dropdowncolor" aria-labelledby="dropdownMenu1">
                        <c:forEach items="${categoryList}" var="category">
                            <li><a href="${pageContext.request.contextPath}/category/queryByCategory?cid=${category.cid}">${category.cname}</a></li>
                        </c:forEach>
                    </ul>
                </li>
                <li><a href="${pageContext.request.contextPath}/car/getCar">购物车</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" href="#" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
                       aria-expanded="true">
                        我的订单
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu dropdowncolor" aria-labelledby="dropdownMenu1">
                        <li><a href="#">全部订单</a></li>
                        <li><a href="#">待付款订单</a></li>
                        <li><a href="#">待收货订单</a></li>
                        <li><a href="#">已完成订单</a></li>
                    </ul>
                </li>
                <li><a href="${pageContext.request.contextPath}/data">我的资料</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <c:choose>
                    <c:when test="${user==null}">
                        <li><a href="${pageContext.request.contextPath}/userLoginPage">登录</a></li>
                        <li><a href="${pageContext.request.contextPath}/userRegisterPage">注册</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="#">${user.username}</a></li>
                        <li><a href="${pageContext.request.contextPath}/user/quit">退出</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
            <form action="${pageContext.request.contextPath}/goods/search" class="navbar-form navbar-right" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search" name="search">
                </div>
                <button type="submit" class="btn navbar-btn">搜索</button>
            </form>
        </div>
    </div>
</nav>