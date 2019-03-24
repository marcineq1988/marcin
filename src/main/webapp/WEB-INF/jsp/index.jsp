<html>
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/webapp/css/main.css" />

    <link type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" />

</head>
<body>

<header style="border: #0000FF 1px solid">
    <ul style="list-style: none">
        <li style="display:inline; background-color: beige"> <a href="/">Strona glowna</a></li>
        <li style="display:inline; background-color: blanchedalmond"> Cos innego</li>
        <li style="display:inline; background-color: beige"> Cos jeszcze innego</li>
        <li style="display:inline; background-color: blanchedalmond"> Kontakt</li>
        <%--<li style="display:inline; background-color: blanchedalmond"> <a href="toLoginPage">Logowanie</a>/<a href="toRegisterPage">Rejestracja</a></li>--%>
        <li style="display:inline; background-color: blanchedalmond"> <a href="toUserAccount">Konto uzytkownika ${login}</a></li>
    </ul>
</header>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Start</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">Strona glowna</a></li>
                <li><a href="#about">O mnie</a></li>

                <a href="supplier-productsGroupsInGroup-list-view.ucm?groupId=${name}"> ${name} </a>
                <a href="productsGroup-edit.ucm?id=<c:out value="${name}"/>"> </a>
            </ul>
        </div>
    </div>
</nav>

<div class="container">

    <div>
        <h1>Ekran startowy PIK</h1>
        <h2>Moje imie to: ${name}</h2>

    </div>

</div>

<div id ="listing">

    <ul>
        <c:forEach items="${names}" var="one_name">
            <li style="border: #0000FF 1px solid; list-style: none">${one_name}</> <div> ddd</div>
        </c:forEach>
    </ul>


</div>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>