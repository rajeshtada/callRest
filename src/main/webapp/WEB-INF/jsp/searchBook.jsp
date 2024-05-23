<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<script 
	src="${pageContext.request.contextPath}/resources/bookSearch.js">
	</script>

<div class="container-fluid">
<div class="row">
		<div class="col-md-12">
			<div class="panel panel-info">
				<div class="panel-heading"
					style="background-color: #fbd361; padding: 5px 14px;">
					<div class="row">
						<div class="col-md-6">
							<h5>Search Book Report</h5>
						</div>
					</div>
				</div>
				<div class="panel-wrapper" aria-expanded="true">
					<div class="panel-body" style="background-color: #fbd361; padding: 5px 14px;">
						<form  class="form-inline my-2 my-lg-3" method="post" id="reportVirtualVpa"
							action="${pageContext.request.contextPath }/reportVirtualVpa"
							onsubmit="submitSearchForm">
							<div class="row">
								<div class="col-md-4">
									<!-- <label>Enter Search By</label> -->
									<input name="searchBy" class="form-control"
										placeholder="Enter Search By"
										value="<c:out value="${searchBy }"> </c:out>" id="searchBy" />
								</div>
								<div class="col-md-4">
									<!-- <label>Enter Search Data</label> -->
									<input name="searchData" class="form-control"
										placeholder="Enter Search Data"
										value="<c:out value="${searchData }"> </c:out>"
										id="searchData" />
								</div>
								<div class="col-md-4">
									<!-- <label>&nbsp;</label> -->
									<input onclick = "searchBook()" class="btn btn-primary btn-block" value="Search "
										type="button" id="searchBtn" />
								</div>
								</div>
						</form>
				</div>
			</div>
			</div>
		<!-- 		<div class="row">
			<div id="transaction-table"></div>
			<div id="page-selection" style="display: none; text-align: center;"></div>
		</div> -->
</div>
	</div>
</div>
							<c:if test="${message != null }">
								<div class="row">
									<div class="col-sm-12">
										<div id="message" align="center">
											<font size=4 color="#FF0000"><b>${message}</b></font>
										</div>
									</div>
								</div>
							</c:if>
							
<div class="container-fluid" id="VpaReportPanel">
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-info">
				<div class="panel-heading" style="background-color: #fbd361; padding: 5px 24px;">
					<div class="row">
						<div class="col-md-6">
							<h5>Books Detail</h5>
						</div>
					</div>
				</div>
				<div class="panel-wrapper collapse in" aria-expanded="true">
					<div class="panel-body">

						<div class="row">
								<div class="col-12" style="min-height: 300px">
									<div class="table-responsive">
										<table class="table" >
											<thead>
												<tr>
													<th>S.No.</th>
													<th>ID</th>
													<th>Book Name</th>
													<th>Writer</th>
													<th>Price</th>
													<th>Description</th>
													
												</tr>
											</thead>
											<tbody id="virtualQrCodeTable">
											<%-- <c:forEach items="${masterVpaReportVo}"
												var="masterVpaReportVo" varStatus="status">
												<tr>
													<td><c:out value="${status.index+1 }"></c:out></td>
													<td><c:out value="${masterVpaReportVo.masterVpa }"></c:out></td>
													<td><c:out value="${masterVpaReportVo.virtualVpa }"></c:out></td>
													<td><c:out value="${masterVpaReportVo.status }"></c:out></td>
													<td><c:out value="${masterVpaReportVo.merchantName }"></c:out></td>
													<td><c:out value="${masterVpaReportVo.ifscCode }"></c:out></td>
													<td><c:out value="${masterVpaReportVo.accountNumber }"></c:out></td>
												</tr>
												</c:forEach> --%>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	
	
	<!-- <script type="text/javascript">

	function searchBook() {
	var searchBy = document.getElementById("searchBy").value;
	var searchData = $("#searchData").val();
// 	var searchBy = $("#searchBy").val();
	var settings = {
		//		"url": "http://localhost:8018/bookApi/searchBook",
		"url": "/bookApi/searchBook",
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		"data": JSON.stringify({
			"searchDataField": searchBy,
			"searchDataBy": searchData
		}),
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
		var html = '';
		var data = response.listBookDetailVo;
		var count = 0;
		for (var i = 0; i < data.length; i++) {

			html += '<tr><td>${count}</td><td>${data.id }</td><td>${data.bookName }</td><td>${data.writer }</td><td>${data.price }</td><td>${data.description }</td></tr>'
			count++;
		}
	document.getElementById('virtualQrCodeTable').innerHTML = html;
	});

}
	
	</script> -->
	
	<!-- <script>
	$(document).ready(function() {
		$('#page-selection').bootpag({
			// alert("hello");
			total : "${lazyLoading.noOfPages}",
			maxVisible : 10
		}).on('page', function(event, num) {
			showPage(num);
		});
		showPage(1);
	});
</script> -->
	
	
	