window.onload=initAll;

function initAll()
{
	alert('inside');
	getAllElements();
	setAllActions();
}

var unm_box,unm_edit,unm_cancel,dob,dob_update,dob_cancel;

function getAllElements(){
	
	alert('elements mil gye');
	unm_box = document.getElementById('unm_box');
	unm_edit = document.getElementById('unm_edit');
	unm_cancel = document.getElementById('unm_cancel');
	dob = document.getElementById('dob');
	dob_update = document.getElementById('dob_update');
	dob_cancel = document.getElementById('dob_cancel');
	
	alert('elements mil gye');

}

function setAllActions(){
	alert('00000000000');	
	unm_edit.onclick = setUnmEditable;
	dob_update.onclick = setDobUpdatable;
	
}


var unmVal=null;
function setUnmEditable(){
	unmVal=unm_box.innerHTML;
	unm_box.innerHTML= '<input type="text" id="unm_text" value="'+ unmVal+'">';
	unm_edit.innerHTML = 'Save';
	unm_edit.onclick = saveUserName;
	unm_cancel.style.display = 'inline';
	unm_cancel.onclick = cancelNameUpdate;
	//alert('88888888888');
}
	
var unmUpdReq = null;
var unm_text = null;
function saveUserName(){
	unmUpdReq = createRequestObject();
	alert(unmUpdReq);
	if(unmUpdReq){
		alert('UUUUUUUUUUUUUUUUUU');
		unm_text = document.getElementById('unm_text');
		unmUpdReq.open('POST', 'update_user_name.do', true);
		unmUpdReq.setRequestHeader('content-type', 'application/x-www-form-urlencoded');
		alert('jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj');

		unmUpdReq.onreadystatechange = showUserNameChange;
		alert(unmUpdReq.onreadystatechange);

		unmUpdReq.send('username='+escape(unm_text.value));
	

	
	}
}


function showUserNameChange(){
	alert(unmUpdReq.readyState+' - '+unmUpdReq.status);
	
	if(unmUpdReq.readyState==4){
		if(unmUpdReq.status==200){
			alert(unmUpdReq.responseText);
		}
	}
}



function cancelNameUpdate(){}


var dobval=null;
function setDobUpdatable(){
	dobval = dob.innerHTML;
	dob.innerHTML = '<input type="text" id="dobnew" name="dob"  value="'+dobval+'">';
	dob_update.innerHTML = 'Save';
	dob_update.onclick = changeDob;
	dob_cancel.style.display = 'inline';

}


var dobUpdReq,dobnew;
function changeDob(){
	dobUpdReq = createRequestObject();
	alert(dobUpdReq);
	alert('----------');

	if(dobUpdReq){
		dobnew = document.getElementById('dobnew');
		dobUpdReq.open('GET', 'updatedob.do?dob1='+escape(dobnew.value), true);
		dobUpdReq.onreadystatechange = showUpdatedDob;
		dobUpdReq.send(null);
	}
}



function showUpdatedDob(){
	alert(dobUpdReq.readyState+' - '+dobUpdReq.status);
	
	if(dobUpdReq.readyState==4){
		if(dobUpdReq.status==200){
			alert(dobUpdReq.responseText);
		}
	}
}

