function createRequestObject(){
	var requestObj = null ;
	alert('within ajax');

	try{
		requestObj = new XMLHttpRequest();
	}catch(e){
					try{
						requestObj = new ActiveObject('Msxml2.XMLHTTP');
					}catch(e){
									try{
										requestObj = new ActiveXObject('Microsoft.XMLHTTP');
										}catch(e){
											alert('please install an updated browser');
										}
								}
				}
				return requestObj;
}