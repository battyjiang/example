<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head></head>
<otherUrl><a href="/login">登陆</a></otherUrl>
<body>
    <div class="row" style="padding-top: 13.4%;padding-left: 5%;padding-bottom:22.3%; background-color: skyblue">
        <div class="row">
            <div class="col-md-12">
                <h5><p style="color: white;">易网站,自己的特色，你喜欢什么 就做什么吧。</p></h5>
            </div>
        </div>
        <div class="row" style="padding-left: 1%;">
            <div class="col-md-12">
                <form class="form-horizontal" role="form" method="post" action="/reg">
                    <div class="form-group">
                        <label for="name">注册名称:</label>
                        <input type="text" name="name" placeholder="用户名称">
                    </div>
                    <div class="form-group">
                        <label for="email">注册邮箱:</label>
                        <input type="text" name="email" placeholder="邮箱地址">
                    </div>
                    <div class="form-group">
                        <label for="pwd">设置密码:</label>
                        <input type="text" name="pwd" placeholder="设置密码">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn-info btn-large">点击注册</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>