<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

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
        table {
            border: 1px solid black
        }
    </style>

    <script type="text/javascript"
            src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

    <script type="text/javascript">
        function crunchifyAjax() {
            $.ajax({
                url : 'ajaxtest.html',
                success : function(data) {
                    $('#result').html(data);
                }
            });
        }

        function alertFunction() {
            $.ajax({
                url : 'ajaxtest.html',
                success : function(data) {
                    alert("O kurde, dziala! - losowy tekst:" + data)
                }
            });
        }
    </script>

    <script type="text/javascript">
        var intervalId = 0;
        intervalId = setInterval(crunchifyAjax, 1000);
    </script>


</head>

<body>
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
</body>

    Strona glowna

<br>
<br>
<h1>Lista zarejestrowanych uzytkownikow:</h1>
<table>
    <tr>
        <td>Lp.</td>
        <td>Imie</td>
        <td>Nazwisko</td>
        <td>Login</td>
        <td>Haslo</td>
    </tr>

    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.login}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>

Losowo generowany int:


<button type="button" onclick="alertFunction()">Click Me!</button>

<h3 id="testowy">Jakis tekst... </h3>

<form id="sampleForm" method="post" action="/profile">


    <div>
        <input type="text" name="firstname" id="firstname">
    </div>

    <div>
        <input type="text" name="lastname" id="lastname">
    </div>

    <div>
        <button type="submit" name="submit">Submit</button>
    </div>


</form>




<div align="center">
    <br> <br> ${message} <br> <br>
    <div id="result"></div>
    <br>
</div>




</html>