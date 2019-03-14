<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css" />
    <link rel="stylesheet" type="text/css" href="css/main.css" />
    <script type="text/javascript" src="js/libs/modernizr.min.js"></script>
</head>

<body>
    <div class="topbar-wrap white">
        <div class="topbar-inner clearfix">
            <div class="topbar-logo-wrap clearfix">
                <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
                <ul class="navbar-list clearfix">
                    <li><a class="on" href="index.html">首页</a></li>
                    <li><a href="#" target="_blank">网站首页</a></li>
                </ul>
            </div>
            <div class="top-info-wrap">
                <ul class="top-info-list clearfix">
                    <li><a href="#">管理员</a></li>
                    <li><a href="#">修改密码</a></li>
                    <li><a href="#">退出</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="container clearfix">
        <div class="sidebar-wrap">
            <div class="sidebar-title">
                <h1>菜单</h1>
            </div>
            <div class="sidebar-content">
                    <ul class="sidebar-list">
                            <li>
                                <ul class="sub-menu">
                                    <li><a href="design.html"><i class="icon-font">&#xe003;</i>用户管理</a></li>
                                    <li><a href="design.html"><i class="icon-font">&#xe00d;</i>理财项目</a></li>
                                </ul>
                            </li>
                        </ul>
            </div>
        </div>
        <!--/sidebar-->
        <div class="main-wrap">

            <div class="crumb-wrap">
                <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span
                        class="crumb-step">&gt;</span><a class="crumb-name" href="/jscss/admin/design/">理财产品</a><span
                        class="crumb-step">&gt;</span><span>新增产品</span></div>
            </div>
            <div class="result-wrap">
                <div class="result-content">
                    <form action="/jscss/admin/design/add" method="post" id="myform" name="myform"
                        enctype="multipart/form-data">
                        <table class="insert-tab" width="100%">
                            <tbody>
                                <tr>
                                    <th><i class="require-red">*</i>名称：</th>
                                    <td>
                                        <input class="common-text required" id="title" name="title" size="50" value=""
                                            type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <th>价格：</th>
                                    <td><input class="common-text" name="author" size="50" value="" type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <th>定期时长：</th>
                                    <td><input class="common-text" name="author" size="50" value="" type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <th>利率：</th>
                                    <td><input class="common-text" name="author" size="50" value="" type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <th>价格：</th>
                                    <td><input class="common-text" name="author" size="50" value="" type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <th>简介：</th>
                                    <td><textarea name="content" class="common-textarea" id="content" cols="30"
                                            style="width: 98%;" rows="10"></textarea></td>
                                </tr>
                                <tr>
                                    <th></th>
                                    <td>
                                        <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                                        <input class="btn btn6" onclick="history.go(-1)" value="返回" type="button">
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                </div>
            </div>

        </div>
        <!--/main-->
    </div>
</body>

</html>