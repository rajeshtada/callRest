<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<html>
<head>
<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title><tiles:insertAttribute name="title" /></title>

</head>

<body>
	<!-- ===== Main-Wrapper ===== -->
	<div id="wrapper">
		<div class="preloader">
			<div class="cssload-speeding-wheel"></div>
		</div>
<%-- 		<tiles:insertAttribute name="header" /> --%>
		<!-- ===== Page-Content ===== -->
		<div class="page-wrapper">
			<tiles:insertAttribute name="body" />
			<!-- ===== Page-Container-End ===== -->
		</div>
		</div>
</body>
</html>