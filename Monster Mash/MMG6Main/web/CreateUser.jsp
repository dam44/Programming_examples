<%-- 
    Document   : CreateUser
    Created on : Jan 28, 2013, 2:09:17 PM
    Author     : jamesslater
--%>

<%@page import="monsterMashGroupProject.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="regUser" class="monsterMashGroupProject.RegisterInfo" scope="session"/>
<jsp:setProperty name="regUser" property="*"/> 
<HTML>
    <HEAD><META http-equiv="Refresh" content="0; url=<%=regUser.addUser()%>"/></HEAD>
    <BODY>
        <jsp:include page="includes/header.jsp" />
        <!-- Body Content -->
        <div class="well" style="text-align:center;">
            <h2>Loading</h2>
            <img src="resources/template/img/loading.gif" />
        </div>

        <jsp:include page="includes/footer.jsp" />
    </BODY>
</HTML>
