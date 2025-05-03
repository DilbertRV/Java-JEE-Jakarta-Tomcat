<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Webapp-00</title>
</head>
<body>
<h2>Bienvenid@as al ejemplo de JSTL</h2>
<p><a href="${pageContext.request.contextPath}/index.jsp">Inicio</a> </p>
<p>The data from servlet:<jsp:useBean id="data" scope="request" type="java.lang.String"/>
  <c:out value="${data}"/> </p>
<jsp:useBean id="bool" scope="request" type="java.lang.Boolean"/>
<c:if test="${bool}">
<p>The Value id: <c:out value="true"/><p>
  </c:if>
  <jsp:useBean id="list" scope="request" type="java.util.List"/>
<h3>Listado de Elementos: ${fn:length(list)}</h3>
<ul>
  <c:forEach items="${list}" var="element">
    <li>${element}</li>
  </c:forEach>
</ul>
<h2>Referencia</h2>
<a href="https://www.javatpoint.com/jstl">Ejemplos de uso de JSTL</a>
</body>
</html>