<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台登陆</title>
    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css'>
    <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
    <link rel='stylesheet' href='${pageContext.request.contextPath}/css/login.css'>
</head>
<body>
<div class="form-bg" style="padding: 20px 0;">
    <div class="container">
        <div class="row">
            <div class="col-md-offset-3 col-md-6">
                <form action="${pageContext.request.contextPath}/admin/doLogin" method="post" class="form-horizontal">
                    <span class="heading">管理员登录</span>
                    <div class="form-group">
                        <input type="text" class="form-control" id="inputEmail3" placeholder="管理员" name="username">
                        <i class="fa fa-user"></i>
                    </div>
                    <div class="form-group help">
                        <input type="password" class="form-control" id="inputPassword3" placeholder="密　码"
                               name="password">
                        <i class="fa fa-lock"></i>
                        <a href="#" class="fa fa-question-circle"></a>
                    </div>
                    <div class="form-group">
                        <div class="main-checkbox">
                            <input type="checkbox" value="None" id="checkbox1" name="check"/>
                            <label for="checkbox1"></label>
                        </div>
                        <span class="text">Remember me</span>
                        <button type="submit" class="btn btn-default">登录</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
