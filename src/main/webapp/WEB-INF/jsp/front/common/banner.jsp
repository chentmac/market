<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="banner">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
        </ol>

        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="${pageContext.request.contextPath}/image/1.jpg" alt="风景1">
                <div class="carousel-caption">
                    <h4>真正的才智是刚毅的志向。 —— 拿破仑</h4>
                </div>
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/image/2.jpg" alt="风景2">
                <div class="carousel-caption">
                    <h4>志向不过是记忆的奴隶，生气勃勃地降生，但却很难成长。 —— 莎士比亚</h4>
                </div>
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/image/3.jpg" alt="风景3">
                <div class="carousel-caption">
                    <h4>志向和热爱是伟大行为的双翼。 —— 歌德</h4>
                </div>
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/image/4.jpg" alt="风景4">
                <div class="carousel-caption">
                    <h4>生活有度，人生添寿。 —— 书摘</h4>
                </div>
            </div>
        </div>

        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>