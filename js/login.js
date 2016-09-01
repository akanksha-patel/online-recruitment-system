window.onload = initAll;

var email,password;
var email_msg, password_msg;
var login_form;

function initAll(){
	
	getAllElements();

	setAction();	 

}

function getAllElements(){
	email = document.getElementById('email');
	password = document.getElementById('password');

	email_msg = document.getElementById('email_msg');
	password_msg = document.getElementById('password_msg');
	
	login_form = document.forms['login_form'];
	
}

function setAction(){
	email.onblur = emailOnBlur;
	email.onfocus = emailOnFocus;

	password.onblur = passwordOnBlur;
	password.onfocus = passwordOnFocus; 

	login_form.onsubmit = validateForm;

}

function emailOnBlur(){
	var flag=true;

	if(!email.value){
		email_msg.innerHTML = "*Email Required";
		flag = false; 
	}

	return flag;
}

function emailOnFocus(){
	email_msg.innerHTML = "";
}
	
function validateForm(){
	var flag = true;
	var t1 = emailOnBlur();
	var t2 = passwordOnBlur();
	
	if(!(t1&&t2)){
		flag = false;
	}
	return flag;
}

function passwordOnBlur(){
	var flag = true;
	if(!password.value){
		password_msg.innerHTML = "*Password Required";
		flag = false;
	}
	return flag;
}

function passwordOnFocus(){
	password_msg.innerHTML = "";
}