<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<script>
	function verify(){
	    
		var val1=document.getElementById("11").value;
		var val2=document.getElementById("22").value;
		var val3=document.getElementById("33").value;
		var val4=document.getElementById("44").value;
		
		if((val1.length==0)){
			if((val1.length==0)){
				if((val1.length==0)){
					if(((val1.length==0))){
						alert("Please Fill SignUp Page");
						return false;
					}
				}
			}
			
		}
		else{
			if((val1==val2)&&(val3==val4)){
				
			}
			else{
				alert("entering data doesn't match");
				return false;
			}
		}
	}
</script>
<style>

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn,.signupbtn {
    float: left;
    width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>



<form name="SignUp"  method="get" action="SignupServlet" onsubmit="return verify()">
  <div class="container">
    <label><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="11" required>
    
     <label><b>ReEmail</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="22"required>
    

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="33"required>

	 <label><b>RePassword</b></label>
    <input type="password" placeholder="Enter password" name="psw" id="44"required>
	
   
    <input type="checkbox" checked="checked"> Remember me
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>
