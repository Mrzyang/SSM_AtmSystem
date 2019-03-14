<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:import url="header.jsp"/>

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

<c:import url="footer.jsp"/>