<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css'>
    <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
    <link rel='stylesheet' href='${pageContext.request.contextPath}/css/login.css'>
    <script src="${pageContext.request.contextPath}/js/regist.js" charset="UTF-8"></script>
</head>
<body>
<div class="form-bg" style="padding: 20px 0;">
    <div class="container">
        <div class="row">
            <div class="col-md-offset-3 col-md-6">
                <form action="${pageContext.request.contextPath}/user/doRegister" method="post" class="form-horizontal">
                    <span class="heading">用户注册</span>
                    <div class="form-group">
                        <input type="text" class="form-control" id="username" placeholder="请输入用户名" name="username"
                               onblur="checkExistUser()">
                        <span id="span1"></span>
                        <i class="fa fa-user"></i>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="password" placeholder="请输入密码"
                               name="password">
                        <i class="fa fa-lock"></i>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="repassword" placeholder="请确认密码"
                               onblur="checkPassword()">
                        <span id="span2"></span>
                        <i class="fa fa-lock"></i>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-default">注册</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
