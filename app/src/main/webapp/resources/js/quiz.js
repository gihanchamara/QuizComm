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
				"id":$('#quiz_id').val(),
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
		 quiz.id = 	$('#quiz_id').val();
		
		 var question = {
				 	"title":$('#question_title').val(),
				 	"answers":[],
				 	"type":"multi"
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



function editQuestion(){
	
}


/** Create Quiz Ajax Function**/
function createQuiz(jsonQuizObject){
	
	$.ajax({
	    contentType: 'application/json',
	    data:JSON.stringify(jsonQuizObject),
	    dataType: 'json',
	    success: function(data){
	        //app.log("Create Quiz Succeeded");
	    	updateUI(data);
	    },
	    error: function(){
	        //app.log("Create Quiz Failed");
	    },
	    processData: false,
	    type: 'POST',
	    url: 'createQuizJson.json'
	});
}

function updateUI(questionData){
	console.log(questionData);
	if(questionData!=null){
		 //quiz = questionData;
		 $('#create_quiz_title').val(questionData.title);
		 $('#create_quiz_type').val(questionData.type);
		 $('#quiz_id').val(questionData.id);
		 questionCount = questionData.questions.length;
		 
		 var questionContent = "";
		 
		 if(questionCount>0){
			 questionData.questions.forEach(function(question) {
				 var qId = question.questionId;
				 questionContent += '<div id="created_question_container_' + qId + '" >';
				 questionContent += '<form id="created_question_form_'+ qId + '" onsubmit="return false;" >';
				 questionContent += '<input type="hidden" name="question_id_' + qId + '" id="question_id_'+ qId +'" value="'+qId+'">';
				 questionContent += '<input type="hidden" name="question_type_' + qId + '" id="question_type_'+ qId +'" value="'+question.type+'">';
				 questionContent += '<fieldset>';
				 questionContent += '<legend>Question Title</legend>';
				 questionContent +=  '<div class="uk-form-row"> <textarea rows="5" cols="10" id="question_title_'+ qId +'" name="question_title_'+ qId +'">'+ question.title +'</textarea> </div>';
				 questionContent +=  '<div id="check_box_question_set_'+ qId +'">';
				 questionContent +=  '<legend>Answers</legend>';
				
				 question.answers.forEach(function(answer) {
					 questionContent += '<div class="uk-form-row">';
					 if(question.type=='single'){
						 questionContent +=	'<input type="radio" id="chk_answer_correct_'+ answer.id +'" name="chk_answer_correct_'+ answer.id +'"';
					 }else{
						 questionContent +=	'<input type="checkbox" id="chk_answer_correct_'+ answer.id +'" name="chk_answer_correct_'+ answer.id +'"';
					 }
					 
					 if(answer.correct){
						 questionContent += ' checked';
					 }
					 
					 questionContent += '>';
					 questionContent +=	'<textarea rows="1" cols="75" id="chk_answer_text_'+ answer.id +'" name="chk_answer_text_'+ answer.id +'" class="uk-form-width-large">'+answer.title+'</textarea>';
					 questionContent += '</div>';
				 });
				
				 
				    console.log(question);
				    
				 questionContent += '<div class="uk-form-row">';
				 questionContent += '<button id="edit_question_' + qId + '" class="uk-button"> Edit </button>' ;
				 questionContent += '<button id="delete_question_' + qId + '" class="uk-button"> Delete </button>' ;
				 questionContent += '</div>';
				    
				 questionContent +=  '</div>';
				 questionContent += '</fieldset>';
				 questionContent += '</form>';
				 questionContent += '</div>';
			 });
			 
			 
		 }
		 
		 $('#question_details_content').html(questionContent);
		 
		 
	}
	
}

function loadCreatedQuestions(questionData){
	console.log(questionData); // log
}






