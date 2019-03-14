<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:import url="header.jsp"/>

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">用户管理</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
             <b>zhangyang</b> 的基本信息如下：
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">账户余额</label><span class="res-info">${totalMoney}</span>
                    </li>
                    <li>
                        <label class="res-lab">银行卡数量</label><span class="res-info">${cardNum}张</span>
                    </li>
                    <li>
                        <label class="res-lab">已购买理财产品数</label><span class="res-info">${projectNum}</span>
                    </li>
                </ul>
            </div>
        </div>

        <div class="result-wrap">
            <form name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="insert.html"><i class="icon-font"></i>购买理财产品</a>
                        <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量取消</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">

                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th>
                            <th>理财产品名称</th>
                            <th>所属银行卡号</th>
                            <th>产品价格</th>
                            <th>定期时长</th>
                            <th>购买时间</th>
                            <th>到期时间</th>
                            <th>利率</th>
                            <th>购买数目</th>
                            <th>总价</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach var="i" items="${projectBoughtList}">
                        <tr>
                            <td class="tc"><input name="id[]" value="59" type="checkbox"></td>
                            <td title="">${i.projectName}</td>
                            <td>${i.cardNum}</td>
                            <td>${i.buyMoney}元</td>
                            <td>${i.allocationTime}年</td>
                            <td>${i.buyTime}</td>
                            <td>${i.dueTime}</td>
                            <td>${i.yieldRate}%</td>
                            <td>${i.num}</td>
                            <td>${i.totalMoney}元</td>
                            <td>
                                <a class="link-del" href="#">取消</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                    <div class="list-page">
                        <ul class="pagination">
                            <li><a href="#">&laquo;</a></li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#">&raquo;</a></li>
                        </ul>
                    </div>
                </div>
            </form>
        </div>

<c:import url="footer.jsp"/>