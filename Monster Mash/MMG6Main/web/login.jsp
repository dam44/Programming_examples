<jsp:include page="includes/header.jsp"/>
		<!-- Body Content -->
		<div class="row">
			<div class="well span6 offset3">
			<h2>Login</h2>
			<form class="form-horizontal" name="loginform" method="post" action="SaveName.jsp">
				<div class="control-group">
					<label class="control-label" for="username">Username</label>
					<div class="controls">
						<input type="text" name="username" id="username" placeholder="Username" />
					</div>
				</div>
				<div class="control-group">
				  <label class="control-label" for="password">Password</label>
				  <div class="controls">
					<input type="password" name="password" id="password" placeholder="Password" />
					<!--<p><a href="forgottenpassword.jsp">Forgotten Password?</a></p>-->
				  </div>
				</div>
				<div class="control-group">
				  <div class="controls">
					<input type="submit" class="btn btn-neutral" value="Sign in" />
					<a href="#registerModal" role="button" class="btn btn-primary" data-toggle="modal">Register</a>
				  </div>
				</div>
			</form>
		</div>
		</div>

		<!-- Register Modal -->
		<div id="registerModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		 <form name="second" method=POST action="CreateUser.jsp">
                                                <p> Username : <input type="text" name="regUsername"> </p>
                                                <p> Password: <input type="text" name="regPassword"></p>
                                                <p> e-mail : <input type="text" name="regEmail"> </p> 
                                                <input type="submit" value="Register" >
                                            </form>
		</div>

<jsp:include page="includes/footer.jsp" />
