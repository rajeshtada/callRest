
//function findAll() {
//	var url = document.getElementById('baseUrl').value;
//	var settings = {
//		"url": url + "/access/findAll",
//		"method": "GET",
//		"timeout": 0,
//		"headers": {
//			"Cookie": "JSESSIONID=98ECDD82B5678DCFC517E5FE29C09F31"
//		},
//	};
//
//	$.ajax(settings).done(function(response) {
//		console.log(response);
//		var data = response.data
//		var html = '';
//		data.map((item) => {
//			var stringData = JSON.stringify(item)
//			html += `<tr>
//					  			<td>${item.role}</td>
//					  			<td>${item.endPoint}</td>
//					  			<td>${item.permission}</td>
//					  			<td><div class='d-flex'>
//					  			     <button class="btn btn-success mx-2"  data-toggle="modal" data-target="#exampleModal" onclick='updateData(${stringData})'>Update</button>
//					  			      <button class="btn btn-danger" >Delete</button>
//					  			     </div>
//					  			</td></tr>`
//		});
//		document.getElementById("filterData").innerHTML = html;
//	});
//}

function searchBook() {
	document.getElementById("message").innerHTML = '';
	var searchBy = document.getElementById("searchBy");
	var searchData = $("#searchData").val();

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

		for (var i = 0; i < data.length; i++) {

			html += '<tr><td>${count}</td><td>${data.id }</td><td>${data.bookName }</td><td>${data.writer }</td>'
			+' <td>${data.price }</td><td>${data.description }</td></tr>'
			count++;
		}
	document.getElementById('virtualQrCodeTable').innerHTML = html;
	});

}







function saveUpdate() {
	document.getElementById("message").innerHTML = '';
	var url = document.getElementById('baseUrl').value;
	document.getElementById("message").innerHTML = '';

	var settings = {
		"url": url + "/access/save",
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json",
		},
		"data": JSON.stringify({
			"id": $("#idv").val(),
			"role": $("#saveRole").val(),
			"endPoint": $("#saveEndpoint").val(),
			"permission": $("#savePermission").val()
		}),
	};
	$.ajax(settings).done(function(response) {
		flag++;
		console.log(response);
		document.getElementById("message").innerHTML = response.message;
		getData();
	});
}


function getData() {
	document.getElementById("filterData").innerHTML = '';
	var url = document.getElementById('baseUrl').value;

	var role = $("#role").val();
	var endpoint = $("#endpoint").val();
	var permission = $("#permission").val();

	var settings = {
		"url": url + "/access/searchBy",
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json",
		},
		"data": JSON.stringify({
			"role": role,
			"endPoint": endpoint,
			"permission": permission
		}),
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
		var html2 = '';
		if (response.status == 200 && flag == 0) {
			html2 = 'Data Fetch Successfully !!!';
			document.getElementById("message").innerHTML = html2;
		}
		var data = response.data
		var html = '';

		data.map((item) => {
			var stringData = JSON.stringify(item)
			html += `<tr>
					  			<td>${item.role}</td>
					  			<td>${item.endPoint}</td>
					  			<td>${item.permission}</td>
					  			<td><div class='d-flex'>
					  			     <button style="cursor: pointer;" class="btn btn-success mx-2"  data-toggle="modal" data-target="#exampleModal" onclick='updateData(${stringData})'>Update</button>
					  			      <button style="cursor: pointer;" class="btn btn-danger" onclick="deleteById(${item.id})">Delete</button>
					  			     </div>
					  			</td></tr>`
		})
		document.getElementById("filterData").innerHTML = html;

		flag = 0;
	});
}

function deleteById(id) {
	var con;
	con = confirm("Are you sure want to delete this end point ???");

	if (con == true) {
		document.getElementById("filterData").innerHTML = '';
		var url = document.getElementById('baseUrl').value;

		var settings = {
			"url": url + "/access/delete",
			"method": "POST",
			"timeout": 0,
			"headers": {
				"Content-Type": "application/json",
			},
			"data": JSON.stringify({
				"id": id
			}),
		};

		$.ajax(settings).done(function(response) {
			console.log(response);
			document.getElementById("message").innerHTML = response.message;
			flag++;
			getData();
		});
	} else {
		return false;
	}

}




