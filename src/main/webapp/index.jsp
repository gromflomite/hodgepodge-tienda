<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<!-- Own CSS -->
<link rel="stylesheet" href="css/style.css">

<title>Tienda</title>

</head>

<body>

	<main class="container">
		<h1>Manufacturers and products</h1>

		<form action="home" method="get">
			<input type="text" name="productName" placeholder="Nombre del producto">
			<br>
			<input type="number" name="minPrice" placeholder="Precio mínimo">
			<br>
			<input type="number" name="maxPrice" placeholder="Precio máximo">
			<br>
			<input type="number" name="manufId" placeholder="ID del fabricante">
			<br>
			<input type="submit" value="Buscar">
		</form>

		<ol>
			<c:forEach items="${productos}" var="p">
				<li>${p}</li>
			</c:forEach>
		</ol>

	</main>

</body>
</html>