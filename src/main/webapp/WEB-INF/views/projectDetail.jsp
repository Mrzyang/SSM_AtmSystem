<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:import url="header.jsp"/>
<style type="text/css">
    .projectInfo{
        display: flex;
    }
    .projectBase {
        flex: 3;
    }
    .projectDetail{
        flex: 7;
    }
</style>

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
<c:import url="footer.jsp"/>