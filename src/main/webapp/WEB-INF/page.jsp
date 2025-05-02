<html>
<head>
    <title>Page</title>
</head>
<body>
    <h2>Page JSP</h2>
    <a href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
    <p>Data from Servlet:</p>
    <pre>
        ${data}
    </pre>
    <p>Number from Servlet:</p>
    <pre>
        ${number}
    </pre>
    <p>List from Servlet:</p>
    <p>Text:</p>
    <pre>
        ${text}
    </pre>
    </p>
</html>