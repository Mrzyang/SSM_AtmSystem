<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <link rel="stylesheet" type="text/css" href="css/pagination.css"/>
    <script type="text/javascript" src="js/libs/modernizr.min.js"></script>
    <style type="text/css">
       .projectInfo{
           display: flex;           
       }
       .projectInfo .projectBase{
           flex: 3;
       }
       .projectInfo .projectDetail{
           flex: 7;
        }
    </style>
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
                <li><a href="http://www.jscss.me">管理员</a></li>
                <li><a href="http://www.jscss.me">修改密码</a></li>
                <li><a href="http://www.jscss.me">退出</a></li>
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
            <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">理财项目</span><span class="crumb-step">&gt;</span><span class="crumb-name">理财项目详情</span></div>
        </div>
        <div class="projectInfo">
            <div class="projectBase">
                
        <div class="result-wrap">
                    <div class="result-content">
                        <table class="result-tab" width="100%">
                            <tr>
                                <td>理财产品名称</td>
                                <td>天弘基金</td>
                            </tr>
                            <tr>
                                <td>价格</td>
                                <td>20000</td>
                            </tr>
                            <tr>
                                <td>定期时长</td>
                                <td>2年</td>
                            </tr>
                            <tr>
                                <td>利率</td>
                                <td>0.9%</td>
                            </tr>
                        </table>
                    </div>
            </div>
            </div>
            <div class="projectDetail">
                    <div class="result-wrap">
                            <div class="result-content">
                                <table class="result-tab" width="100%">
                                    <tr>
                                        <td align="center">天弘基金的详细信息</td>
                                    </tr>
                                    <tr>
                                        <td>天弘基金与支付宝合作推出余额宝</td>
                                    </tr>
                                </table>
                            </div>
                    </div>
            </div>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>