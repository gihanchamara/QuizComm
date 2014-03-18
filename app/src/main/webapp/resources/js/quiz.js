
/** Create Quiz Ajax Function**/
function createQuiz(){
	
	$.ajax({
	    contentType: 'application/json',
	    data:JSON.stringify(
	    		{
	    			//"quiz":{
	    				"title":$('#create_quiz_title').val(),
	    				"type":$('#create_quiz_type').val()
	    			//}
	    		}
	    ),
	    dataType: 'json',
	    success: function(data){
	        app.log("Create Quiz Succeeded");
	    },
	    error: function(){
	        app.log("Create Quiz Failed");
	    },
	    processData: false,
	    type: 'POST',
	    url: 'createQuizJson.json'
	});
	
}



$(function() {
	
	/** Create Quiz Ajax Call**/
	$( "#create_quiz_submit" ).click(function() {
		  alert( "Create Quiz Clicked" );
		  createQuiz();
	});
	
	
	
});
