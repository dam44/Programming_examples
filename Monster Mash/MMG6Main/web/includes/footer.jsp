			<footer>
				<hr />
				<p>&copy; Team Effort N06 2013</p>
			</footer>

			<!-- Friends List - (DO NOT WRAP IN DIV) -->
			<jsp:include page="../parts/friendslist.jsp" />

			<!-- javascript files -->
			<script src="http://code.jquery.com/jquery-latest.js"></script>
			<script src="/MMG6Main/resources/bootstrap/js/bootstrap.min.js"></script>
	
			<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
			<!--[if lt IE 9]>
				<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<![endif]-->

			<script>
				%("a[href='" + window.location.pathname + "']").parent().addClass("active");
			</script>

		<!-- End the bootstrap container -->
		</div>
	</body>
</html>
