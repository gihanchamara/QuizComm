var quiz = {}
var questions = [];
var questionCount = 0;


pageLoadFunctions();

function pageLoadFunctions(){
	$(function() {
		
		
		// initialize questions
		
		 questionCount = 0;
		
		 quiz = {
				"title":$('#create_quiz_title').val(),
				"type":$('#create_quiz_type').val(),
				"id":$('#quizId').val(),
				"questions":[]
			 };
		
		/**
		 * Quuiz UI
		 */
		$("#add_chk_box_question").fancybox({
				'scrolling' : 'auto',
				'titleShow' : false,
				'autoScale' : 'true',
				'onClosed' : function() {
				}
		});
		/** Create Quiz Ajax Call**/
		$( "#create_quiz_submit" ).click(function() {
			  alert( "Create Quiz Clicked" );
			  createQuiz();
		});
		addNewChkBoxQuestion();
	});
}

function addNewChkBoxQuestion(){
	
	
	
	$("#save_check_box_question").click(function (){
		
		 quiz.title = $('#create_quiz_title').val();
		 quiz.type = $('#create_quiz_type').val();
		 quiz.id = 	$('#quizId').val();
		
		 var question = {
				 	"content":$('#question_title').val(),
				 	"answers":[]
				 };
		 
		 questionCount++;
		
		$('#check_box_question_set textarea').each(
			    function(index){ 
			    	console.log(index);
			    	var answers = [];
			        var input = $(this);
			        var id = input.attr("id");
			        var number = id.substr(id.length - 1);
			        var correct = false;
			        var answer = {
			        		"title": input.val(),
			        		"id" : number,
			        		"correct":false
			        };
			        
			        input.val("");
			        
			        try{
			        	answer.correct = $("#chk_answer_correct_" + number).is(":checked");
			        	$("#chk_answer_correct_" + number).prop("checked", false);
			        }catch(err){
			        	alert(err);
			        }
			        console.log(answer); // logging
			        question.answers.push(answer);
			        console.log(question); // logging
			        //alert( input.val() + "  " + answer.correct);
			    }
			);
		quiz.questions.push(question);
		$('#question_title').val("");
		console.log(quiz); // logging 
		$.fancybox.close(true);
		createQuiz(quiz);
	});
}




/** Create Quiz Ajax Function**/
function createQuiz(jsonQuizObject){
	
	$.ajax({
	    contentType: 'application/json',
	    data:JSON.stringify(jsonQuizObject
//	    		{
//	    			//"quiz":{
//	    				"title":$('#create_quiz_title').val(),
//	    				"type":$('#create_quiz_type').val()
//	    			//}
//	    		}
	    ),
	    dataType: 'json',
	    success: function(data){
	        //app.log("Create Quiz Succeeded");
	    },
	    error: function(){
	        //app.log("Create Quiz Failed");
	    },
	    processData: false,
	    type: 'POST',
	    url: 'createQuizJson.json'
	});
	
	
}




