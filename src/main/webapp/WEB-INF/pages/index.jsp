<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: SailRhapcody
  Date: 11/13/2017
  Time: 1:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <spring:url value="/resources/css/index.css" var="index_css" />
    <spring:url value="/resources/js/index.js" var="index_js" />

    <link href="${index_css}" rel="stylesheet" />
    <script src="${index_js}"></script>
    <title>Title</title>
</head>
<body>
<div id="main_container_index">
    <button id="main_click_button"><a href="/addArticle">CLICK ME</a> </button>
</div>
</body>
</html>
