$(document).ready(function() {
	var clientRequest = {};
	clientRequest.post = function(_url, _data) {
		console.log(22, document.ctx )
		return $.when($.ajax({
			type : "POST",
			contentType : "application/json",
			url : (document.ctx||"") + _url,
			data : JSON.stringify(_data),
			dataType : 'json',
			timeout : 600000
		}));
	}
	window.clientRequest = clientRequest;
});