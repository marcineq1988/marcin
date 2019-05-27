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

    <h1>Konto uzytkownika</h1>

    <div style="color: green;">${loginMessage}</div>

    <form method="POST" action="/saveEditedUserData">
        <table>
            <tr>
                <td>Imie:</td><td><input name="name" type="text" value="${loggedUser.name}"/></td>
            </tr>
            <tr>
                <td>Nazwisko:</td><td><input name="surname" type="text" value="${loggedUser.surname}"/></td>
            </tr>
            <tr>
                <td>Login:</td><td><input name="login" type="text" value="${loggedUser.login}"/></td>
            </tr>
            <tr>
                <td>Haslo:</td><td><input name="password" type="text" value="${loggedUser.password}"/></td>
            </tr>
            <tr>
                <td>Miasto:</td><td><input name="city" type="text" value="${loggedUser.city}"/></td>
            </tr>
            <tr>
                <td>Kod:</td><td><input name="postCode" type="text" value="${loggedUser.postCode}"/></td>
            </tr>
            <tr>
                <td>Ulica:</td><td><input name="street" type="text" value="${loggedUser.street}"/></td>
            </tr>
            <tr>
                <td>Nr domu:</td><td><input name="houseNumber" type="text" value="${loggedUser.houseNumber}"/></td>
            </tr>
            <tr>
                <td>Nr mieszkania:</td><td><input name="flatNumber" type="text" value="${loggedUser.flatNumber}"/></td>
            </tr>
            <tr>
                <td>Telefon:</td><td><input name="phoneNumber" type="text" value="${loggedUser.phoneNumber}"/></td>
            </tr>
            <tr>
                <td><button type="submit">Zapisz edytowane dane</button></td>
            </tr>
        </table>
    </form>

</html>