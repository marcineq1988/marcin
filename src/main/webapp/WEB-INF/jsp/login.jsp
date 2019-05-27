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
    </style>


</head>

<body>
<section>
    <nav>
        <ul>
            <li><a href="/">Strona glowna</a></li>
            <li><a href="#">Kontakt</a></li>
            <li><a href="/login">Logowanie</a></li>
            <li><a href="/userAccount">Konto uzytkownika</a></li>
    </nav>
</section>
</body>

    Zaloguj sie

<form method="POST" action="/userAccount">
    <h2 class="form-heading">Logowanie uzytkownika</h2>

    <div>
        <input name="login" type="text" placeholder="Login" autofocus="true"/>
        <input name="password" type="password" placeholder="Haslo"/>

        <button type="submit">Zaloguj sie</button>
    </div>

    <div style="color: #FF0000">${loginMessage}</div>

</form>

</html>