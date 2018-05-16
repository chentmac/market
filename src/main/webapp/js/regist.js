function checkExistUser() {
    var username = document.getElementById("username").value;
    var xhr = createXmlHttp();
    xhr.onreadystatechange = function () {

        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                document.getElementById("span1").innerHTML = xhr.responseText;
            }
        }

    }
    xhr.open("GET", "${pageContext.request.contextPath}/user/userExist?username=" + username, true);
    xhr.send(null);

}

function checkPassword() {
    var password = document.getElementById("password").value;
    var repassword = document.getElementById("repassword").value;
    if (password != repassword) {
        document.getElementById("span2").innerHTML = '密码不一致！';
    }
}

function createXmlHttp() {
    var xmlHttp;

    try {
        xmlHttp = new XMLHttpRequest();
    } catch (e) {
        try {
            xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e) {
            }
        }
    }

    return xmlHttp;
}