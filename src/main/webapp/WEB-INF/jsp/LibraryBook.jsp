<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>

	<c:if test="${msg!=null}">${msg}</c:if>

	<div class="m-5">
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search Book" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			<a class="nav-link disabled" href="#">${userName}</a>
		</form>
	</div>

	<div class="m-5">
		<table class="table table-striped">
			<tr>
				<th>Book Name</th>
				<th>Writer</th>
				<th>Price</th>
				<th>Description</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>

			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.bookName}</td>
					<td>${book.writer}</td>
					<td>${book.price}</td>
					<td>${book.description}</td>
					<td><form class="edit" method="post" action="${pageContext.request.contextPath }/Book/editBook"	target="_blank">
							<input type="hidden" name="id" value="${book.id }">
							<button type="text" class="btn btn-xs">	Update <i class="fa fa-edit"></i></button>
						</form></td>
					<td><form class="edit" method="post"
							action="${pageContext.request.contextPath }/Book/deleteBook"
							target="_blank">
							<input type="hidden" name="id" value="${book.id }">
							<button class="btn btn-xs">
								Delete <i class="fa fa-edit"></i>
							</button>
						</form></td>
				</tr>

			</c:forEach>

		</table>
	</div>


</body>


