<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<jsp:include page="fragments/header.jsp"/>
<head>
    <title>Catalog | Hotel</title>
</head>

<body>


<fmt:setLocale value="${sessionScope.language}"/>
<fmt:setBundle basename="localization.language" var="loc"/>
<fmt:setBundle basename="information" var="info"/>

<div class="container">

    <c:forEach var="apartment" items="${apartments}">
        <div class="my-lg-4">
            <div class="col-6"></div>
            <div class="card text-center">
                <div class="card-header">
                    <h5><c:out value="${apartment.status}"/>
                        <c:if test="${sessionScope.role.name == 'admin'}">
                            <a href="${pageContext.request.contextPath}/hotel?command=changeApartmentStatus&apartmentId=${apartment.id}">
                                <fmt:message bundle="${loc}" key="language.edit"/>
                            </a>
                        </c:if>
                    </h5>
                </div>
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-4">
                            <h5><c:out value="${apartment.type}"/></h5>
                            <c:if test="${sessionScope.user!=null }">
                                <div class="row justify-content-center">
                                    <p><input type="button"  class="btn btn-primary" value="<fmt:message bundle="${loc}"
                                                                               key="language.arrange"/>"
                                              onClick='location.href="${pageContext.request.contextPath}/hotel?command=addUserOrder&apartment_id=${apartment.id}"'></p>

                                </div>
                            </c:if>
                        </div>
                        <div class="col-md-8">
                            <p><fmt:message bundle="${loc}" key="language.description"/></p>
                            <p><fmt:message bundle="${loc}" key="language.apartmentNumber"/><c:out value=" "/><c:out value="${apartment.apartmentNumber}"/></p>
                            <p><fmt:message bundle="${loc}" key="language.numberOfRooms"/><c:out value=" "/><c:out value="${apartment.numberOfRooms}"/></p>
                            <p><fmt:message bundle="${loc}" key="language.numberOfBeds"/><c:out value=" "/><c:out value="${apartment.numberOfBeds}"/></p>
                            <p><fmt:message bundle="${loc}" key="language.price"/><c:out value=" "/><c:out value="${apartment.price} "/><fmt:message bundle="${info}" key="information.price"/></p>
                            <div class="container">
                                <div class="row">

                                    <div class="col-sm text-right">
                                        <c:set scope="request" var="priceFlag" value="0"/>

                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>


</div>

</body>
<jsp:include page="fragments/footer.jsp"/>
</html>