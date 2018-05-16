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
            <a class="navbar-brand" href="${pageContext.request.contextPath}/admin/main">GDPU</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a class="dropdown-toggle" href="#" id="dropdownMenu4" data-toggle="dropdown" aria-haspopup="true"
                       aria-expanded="true">
                        商品管理
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu dropdowncolor" aria-labelledby="dropdownMenu1">
                        <li><a href="${pageContext.request.contextPath}/admin/main">所有商品</a></li>
                        <li><a href="#">按分类查看商品</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/addGoodsPage">添加商品</a></li>
                        <li><a href="#">生成报表</a></li>
                    </ul>
                </li>
                <li><a href="${pageContext.request.contextPath}/admin/categoryPage">分类管理</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" href="#" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
                       aria-expanded="true">
                        订单管理
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu dropdowncolor" aria-labelledby="dropdownMenu1">
                        <li><a href="#">待付款订单</a></li>
                        <li><a href="#">已付款订单</a></li>
                        <li><a href="#">待收货订单</a></li>
                        <li><a href="#">已完成订单</a></li>
                    </ul>
                </li>
                <li><a href="#">用户管理</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${pageContext.request.contextPath}/admin/quit">退出</a></li>
            </ul>
            <form action="${pageContext.request.contextPath}/admin/search" class="navbar-form navbar-right" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn navbar-btn">搜索</button>
            </form>
        </div>
    </div>
</nav>
</nav>