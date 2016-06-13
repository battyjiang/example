<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <%
        String webRoot = "http://" + request.getServerName() + ":" + request.getServerPort();
        request.setAttribute("webRoot",webRoot);
    %>
</head>
<body>
    <div class="container-fluid" style="overflow:hidden;">
        <div class="row" style="background-color: black;">
            <div class="col-md-4" style="padding-top: 1%;padding-left: 5%;">
                <p style="color: white;font-size: large">SIMPLE易网站</p>
            </div>
            <div class="col-md-1 col-md-offset-7" style="padding-top: 1%;">
                <p style="color: skyblue;font-size: large">
                    <a href="/reg">注册</a>
                </p>
            </div>
        </div>
        <div class="row" style="padding-top: 13.4%;padding-left: 5%;padding-bottom:34%; background-color: skyblue">
            <div class="row">
                <div class="col-md-12">
                    <h5><p style="color: white;">易网站,自己的特色，你喜欢什么 就做什么吧。</p></h5>
                </div>
            </div>
            <div class="row">
                    <div class="col-md-12">
                        <form class="form-inline" method="post" action="/login">
                            <div class="control-group">
                                <input type="text" name="name" placeholder="邮箱/用户名">
                                <input type="text" name="pwd" placeholder="密码">
                                <button type="submit" class="btn-info btn-large">登入</button>
                            </div>
                        </form>
                    </div>
            </div>
        </div>
        <div class="row" style="background-color: black;padding-top: 1%;">
            <div class="col-md-4 col-md-offset-4">
                <p style="text-align: center;color: white;">Copyright © 2016 SIMPLE - EASY136.COM</p>
            </div>
        </div>
    </div>
</body>
</html>