<jsp:useBean id="user" class="monsterMashGroupProject.Login" scope="session"/>
<jsp:useBean id="usercontroller" class="monsterMashGroupProject.UserController" scope="session"/>
<jsp:include page="includes/header.jsp"/>
<jsp:include page="includes/sidebar.jsp" />
		<!-- Body Content -->
		<h2>Welcome <%= usercontroller.setTheUsr(user) %></h2>
		<p class="lead">Welcome</p>
        
<jsp:include page="includes/sidebarclose.jsp" />
<jsp:include page="includes/footer.jsp" />
