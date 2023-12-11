<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" type="image/png" sizes="16x16"
	href="${pageContext.request.contextPath}/resources/images/getepay.png">
<title>Admin Portal</title>
<!-- ===== Bootstrap CSS ===== -->


</head>
<body class="mini-sidebar">
	<!-- ===== Main-Wrapper ===== -->
	<div id="wrapper">
		<div class="preloader">
			<div class="cssload-speeding-wheel"></div>
		</div>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="menu" />
		<!-- ===== Page-Content ===== -->
		<div class="page-wrapper">
			<tiles:insertAttribute name="body" />
			<tiles:insertAttribute name="footer" />
			<!-- ===== Page-Container-End ===== -->
		</div>
		<!-- ===== Page-Content-End ===== -->
	</div>
	<!-- ===== Main-Wrapper-End ===== -->
	

</body>
</html>
