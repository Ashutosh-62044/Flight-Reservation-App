package com.Flight_Resevation_App.utilities;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.Flight_Resevation_App.entity.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFgenerator {

	public void generateItinerary(Reservation reservation, String filePath) {

		Document document = new Document();

		try {

			PdfWriter.getInstance(document, new FileOutputStream(new File(filePath)));

			// open
			document.open();

			Paragraph p = new Paragraph();
			p.add("Ticket");
			p.setAlignment(Element.ALIGN_CENTER);

			document.add(p);

			Font f = new Font();
			f.setStyle(Font.BOLD);
			f.setSize(8);

			document.add(new Paragraph("Ticket Details ", f));

			PdfPTable table = new PdfPTable(2);
			PdfPCell Cell;
			Cell = new PdfPCell(new Phrase("Flight Itineray"));
			Cell.setColspan(2);
			table.addCell(Cell);

			Cell = new PdfPCell(new Phrase("Flight Details"));
			Cell.setColspan(2);
			table.addCell(Cell);

			table.addCell("Departure City");
			table.addCell(reservation.getFlight().getDepartureCity());

			table.addCell("Arrival City");
			table.addCell(reservation.getFlight().getArrivalCity());

			table.addCell("Flight Number");
			table.addCell(reservation.getFlight().getFlightNumber());

			table.addCell("Operating Airlines");
			table.addCell(reservation.getFlight().getOperatingAirlines());

			table.addCell("Departure Date");
			table.addCell(reservation.getFlight().getDateOfDeparture().toString());

			table.addCell("Departure time");
			table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());

			Cell = new PdfPCell(new Phrase("Passenger Details"));
			Cell.setColspan(2);
			table.addCell(Cell);

			table.addCell("First Name");
			table.addCell(reservation.getPassenger().getFirstName());
			
			table.addCell("Middle Name");
			table.addCell(reservation.getPassenger().getMiddleName());
			
			table.addCell("Last Name");
			table.addCell(reservation.getPassenger().getLastName());
			
			table.addCell("Email");
			table.addCell(reservation.getPassenger().getEmail());
			
			table.addCell("Phone No:");
			table.addCell(reservation.getPassenger().getPhone());
			
			document.add(table);
			// close
			document.close();

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
