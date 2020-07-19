<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${SPRING_SECURITY_LAST_EXCEPTION.message}


<form action="login" method="post">

USERNAME:<input type="text" name="username"><br>
PASSWORD:<input type="text" name="password"><br>
<input type="submit" value="submit">
</form>

</body>
</html>