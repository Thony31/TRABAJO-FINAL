<%-- 
    Document   : formulario
    Created on : 21 abr. 2024, 11:42:40
    Author     : GEAN
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Procesando Consulta - Minimarket</title>
</head>
<body>
    <h1>¡Gracias por enviar tu consulta!</h1>
    <%-- Obtener los parámetros de la consulta --%>
    <% String nombre = request.getParameter("nombre"); %>
    <% String email = request.getParameter("email"); %>
    <% String telefono = request.getParameter("telefono"); %>
    <% String producto = request.getParameter("producto"); %>
    <% String mensaje = request.getParameter("mensaje"); %>
    
    <p><strong>Nombre:</strong> <%= nombre %></p>
    <p><strong>Email:</strong> <%= email %></p>
    <p><strong>Teléfono:</strong> <%= telefono %></p>
    <p><strong>Producto de Interés:</strong> <%= obtenerNombreProducto(producto) %></p>
    <p><strong>Mensaje:</strong> <%= mensaje %></p>
    
    <%-- Método para obtener el nombre del producto basado en el valor del select --%>
    <%!
        public String obtenerNombreProducto(String valor) {
            switch (valor) {
                case "1":
                    return "Alimentos";
                case "2":
                    return "Bebidas";
                case "3":
                    return "Productos de Limpieza";
                case "4":
                    return "Artículos de Cuidado Personal";
                case "5":
                    return "Otros";
                default:
                    return "Desconocido";
            }
        }
    %>
</body>
</html>




