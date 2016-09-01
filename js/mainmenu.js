window.onload = initAll;

var profile_elm; 
var profile_sub_elm;

function initAll(){

	getAllElements();

	setAction();
	

}

function getAllElements(){
	home_elm = document.getElementById('profile_elm');
	home_sub_elm = document.getElementById('profile_sub_elm');
	
}

var arr = new Array();
function setAction(){
	profile_elm.onmouseover = onMenuOv;
	profile_elm.onmouseout = onMenuOut;

	profile_sub_elm.onmouseout = onMenuOut;
	profile_sub_elm.indx = profile_sub_elm.indx = 0;
	arr[0] = profile_sub_elm;
/*
	service_elm.onmouseover = onMenuOv;
	service_elm.onmouseout = onMenuOut;

	service_sub_elm.onmouseout = onMenuOut;
	service_elm.indx = service_sub_elm.indx = 1;
	arr[1] = service_sub_elm;
	*/
}

function onMenuOv(){	
	arr[this.indx].style.display = 'block';
}

function onMenuOut(){
	arr[this.indx].style.display = 'none';
}