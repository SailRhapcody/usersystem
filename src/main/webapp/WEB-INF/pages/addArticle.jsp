<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--
  Created by IntelliJ IDEA.
  User: Max
  Date: 16.07.2017
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<html>
    <head>
        <spring:url value="/resources/css/addArticle.css" var="addArticle_css" />
        <spring:url value="/resources/js/addArticle.js" var="addArticle_js" />

        <link href="${addArticle_css}" rel="stylesheet" />
        <script src="${addArticle_js}"></script>

        <title>Title</title>
    </head>
    <body>
        <div id = "main_container_index">
        <header>WWW-WWW</header>
            <article>
                <form:form id="myAddArticleForm" method="post" action="/addArticle" modelAttribute="articleModelClassBean">

                    <p>Header Name</p>
                    <form:label path="articleHeaderName"/>
                    <form:input path="articleHeaderName" id="articleHeaderName"/>

                    <p>Article Content</p>
                    <form:label path="articleContainer" />
                    <form:textarea path="articleContainer" id = "articleContainer"/>

                    <p>Tags</p><form:label path="articleThemeTags"/>
                    <form:input path="articleThemeTags"/></br>

                    <p><input type="submit" value="Submit" id="submitArticleStateButton"/>
                </form:form>
            </article>
        </div>
    </body>
</html>
