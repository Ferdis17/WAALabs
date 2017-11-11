<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<title>Starbuck's</title>
</head>
<body>

<p/>
<c:choose >
	<c:when test = "${user eq null}">
	You need to login to ask for ADVICE	
		<form action= "login" method= "get">
			<input type ="submit" value="Login">
		</form>
	</c:when>
	<c:otherwise>
		<h2>Hello ${user.name}</h2>
		<h2>Ask for advice about your favorite roast:</h2>
		<form action = "advice.do" method="post">
			<select name="roast"   >
		
			  		<c:forEach var="roast" items="${roasts}">
			    		<option value="${roast.key}" > ${roast.value}</option>
					</c:forEach>
		
			</select>
		
			<p><input type="submit" value = "Submit"/></p>
		</form>
	</c:otherwise>

</c:choose>

  
 </body>
</html>