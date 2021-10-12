<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Autoras</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2 class="text-center">Cadastro de Autoras</h2>
		<form method="post" action="<c:url value="/cadastros"/>">
			<div class="form-group">
				<label>NOME</label>
				<input name="nome" class="form-control">
			</div>
			
			<div class="form-group">
				<label>EMAIL</label>
				<input name="email" class="form-control">
			</div>
			
			<div class="form-group">
				<label>CURRICULO</label>
				<input name="curriculo" class="form-control">
			</div>
			
			<div class="form-group">
				<label>DATA(dd/mm/yyyy)</label>
				<input name="data" class="form-control">
			</div>
			
						
			<input type="submit" value="Salvar" class="btn btn-primary mt-1">
		</form>
		
		<h2 class="text-center">Lista de Autoras</h2>
	
		<table class="table table-dark table-sm">
			<thead>
				<tr>
					<th>NOME</th>
					<th>EMAIL</th>
					<th>CURRICULO</th>
					<th>DATA</th>
					
			</thead>
			<tbody>
				<c:forEach var="autores" items="${cadastros}">
					<tr>
						<td>${autores.nome}</td>
						<td>${autores.email}</td>
						<td>${autores.curriculo}</td>
						<td>
						<fmt:parseDate value="${autores.data}" pattern="yyyy-MM-dd" var="formatada" type="date"/>
						<fmt:formatDate value="${formatada}" pattern="dd/MM/yyyy" type="date"/>
						</td>						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>