<%-- 
    Document   : index
    Created on : 3/11/2020, 01:05:16 PM
    Author     : diegonarvaez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="js/functions.js"></script>
        <title>Calculadora</title>
    </head>
    <body>
    <center> <h1>JSP´s y Servlets</h1></center>
         <center>
    <img src="imagenes/diego.jpeg">

    <p>Alumno: Narváez Barete Diego</p>

    <fieldset style="border:2px solid green; width:400px">
        <legend> Datos </legend>
        <form name='formulario' action="prueba_logica" method="post">
   
                <table border="1" width="100%">
                    <tr>
                        <td width="30%">
                            <input type="text" name="valor1" placeholder="ingresa Valor 1" id="primero" required="true" pattern="[0-9]{1,4}" title="Formato incorrecto solo 4 dígitos">

                        </td>
                       
                    </tr>

                    <tr>
                        <td width="30%">
                            <input type="text" name="valor2" placeholder="ingresa Valor 1" id="segundo" required="true" pattern="[0-9]{1,4}" title="Formato incorrecto solo 4 dígitos">

                        </td>
                       
                    </tr>

                    <tr>
                        <td width="30%">
                            Operación:                         
                        </td>
                        <td>
                            <select name="operacion">
                                <option value="suma">+</option>
                                <option value="resta">-</option>
                                <option value="division">/</option>
                                <option value="multiplicacion">*</option>

                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td width="30%">
                            <input type="submit" value="aceptar" name="btnAceptar">

                        </td>
                        <td>
                            <input type="reset" value="Nuevo" name="btnLimpiar" onclick="reset()">
                        </td>
                    </tr>
                </table>
            </center>
        </form>

    </fieldset>
</body>
</html>
