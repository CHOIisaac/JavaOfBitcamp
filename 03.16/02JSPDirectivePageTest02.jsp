<%@ page contentType="text/html; charset=EUC-KR" %>

<%@ page  errorPage="03JSEErrorPage.jsp" %>

<%--
<%@ page errorPage = "http://127.0.0.1:8080/edu/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/edu/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/jw06/03JSPErrorPage.jsp" %>

<%@ page errorPage = "/edu/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/03JSPErrorPage.jsp" %>

==> web application (ContextRoot::/edu)에서 출발
 --%>

<%--<%@page buffer="none" %> --%>

<html>

<body>

<%@ page import="java.util.*" %>

<%@ page language="java" %>
<%@ page info="처음 작성하는 JSP" %>

<%@ page session="true" %>
<%@ page isThreadSafe="true" %>

안녕하세요 html 시작<br/>
buffer 전체 크기 : <%= out.getBufferSize() %><br/>
buffer 잔여 크기 : <%= out.getRemaining() %><br/>

<hr/>
인위적 Exception 발생...

<% int number = 0; %>
<% number = Integer.parseInt("a"); %>
<%="number : "+number %>
<hr/>
안녕하세요 html 끝<br/>
</body>
</html>