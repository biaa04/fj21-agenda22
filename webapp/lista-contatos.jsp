<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var = "contato" items="${dao.lista}">
<tr>
<td>
<a href="mvc?logica=REmoveContatoLogica&id=${contato.id }">Remover</a>
</td>
</tr>
</c:forEach>
</body>
</html>