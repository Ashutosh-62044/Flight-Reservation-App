<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Flight Search Results</title>
</head>
<body>
    <h2>Flight Search Results</h2>
    <h2>List of Flights</h2>
    <table border="1">
        <tr>
            <th>Airlines</th>
            <th>Departure city</th>
            <th>Arrival city</th>
            <th>Departure Time</th>
            <th>Select Flight</th>
        </tr>

        <c:forEach items="${flights}" var="flight">
            <tr>
                <td>${flight.operatingAirlines}</td>
                <td>${flight.departureCity}</td>
                <td>${flight.arrivalCity}</td>
                <td>${flight.estimatedDepartureTime}</td>
                <td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>