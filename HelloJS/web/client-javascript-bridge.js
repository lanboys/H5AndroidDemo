function renderNotice(object){
	var data = JSON.parse(object);
	$('.title').text(data.title);
	$('.date').text(data.pushTime);
	$('.content').text(data.content);
	$('.container').show();
}

function sendLoginStatus(token){
	document.body.innerHTML = token;
}