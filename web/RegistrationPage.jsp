<%-- 
    Document   : RegistrationPage
    Created on : 17-Mar-2022, 2:46:42 pm
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
        
        <form action="Register" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td> Enter User Name </td>
                        <td> <input type="text" id="u1" name="uname" value="" size="20" />  </td>
                    </tr>
                    <tr>
                        <td>Enter Password </td>
                        <td> <input type="password" name="pswd" value="" size="20" />  </td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Click here to Register" />
        </form>
        
        

    </body>
</html>
