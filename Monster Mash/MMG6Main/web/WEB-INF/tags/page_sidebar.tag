<!-- page_sidebar.tag - Contains the html which defines a page with a sidebar.
Author Ben (beb12) -->

<!-- Name the template -->
<%@tag description="Page with Sidebar Menu" pageEncoding="UTF-8"%>
<!-- Configuration variables -->

<% String locationToResources = "/TestMM/resources/"; %>

<!-- Define all of the attributes the page needs. -->
<%@attribute name="head" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!-- Start the HTML -->
<html>
	<head>
		<!-- Include the framework css/js files -->
		<link href="<%= locationToResources %>bootstrap/css/bootstrap.css" rel="stylesheet" />
		<link href="<%= locationToResources %>bootstrap/css/bootstrap-responsive.css" rel="stylesheet" />
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script src="<%= locationToResources %>bootstrap/js/bootstrap.min.js"></script>

		<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
		<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

		<!-- Custom css/js -->
		<link href="<%= locationToResources %>css/style.css" />

		<!-- JSP invoke to allow other templates to add to the header -->
		<jsp:invoke fragment="head" />

	</head>
	<body>
		<!-- begin the Bootstrap container -->
		<div class="container">
			<!-- JSP include the header -->
			<header>
				<jsp:include page="parts/header.jsp" />
			</header>

			<!-- JSP include the navigation bar -->
			<div id="navigation">
				<jsp:include page="parts/navigation.jsp" />
			</div>

            <div class="row">
                <!-- JSP include the sidebar -->
                <div id="sidebar" class="span3">
                    <jsp:include page="parts/sidebar.jsp" />
                </div>

                <!-- JSP doBody - the other templates will handle this part. -->
                <div id="body" class="span9">
                    <jsp:include page="page/welcome.jsp" />
                </div>
            </div>

			<!-- JSP include the footer -->
			<footer>
				<jsp:include page="parts/footer.jsp" />

				<!-- JSP invoke for any additional info in the footer -->
				<jsp:invoke fragment="footer" />
			</footer>

			<!-- Friends List - (DO NOT WRAP IN DIV) -->
			<jsp:include page="parts/friendslist.jsp" />

		<!-- End the bootstrap container -->
		</div>
	</body>
</html>
