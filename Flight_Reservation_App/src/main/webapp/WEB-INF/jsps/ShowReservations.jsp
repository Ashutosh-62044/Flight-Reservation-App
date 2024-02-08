<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details.</title>
</head>
<body>
	<h2>Flight details.</h2>

	Flight Number : ${flight.flightNumber}
	<br> Operating Airlines : ${flight.operatingAirlines}
	<br> Departure CITY : ${flight.departureCity}
	<br> Arrival City : ${flight.arrivalCity}
	<br> Departure Date: ${flight.dateOfDeparture }
	<br>

	<h1>Enter Passenger Details.</h1>
	
	<fieldset>
    <form action="confirmReservation" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br><br>

        <label for="middleName">Middle Name:</label>
        <input type="text" id="middleName" name="middleName"><br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br><br>
       
        <input type="hidden" name="flightId" value="1">
        
        <h2>Enter Card detail.</h2>
        
        <label for="cardName">Name of the Card:</label>
        <input type="text" id="cardName" name="cardName" required><br><br>

        <label for="cardNumber">Card Number:</label>
        <input type="text" id="cardNumber" name="cardNumber" required><br><br>
        <label for="cvv">CVV (Card Verification Value):</label>
        <input type="text" id="cvv" name="cvv" required><br><br>

        <label for="expiryDate">Expiry Date:</label>
        <input type="text" id="expiryDate" name="expiryDate" placeholder="MM/YYYY" required><br><br>
        
        <input type="submit" value="Submit">
      </form>
   </fieldset>

</body>
</html>






		
