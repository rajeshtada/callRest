<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!-- ===== Top-Navigation ===== -->
<nav class="navbar navbar-default navbar-static-top m-b-0">
	<div class="navbar-header">
		<a class="navbar-toggle font-20 hidden-sm hidden-md hidden-lg "
			href="javascript:void(0)" data-toggle="collapse"
			data-target=".navbar-collapse"> <i class="fa fa-bars"></i>
		</a>
		<div class="top-left-part">
			<a class="logo" href="${pageContext.request.contextPath}/"> <b>
					&nbsp; </b> <span style="text-transform: uppercase;"><strong>Hello</strong>&nbsp;&nbsp;<security:authentication
						property="principal.username" /></span>
			</a>
		</div>
		<ul class="nav navbar-top-links navbar-left hidden-xs">
			<li><a href="javascript:void(0)"
				class="sidebartoggler font-20 waves-effect waves-light"><i
					class="icon-arrow-left-circle"></i></a></li>
			<li>
				<form role="search" class="app-search hidden-xs">
					<i class="icon-magnifier"></i> <input type="text"
						placeholder="Search..." class="form-control">
				</form>
			</li>
		</ul>
		<ul class="nav navbar-top-links navbar-right pull-right">
			<li class="right-side-toggle"><a
				class="right-side-toggler waves-effect waves-light b-r-0 font-20"
				href="${pageContext.request.contextPath }/logout"> <i
					class="fa fa-sign-out"></i>
			</a></li>
		</ul>
	</div>
</nav>
<!-- ===== Top-Navigation-End ===== -->
