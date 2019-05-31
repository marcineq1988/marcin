<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <title>Menu poziome</title>


    <style type="text/css">
        ul {
            float: left;
            width: 100%;
            padding: 0;
            margin: 0;
            list-style: none;
        }

        li a {
            display: block;
            float: left;
            text-align: center;
            font-size: 1.2em;
            width: 250px;
            text-decoration: none;
            color: aqua;
            background-color: blue;
            padding: 10px 15px;
            margin: 0px 1px 1px 0px;
            border: 1px solid navy;
            border-radius: 3px;
            -moz-border-radius: 5px;
            -webkit-border-radius: 5px;
            box-shadow: 0px 2px 3px gray;
            -moz-box-shadow: 0px 2px 3px gray;
            -webkit-box-shadow: 0px 2px 3px gray;
        }

        li a:hover {
            color: blue;
            background: aqua;
            border: 1px solid blue;
        }
    </style>


</head>


<body onload='document.loginForm.username.focus();'>

<section>
    <nav>
        <ul>
            <li><a href="/">Strona glowna</a></li>
            <li><a href="#">Kontakt</a></li>
            <li><a href="/login">Logowanie</a></li>
            <li><a href="/userAccount">Konto uzytkownika</a></li>
        </ul>
    </nav>
</section>



<c:if test="${not empty errorMessge}"><div style="color:red; font-weight: bold; margin: 30px 0px;">${errorMessge}</div></c:if>

<form name='login' action="/login" method='POST'>
    <table>
        <tr>
            <td>UserName:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>