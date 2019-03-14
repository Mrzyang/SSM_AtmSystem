<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台登录</title>
    <link href="/assets/css/admin_login.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
    <script src="/assets/js/jquery-3.2.1.js"></script>
    <script src="/assets/js/layer.js"></script>
</head>
<body>
    <div id="Layer1" style="position:absolute;left:0px; top:0px; width:100%; height:100%;">
        <img src="/assets/images/bg.jpg" width="100%" height="100%" style="z-index: -1;position: absolute" />
        <div class="admin_login_wrap">
            <h1>ATM系统</h1>
            <div class="adming_login_border">
                <div class="admin_input">
                    <form id="form_for_login">
                        <ul class="admin_items">
                            <li>
                                <label for="user"><i class="fa fa-user" aria-hidden="true" style="font-size: 20px"></i></label>
                                <input type="text" name="username"  id="username" size="35" placeholder="请输入用户名或手机号"
                                    class="admin_input_style" />
                            </li>
                            <li>
                                <label for="password"><i class="fa fa-lock" aria-hidden="true" style="font-size: 20px"></i></label>
                                <input type="password" name="password" value="" id="password" size="35" placeholder="请输入密码"
                                    class="admin_input_style" />
                            </li>
                            <li>
                                <label for="verifycode">验证码:</label>
                                <input type="text" name="verifycode" id="verifycode" size="18"
                                    class="admin_input_style" />
                                <img id="img" src="/verifycode" onclick="javascript:changeImg()"
                                    style="position: relative;top: 10px" />
                            </li>
                            <li>
                                <button id="btn-submit" type="button" class="btn btn-primary">登录</button>
                            </li>
                        </ul>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>

<!--ajax提交表单-->
<script>
        $(document).ready(function () {
            $("#btn-submit").click(function () {
                if (!$('#username').val()) {
                    alert("请输入用户名！");
                    return;
                }
                if (!$('#password').val()) {
                    alert("请输入密码！");
                    return;
                }
                if(!$('#verifycode').val()){
                    alert("请输入验证码！");
                } else {
                    $.ajax({
                        type: "post",
                        url: "/doLogin",
                        data: $('#form_for_login').serialize(),
                        dataType: "json",
                        success: function (result) {
                            var msg=result.message;
                            console.log(msg);
                            layer.msg(msg);
                            if (result.status == 200) {
                                window.setTimeout("window.location.href='/userManage'", 5000);
                            }
                        }
                    });
                }
            });
    
            //回车提交表单
            $("#form_for_login").keydown(function(e){
                var e = e || event,
                    keycode = e.which || e.keyCode;
                if (keycode==13) {
                    $("#btn-submit").trigger("click");
                }
            });
        });
    </script>
    
    <!-- 触发JS刷新验证码-->
    <script type="text/javascript">
        function changeImg(){
            var img = document.getElementById("img");
            img.src = "/verifycode?date=" + new Date();
        }
    </script>