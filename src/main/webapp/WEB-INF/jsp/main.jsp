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

        function getCurrentHour() {
            $.ajax({
                url : 'currentHour.html',
                success : function(data) {
                    $('#currentHour').html(data);
                }
            });
        }
    </script>


    <script type="text/javascript">
        intervalId = setInterval(crunchifyAjax, 1000);
    </script>

    <script type="text/javascript">
        intervalId2 = setInterval(getCurrentHour, 1000);
    </script>

</head>

<body>
<section>
    <nav>
        <ul>
            <li><a href="/">Strona glowna</a></li>
            <li><a href="#">Kontakt</a></li>
            <li><a href="/log">Logowanie</a></li>
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

<button type="button" onclick="alertFunction()">Click Me!</button>

<h3 id="testowy">Jakis tekst... </h3>

    <div align="center">
        <div id="result"></div>
        <br>
    </div>

    <div align="center">
        <div id="currentHour">AKTUALNA GODZINA</div>
        <br>
    </div>

</html>