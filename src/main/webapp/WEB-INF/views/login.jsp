<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
</head>
<otherUrl><a href="/reg">注册</a></otherUrl>
<body>
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
</body>
</html>