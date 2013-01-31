<%-- 
    Document   : sellMonster
    Created on : Jan 30, 2013, 5:30:52 PM
    Author     : jamesslater
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="sellMon" class="monsterMashGroupProject.ShopController" scope="session"/>
<HTML>
    <HEAD><META http-equiv="Refresh" content="0; url= <%= sellMon.sellMonster(request.getParameter("monsterid"))%>"/></HEAD>
    <BODY>
        <jsp:include page="includes/header.jsp" />
		<!-- Body Content -->
		<div class="well" style="text-align:center;">
			<h2>Selling To Shop</h2>
			<img src="resources/template/img/loading.gif" />
		</div>

<jsp:include page="includes/footer.jsp" />

    </BODY>
</html>
