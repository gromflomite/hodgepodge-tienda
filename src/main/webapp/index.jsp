<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>Products</h1>

<ol>
	<c:forEach items="${productos}" var="p">
		<li>${p}</li>
	</c:forEach>
</ol>