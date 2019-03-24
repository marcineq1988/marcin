<html>
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webapp/css/main.css" />

    <link type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" />

</head>
<body>


<style>
    aside {
        margin-left: 20%;
        float: left;
        border: 1px solid black;
        height: 100%;
    }
    .container   {
        height: 100%;
        width: 50%;
        background-color: grey;
        float: left;
    }
</style>

<header style="border: #0000FF 1px solid">
    <ul style="list-style: none">
        <li style="display:inline; background-color: beige"> <a href="/">Strona glowna</a></li>
        <li style="display:inline; background-color: blanchedalmond"> Cos innego</li>
        <li style="display:inline; background-color: beige"> Cos jeszcze innego</li>
        <li style="display:inline; background-color: blanchedalmond"> Kontakt</li>
        <li style="display:inline; background-color: blanchedalmond"> <a href="toLoginPage">Logowanie/rejestracja</a></li>
        <li style="display:inline; background-color: blanchedalmond"> <a href="toLoginPage">Konto uzytkownika ${login}</a></li>
    </ul>
</header>

<aside>
    Tu bedzie menu
</aside>
<section class="container">

        <c:if test="${registrationSuccess==true}">
            <h1> Rejestracja zakonczona powodzeniem!</h1>

        </c:if>


    <h2>${login}, zalogowales sie - tu bedzie zawartosc konta uzytkownika!</h2>

        <form:form id="userDataForm" modelAttribute="user" action="editUserData" method="post">
        <table>
            <tr>
                <td><form:label path="login">Login:</form:label></td>
                <td><form:input path="login"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Haslo:</form:label></td>
                <td><form:password path="password"/></td>
            </tr>
            <tr>
                <td><form:label path="name">Imie:</form:label></td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="surname">Nazwisko:</form:label></td>
                <td><form:input path="surname"/></td>
            </tr>
            <tr>
                <td><form:label path="city">Miasto:</form:label></td>
                <td><form:input path="city"/></td>
            </tr>
            <tr>
                <td><form:label path="postCode">Kod pocztowy:</form:label></td>
                <td><form:input path="postCode"/></td>
            </tr>
            <tr>
                <td><form:label path="street">Ulica:</form:label></td>
                <td><form:input path="street"/></td>
            </tr>
            <tr>
                <td><form:label path="houseNumber">Nr domu:</form:label></td>
                <td><form:input path="houseNumber"/></td>
            </tr>
            <tr>
                <td><form:label path="flatNumber">Nr mieszkania:</form:label></td>
                <td><form:input path="flatNumber"/></td>
            </tr>
            <tr>
                <td><form:label path="phoneNumber">Nr telefonu:</form:label></td>
                <td><form:input path="phoneNumber"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Zapisz dane"/></td>
            </tr>
        </table>
        </form:form>


<%--
    ${user.name}, zalogowales sie!

    <div>Dane uzytkownika:</div>

        <form:form method="POST"
                   action="/editUser" modelAttribute="user">
            <table>
                <tr>
                    <td><form:label path = "login">Login</form:label></td>
                    <td><form:input path = "login" /></td>
                </tr>
                <tr>
                    <td><form:label path = "password">Haslo</form:label></td>
                    <td><form:input path = "password" /></td>
                </tr>
                <tr>
                    <td><form:label path = "name">Imie</form:label></td>
                    <td><form:input path = "name" /></td>
                </tr>
                <tr>
                    <td><form:label path = "surname">Nazwisko</form:label></td>
                    <td><form:input path = "surname" /></td>
                </tr>
                <tr>
                    <td><form:label path = "city">Miejscowosc</form:label></td>
                    <td><form:input path = "city" /></td>
                </tr>
                <tr>
                    <td><form:label path = "postCode">Kod pocztowy</form:label></td>
                    <td><form:input path = "postCode" /></td>
                </tr>
                <tr>
                    <td><form:label path = "street">Ulica</form:label></td>
                    <td><form:input path = "street" /></td>
                </tr>
                <tr>
                    <td><form:label path = "houseNumber">Nr domu</form:label></td>
                    <td><form:input path = "houseNumber" /></td>
                </tr>
                <tr>
                    <td><form:label path = "flatNumber">Nr mieszkania</form:label></td>
                    <td><form:input path = "flatNumber" /></td>
                </tr>
                <tr>
                    <td><form:label path = "phoneNumber">Telefon</form:label></td>
                    <td><form:input path = "phoneNumber" /></td>
                </tr>

                <tr>
                    <td colspan = "2">
                        <input type = "submit" value = "Zapisz"/>
                    </td>
                </tr>
            </table>
        </form:form>

</section>--%>

</body>

</html>