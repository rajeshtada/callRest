<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


	<form action="${pageContext.request.contextPath }/test/testDynamicJarDo" method="get" >
		<div class="col-md-6 text-center ml-5">
			<input type="hidden" name="id">
			<div class="form-group row mt-5">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Input Url</label>
				<div class="col-sm-10">
					<input type="text" name="inputUrl" class="form-control"
						id="inputUrl" placeholder="input Url"/>
				</div>
			</div>
			<div class="form-group row mt-5">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Input Value</label>
				<div class="col-sm-10">
					<input type="text" name="value" class="form-control"
						id="value" placeholder="input value"/>
				</div>
			</div>
			
			<div class="form-group row ml-5">
				<div class="col-sm-10 ml-5">
					<button type="submit" class="btn btn-primary">Save</button>
				</div>
			</div>
			
			<div class="form-group row">
				<label for="exampleFormControlTextarea1"
					class="col-sm-2 col-form-label">Description</label>
				<div class="col-sm-10">
					<input class="form-control" name="showValue" value="${showValue}"/>
				</div>
			</div>
			
			<div class="text-left ml-5">
				<c:if test="${message!=null}">
				${message}
				</c:if>
			</div>

<%-- 			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Writer</label>
				<div class="col-sm-10">
					<form:input type="text" name="writer" path="writer" class="form-control"
						id="inputPassword3" placeholder="Writer Name" value="${book.writer }" />
				</div>
			</div>

			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Price</label>
				<div class="col-sm-10">
					<form:input  type="text" name="price" path="price" class="form-control"
						id="inputPassword3" placeholder="Price Amount in Rs." value="${book.price }" />
				</div>
			</div> --%>




		</div>

	</form>

	
	