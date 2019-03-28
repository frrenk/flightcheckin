<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Reservation Details</title>
</head>

<body>
<h2>Flight Details:</h2>

Airlines: ${reservation.flight.operatingAirlines}<br>
Flight Number: ${reservation.flight.flightNumber}<br>
Departure City: ${reservation.flight.departureCity}<br>
Arrival City: ${reservation.flight.arrivalCity}<br>
Date of Departure: ${reservation.flight.dateOfDeparture}<br>
Estimated Departure Time: ${reservation.flight.estimatedDepartureTime}<br>

<h2>Passenger Details:</h2>

First Name: ${reservation.passenger.firstName}<br>
Last Name: ${reservation.passenger.lastName}<br>
e-mail Address: ${reservation.passenger.email}<br>
Phone Number: ${reservation.passenger.phone}<br>

<form action="completeCheckIn" method="post">
    Enter the number of bags: <input type="text" name="numberOfBags"/>
    <input type="hidden" value="${reservation.id}" name="reservationId"/>
    <input type="submit" value="Check-In"/>
</form>
</body>
</html>