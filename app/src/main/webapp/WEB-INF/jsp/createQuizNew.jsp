<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" /><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>



<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Create Quiz</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/uikit/uikit.css">
<!-- <script
	src="${pageContext.request.contextPath}/resources/jquery/jquery.js"></script> -->

	

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/jquery/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/jquery/jquery.mousewheel-3.0.6.pack.js"></script>
<script src="${pageContext.request.contextPath}/resources/uikit/uikit.js"></script> 
<script src="${pageContext.request.contextPath}/resources/uikit/sticky.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/fancybox/jquery.fancybox.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fancybox/jquery.fancybox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fancybox/helpers/jquery.fancybox-buttons.css" />
<script type="text/javascript" 	src="${pageContext.request.contextPath}/resources/fancybox/helpers/jquery.fancybox-buttons.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fancybox/helpers/jquery.fancybox-thumbs.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/fancybox/helpers/jquery.fancybox-thumbs.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/fancybox/helpers/jquery.fancybox-media.js"></script>
<script src="${pageContext.request.contextPath}/resources/uikit/uikit.js"></script> 
<script src="${pageContext.request.contextPath}/resources/uikit/sticky.js"></script> 
<script src="${pageContext.request.contextPath}/resources/js/quiz.js"></script> 
<script src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js"></script>

<!-- 
<script type="text/javascript">
    CKEDITOR.replace('question_title');
</script>
 -->
 
 
 <script type="text/javascript">
	function createtext()
	{
		console.log("Inside createtext");
		var i=0;
		var len1=document.getElementById('s');
		var len2=len1.value;
		console.log(len2);
		for(i;i<len2;i++)
		{
			console.log(i);

			var el= new Array();;
			el[i]=document.createElement('input');
			el[i].type='text';
			el[i].name='text'+i;
			el[i].size = 10;
			console.log("after 10");

			document.f1.appendChild(el[i]);
			var mybr=document.createElement('BR');
			document.f1.appendChild(mybr);
		
		}
	}
</script>

<style type="text/css">
		.fancybox-custom .fancybox-skin {
			box-shadow: 0 0 50px #222;
		}
</style>


<style>


body {
		font-family:arial,helvetica,sans-serif;
		font-size:12px;
	}
	#wrapper {
		width:900px;
		margin:0px auto;
		border:1px solid #bbb;
		padding:10px;
	}
	#header {
		border:1px solid #bbb;
		height:80px;
		padding:10px;
	}
	#content {
		margin-top:10px;
		padding-bottom:10px;
	}
	#content div {
		padding:10px;
		border:1px solid #bbb;
		float:left;
	}
	#content-left {
		width:180px;
		height:300px;
	}
	#content-main {
		margin-left:10px;
		width:666px;
		height:150px;
	}
	#content-box1, #content-box2, #content-box3 {
		padding:10px;
		border:1px solid #bbb;
		position:absolute;
		margin-top:190px;
		height:120px;
	}
	
	#content-box1 {
		margin-left:212px;
		width:200px;
	}
	#content-box2 {
		margin-left:444px;
		width:200px;
	}
	#content-box3 {
		margin-left:676px;
		width:202px;
	}
	#footer {
		float:left;
		margin-top:10px;
		margin-bottom:10px;
		padding:10px;
		border:1px solid #bbb;
		width:878px;
	}
	#bottom {
		clear:both;
		text-align:right;
	}



#check_box_question_form {
	width: 600px;
	margin-top: 25px;
}

#check_box_question_form input[type=text], #check_box_question_form textarea {
	padding: 5px;
	width: 471px;
	font-family: Helvetica, sans-serif;
	font-size: 1.4em;
	margin: 0px 0px 10px 0px;
	border: 2px solid #ccc;
}

#check_box_question_form textarea {
	height: 90px;
}

#check_box_question_form textarea:focus, #check_box_question_form input:focus {
	border: 2px solid #900;
}

#check_box_question_form input.submit-button {
	width: 100px;
	float: right;
}



#check_box_question_form_cb {
	width: 600px;
	margin-top: 25px;
}

#check_box_question_form_cb input[type=text], #check_box_question_form_cb textarea {
	padding: 5px;
	width: 471px;
	font-family: Helvetica, sans-serif;
	font-size: 1.4em;
	margin: 0px 0px 10px 0px;
	border: 2px solid #ccc;
}

