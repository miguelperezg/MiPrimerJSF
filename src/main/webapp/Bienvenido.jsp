<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  <H1>Bienvenido a mi primer strut</H1>
	
	String texto = (String) request.getAttribute("texto");
	String nombre = (String) request.getAttribute("nombre");
	out.println(texto);
	out.println(nombre);-->
	
<h1><bean:write name="BienvenidaForm" property="texto" /></h1>
<h1><bean:write name="BienvenidaForm" property="nombre" /></h1>
</body>
</html>