<%@ page contentType="text/html; charset=EUC-KR" %>

<%@ page  errorPage="03JSEErrorPage.jsp" %>

<%--
<%@ page errorPage = "http://127.0.0.1:8080/edu/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/edu/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/jw06/03JSPErrorPage.jsp" %>

<%@ page errorPage = "/edu/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/jw06/03JSPErrorPage.jsp" %>
<%@ page errorPage = "/03JSPErrorPage.jsp" %>

==> web application (ContextRoot::/edu)���� ���
 --%>

<%--<%@page buffer="none" %> --%>

<html>

<body>

<%@ page import="java.util.*" %>

<%@ page language="java" %>
<%@ page info="ó�� �ۼ��ϴ� JSP" %>

<%@ page session="true" %>
<%@ page isThreadSafe="true" %>

�ȳ��ϼ��� html ����<br/>
buffer ��ü ũ�� : <%= out.getBufferSize() %><br/>
buffer �ܿ� ũ�� : <%= out.getRemaining() %><br/>

<hr/>
������ Exception �߻�...

<% int number = 0; %>
<% number = Integer.parseInt("a"); %>
<%="number : "+number %>
<hr/>
�ȳ��ϼ��� html ��<br/>
</body>
</html>