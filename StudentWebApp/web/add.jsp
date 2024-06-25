.<%-- 
    Document   : add
    Created on : 24 May 2024, 10:09:04 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Page</title>
    </head>
    <body>
        <h1>Add</h1>
        <p>
            Please enter the details below:
        </p>
        <form action="AddServlet.do" method="POST" enctype="multipart/form-data">

            <table id="aa">
                <tbody>
                    <tr>
                        <td>Student Number:</td>
                        <td><input type="text" name="studno"/></td>
                    </tr>
                    <tr>
                        <td>Image:</td>
                        <td><input type="file" name="image"/></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name"/></td>
                    </tr>
                    <tr>
                        <td>Surname:</td>
                        <td><input type="text" name="surname"/></td>
                    </tr>
                    <tr>
                        <td>Age:</td>
                        <td><input type="text" name="age"/></td>
                    </tr>
                    <tr>
                        <td>Gender:</td>
                        <td>
                            <select name="gender">
                                <option value="F">Female</option>
                                <option value="M">Male</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Modules-List</td>
                        <td><button type="button" onclick="addNewSubject()">Add-Modules</button>
                          <div id="module-container"></div>
                          <td>  <script>
                    function addNewSubject() {
                        document.getElementById("module-container").insertAdjacentHTML('beforeend','<input type="text" name="module"/><br>');
                    }
                </script>
                    </td>      
                </tr>
                <td>
                    
                    <input type="submit" value="AddStudents" />
                </td>
                </tbody>
            </table>
        </form>

    </body>
</html>
