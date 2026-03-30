<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Calculadora de Promedio</title>
</head>
<body>
<h2>Ingrese 3 calificaciones</h2>

<form action="PromedioServlet" method="post">
    Nota 1: <input type="text" name="c1"><br><br>
    Nota 2: <input type="text" name="c2"><br><br>
    Nota 3: <input type="text" name="c3"><br><br>

    <input type="submit" value="Calcular">
</form>
</body>
</html>