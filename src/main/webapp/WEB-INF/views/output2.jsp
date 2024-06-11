<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
 
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Email sent </title>

 <link rel="stylesheet" type="text/css" href="/Mail_sender/UrlToReachResourcesFolder/css/tq.css"> 
<style>
body {
	background-image: url('/Mail_sender/UrlToReachResourcesFolder/Images/tq.png');
	background-repeat: no-repeat;
	 background-size: cover;  
	/* background-color: rgb(210,18,213); */
	height:100vh;
	
}
</style>
</head>
<body>
	<h1 id="idd">Thanks for Using ${res} </h1>
	<%-- Display the alert using JavaScript if the flag is set --%>
	
		<script>
			alert("Source code sent your Email...");
		</script>
	
</body>
</html>