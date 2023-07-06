<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:if test="${msg!=null}">
${msg}
</c:if>

	<form action="addBookDetails" method="post">
		<div class="col-md-6 text-center ml-5">

			<div class="form-group row mt-5">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Book</label>
				<div class="col-sm-10">
					<input type="text" name="bookName" class="form-control"
						id="inputEmail3" placeholder="Book Name">
				</div>
			</div>
			
			<div class="text-left ml-5">
				<c:if test="${msg1!=null}">
				${msg1}
				</c:if>
			</div>

			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Writer</label>
				<div class="col-sm-10">
					<input type="text" name="writer" class="form-control"
						id="inputPassword3" placeholder="Writer Name">
				</div>
			</div>

			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Price</label>
				<div class="col-sm-10">
					<input type="text" name="price" class="form-control"
						id="inputPassword3" placeholder="Price Amount in Rs.">
				</div>
			</div>

			<div class="form-group row">
				<label for="exampleFormControlTextarea1"
					class="col-sm-2 col-form-label">Description</label>
				<div class="col-sm-10">
					<textarea class="form-control" name="description"
						id="exampleFormControlTextarea1" placeholder="Add Description"
						rows="3"></textarea>
				</div>
			</div>

			<div class="form-group row ml-5">
				<div class="col-sm-10 ml-5">
					<button type="submit" class="btn btn-primary">Add Book</button>
				</div>
			</div>
		</div>

	</form>

	
	