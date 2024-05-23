
function searchBook() {
	alert('hello')
	}

//function searchBook() {
//	document.getElementById("message").innerHTML = '';
//	var searchBy = document.getElementById("searchBy");
//	var searchData = $("#searchData").val();
//
//	var settings = {
//		//		"url": "http://localhost:8018/bookApi/searchBook",
//		"url": "/bookApi/searchBook",
//		"method": "POST",
//		"timeout": 0,
//		"headers": {
//			"Content-Type": "application/json"
//		},
//		"data": JSON.stringify({
//			"searchDataField": searchBy,
//			"searchDataBy": searchData
//		}),
//	};
//
//	$.ajax(settings).done(function(response) {
//		console.log(response);
//		var html = '';
//		var data = response.listBookDetailVo;
//
//		for (var i = 0; i < data.length; i++) {
//
//			html += '<tr><td>${count}</td><td>${data.id }</td><td>${data.bookName }</td><td>${data.writer }</td>'
//			+' <td>${data.price }</td><td>${data.description }</td></tr>'
//			count++;
//		}
//	document.getElementById('virtualQrCodeTable').innerHTML = html;
//	});
//
//}



