<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
  <h2>Reservation Details.</h2>
      Passenger Name: ${reservation.getPassenger().getFirstName()}</br>
       Passenger Email: ${reservation.getPassenger().getEmail()}</br>
        Passenger Phone Number: ${reservation.getPassenger().getPhone()}</br>
       
       Operating Airlines: ${reservation.getFlight().operatingAirlines}</br>
       Flight Number: ${reservation.getFlight().flightNumber}</br>
       Departure City: ${reservation.getFlight().departureCity}</br>
       Arrival City: ${reservation.getFlight().arrivalCity}</br>
       Date of departure: ${reservation.getFlight().dateOfDeparture}</br>
       
       <h2>Update Number of Bags and Status.</h2>
       <form action="checkinconfirm" method="post">
       <pre>
      Reservation Id:<input type="text" name="id" value="${reservation.id}"/>
        Number of Bags:<input type="text" name="numberOfBags"/>
          <input type="submit" name="Confirm"/>
       </pre>
       </form>
      
</body>
</html>