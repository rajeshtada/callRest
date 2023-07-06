<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<body>
	<section class="vh-100" style="background-color: #eee;">
		<div class="container h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-12 col-xl-11">
					<div class="card text-black" style="border-radius: 25px;">
						<div class="row justify-content-center">
							<div>
								<a href="${pageContext.request.contextPath }/callRest/signin">
									<button style="color:blue" type="button"
										class="btn btn-warning" id="backButton">Back</button>
								</a>
							</div>
							<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

								<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign
									up</p>
								<c:if test="${msg!=null}">${msg} </c:if>
								<form class="mx-1 mx-md-4" action="saveUserRegis" method="post">

									<div class="d-flex flex-row align-items-center mb-4">
										<i class="fas fa-user fa-lg me-3 fa-fw"></i>
										<div class="form-outline flex-fill mb-0">
											<input type="text" name="userName" id="userName"
												class="form-control" required="true" /> <label
												class="form-label" for="form3Example1c">Your Name</label>
										</div>
									</div>

									<div class="d-flex flex-row align-items-center mb-4">
										<i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
										<div class="form-outline flex-fill mb-0">
											<input type="email" name="email" id="email"
												class="form-control" required="true" /> <label
												class="form-label" for="form3Example3c">Your Email</label>
										</div>
									</div>

									<div class="d-flex flex-row align-items-center mb-4">
										<i class="fas fa-lock fa-lg me-3 fa-fw"></i>
										<div class="form-outline flex-fill mb-0">
											<input type="text" name="password" id="password"
												class="form-control" required="true" /> <label
												class="form-label" for="form3Example4c">Password</label>
										</div>
									</div>

									<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
										<button type="submit" class="btn btn-primary btn-lg">Register</button>
									</div>

								</form>

							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</section>



</body>
</html>