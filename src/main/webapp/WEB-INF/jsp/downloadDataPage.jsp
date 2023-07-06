
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<body>
	<div style="text-align: center;">${message }</div>
	<c:if test="${msg!=null}">${message}</c:if>
	<h2>In Download Page</h2>
	<form:form
		action="${pageContext.request.contextPath}/download/excelDownload"
		method="post" data-parsley-validate="parsley"
		data-parsley-trigger="keyup" class="needs-validation"
		novalidate="novalidate">
		<div class="row">
			<div class="col-sm-3">
				<label>Download Excel</label> <input class="btn btn-primary"
					value="Download_Excel" type="submit"
					style="float: right; margin-top: 4px;" />
				<%-- <form:input type="submit" class="btn btn-success" value="DownloadExcel"/> --%>
			</div>
		</div>
	</form:form>
	<form class="login100-form validate-form flex-sb flex-w"
			action="${pageContext.request.contextPath }/download/pdfDownload" method="post">
			<div class="row">
			<div class="col-sm-4">
				<label>Download PDF</label> <input class="btn btn-primary"
					value="Download_PDF" type="submit"
					style="float: right; margin-top: 4px;" />
			</div>
		</div>
			</form>
	


</body>
</html>