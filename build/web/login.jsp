<%-- 
    Document   : login.jsp
    Created on : 28-Mar-2022, 12:41:04 pm
    Author     : raj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST">
            <table border="1">
               
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td> <input type="text" name="uname" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td> <input type="password" name="pswd" value="" size="20" /> </td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Login" />

        </form>
        
        
    </body>
</html>
