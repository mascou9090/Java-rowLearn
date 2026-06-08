package main;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Project {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-06-08");
		LocalDateTime d05 = LocalDateTime.parse("2022-06-08T01:10:11");
		Instant d06 = Instant.parse("2022-06-08T02:20:22Z");
		Instant d07 = Instant.parse("2022-06-08T02:20:22-03:00");
		LocalDate d08 = LocalDate.parse("08/06/2026", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("08/06/2026 06:45", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println("d1 = " + d01);
		System.out.println("d2 = " + d02);
		System.out.println("d3 = " + d03);
		System.out.println("d4 = " + d04);
		System.out.println("d5 = " + d05);
		System.out.println("d6 = " + d06);
		System.out.println("d7 = " + d07);
		System.out.println("d8 = " + d08);
		System.out.println("d9 = " + d09);
	}
}