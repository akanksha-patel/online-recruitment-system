window.onload = initAll;

var nm,eml,password,retypepassword;
var nm_msg,password_msg,retypepassword_msg,eml_msg;

function initAll(){

	getAllElements();

	setAction();

}

function getAllElements(){
	
	nm = document.getElementById('nm');
	nm_msg = document.getElementById('nm_msg');

	eml = document.getElementById('eml');
	eml_msg = document.getElementById('eml_msg');

	password = document.getElementById('password');
	password_msg = document.getElementById('password_msg');

	retypepassword = document.getElementById('retypepassword');
	retypepassword_msg = document.getElementById('retypepassword_msg');

	company = document.getElementById('company');
	candidate = document.getElementById('candidate');
		
	register_msg = document.getElementById('register_msg');

	register_form = document.forms['register_form'];


}

function setAction(){
	
	nm.onblur = nameOnBlur;
	nm.onfocus = nameOnFocus;

	eml.onblur = emailOnBlur;
	eml.onfocus = emailOnFocus;

	password.onblur = passwordOnBlur;
	password.onfocus = passwordOnFocus;

	retypepassword.onblur = rePasswordOnBlur;
	retypepassword.onfocus = rePasswordOnFocus;

	candidate.onclick = company.onclick = registerOnClick; 

	register_form.onsubmit = validateForm;

}

function registerOnClick(){
	register_msg.innerHTML ='';
}

function registerValidation(){
	var flag = true;
		
	if(!(candidate.checked||company.checked)){
		register_msg.innerHTML = '* Select option';
		flag =false;
	}
	return flag;
}

function validateForm(){

	var flag = true;
    var t1 = nameOnBlur();
	var t2 = emailOnBlur();
	var t3 = passwordOnBlur();
	var t4 = rePasswordOnBlur();
	var t5 = registerValidation();
		
	if(!(t1&&t2&&t3&&t4&&t5)){
		flag = false;
	}
	return flag;
}

function nameOnBlur(){
	var flag = true;
	if(!nm.value){
		nm_msg.innerHTML = ' * Name Required';
		flag = false;
	}
	return flag;
}

function nameOnFocus(){
	nm_msg.innerHTML = '';
} 

function emailOnBlur(){
	var flag = true;

	if(!eml.value){
		eml_msg.innerHTML = ' * Email Required';
		flag = false;
	}
	return flag;
}

function emailOnFocus(){
	eml_msg.innerHTML = '';
} 

function passwordOnBlur(){
	
	var flag = true;
			
	if(!password.value){
		password_msg.innerHTML = ' * Password Required';
		flag = false;
	}
	return flag;
}

function passwordOnFocus(){
	password_msg.innerHTML = '';
}

function rePasswordOnBlur(){
	var flag = true;
	if(retypepassword.value!=password.value){
		retypepassword_msg.innerHTML = ' * Password not matched';
		flag = false;
	}
	return flag;
}

function rePasswordOnFocus(){
	retypepassword_msg.innerHTML = '';
} 