#check_box_question_form_cb textarea {
	height: 90px;
}

#check_box_question_form_cb textarea:focus, #check_box_question_form_cb input:focus {
	border: 2px solid #900;
}

#check_box_question_form_cb input.submit-button {
	width: 100px;
	float: right;
}



</style>


</head>
<body>

<div id="wrapper">
	<div id="header">Header</div>
	<div id="content-box1"><p>Box 1</p></div>
	<div id="content-box2"><p>Box 2</p></div>
	<div id="content-box3"><p>Box 3</p></div>
	<div id="content">
	
	
		<div id="content-left">
			<ul class="question_types">
				<li class="odd"><a id="add_chk_box_question" title="Add Question" href="#check_box_question_form">MCQ Check Box</a></li>
				<li class="odd"><a id="add_chk_box_question_cb" title="Add Question" href="#check_box_question_form_cb">MCQ Radio Button</a></li>
			</ul> 
		</div>
		
		
		<div id="content-main">
		<table class="questionTable" id="questionTableId" cellpadding="0"	cellspacing="0" style="width: 100%;" border="0"></table>
		</div>
	</div>
	<div id="footer">
		<form action="" method="get" name="f1">
			<input type="text" id="s" name="s" value="" onChange="createtext()" >
		</form>
	</div>
	<div id="bottom"></div>
</div>




<!--  Question forms -->
	<div style="display: none">
		<form id="check_box_question_form" onsubmit="return false;" >
		
				<fieldset>
			        <legend>Question Title</legend>
			        <!--  <textarea class="ckeditor" id="question_title" name="question_title" rows="5" cols="15"></textarea>-->
			      	<input type="text" id="question_title" name="question_title" /> 
			        
			        <div id="check_box_question_set">
				       		<legend>Answers</legend>
					        	<input type="checkbox" id="chk_answer_correct_1" name="chk_answer_correct_1"> 
								<input type="text" id="chk_answer_text_1" name="chk_answer_text_1" />
								<br>
					        	<input type="checkbox" id="chk_answer_correct_2" name="chk_answer_correct_2"> 
								<input type="text" id="chk_answer_text_2" name="chk_answer_text_2" />
								<br>
					        	<input type="checkbox" id="chk_answer_correct_3" name="chk_answer_correct_3"> 
								<input type="text" id="chk_answer_text_3" name="chk_answer_text_3" />
								<br>
					        	<input type="checkbox" id="chk_answer_correct_4" name="chk_answer_correct_4"> 
								<input type="text" id="chk_answer_text_4" name="chk_answer_text_4" />
								<br>
					 </div>
					 <div>
			        	<button id="add_more_check_box_question"> Add </button> 
			        	<button id="save_check_box_question"> Save </button> 
					</div>
					
			    </fieldset>
		</form>
		
		
	</div>
	
	
	
	
<!--  Question forms -->
	<div style="display: none">
		<form id="check_box_question_form_cb" onsubmit="return false;" >
		
				<fieldset>
			        <legend>Question Title</legend>
			        <!--  <textarea class="ckeditor" id="question_title" name="question_title" rows="5" cols="15"></textarea>-->
			      	<input type="text" id="question_title" name="question_title" /> 
			        
			        <div id="check_box_question_set">
				       		<legend>Answers</legend>
					        	<input type="radio" id="chk_answer_correct_1" name="chk_answer_correct_1"> 
								<input type="text" id="chk_answer_text_1" name="chk_answer_text_1" />
								<br>
					        	<input type="radio" id="chk_answer_correct_2" name="chk_answer_correct_2"> 
								<input type="text" id="chk_answer_text_2" name="chk_answer_text_2" />
								<br>
					        	<input type="radio" id="chk_answer_correct_3" name="chk_answer_correct_3"> 
								<input type="text" id="chk_answer_text_3" name="chk_answer_text_3" />
								<br>
					        	<input type="radio" id="chk_answer_correct_4" name="chk_answer_correct_4"> 
								<input type="text" id="chk_answer_text_4" name="chk_answer_text_4" />
								<br>
					 </div>
					 <div>
			        	<button id="add_more_check_box_question"> Add </button> 
			        	<button id="save_check_box_question"> Save </button> 
					</div>
					
			    </fieldset>
		</form>
		
		
	</div>
	

	
		
</body>
</html>