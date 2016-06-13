<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <title><sitemesh:write property='title'/></title>
</head>
<body>
<div class="container-fluid" style="overflow:hidden;">
    <div class="row" style="background-color: white;">
        <div class="col-md-4" style="padding-top: 1%;">
            <p>SIMPLE易网站,简单的个人小站</p>
        </div>
        <div class="col-md-2 col-md-offset-6" style="padding-top: 1%;">
            <p style="color: skyblue;font-size: large">
                <sitemesh:write property="otherUrl"/>
            </p>
        </div>
    </div>
    <sitemesh:write property='body' />
    <div class="row" style="background-color: white;padding-top: 1%;">
        <div class="col-md-4 col-md-offset-4">
            <p>Copyright © 2016 SIMPLE - EASY136.COM</p>
        </div>
    </div>
</div>
</body>
</html>
