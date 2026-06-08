package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.Departament;
import entites.HourContract;
import entites.Worker;
import entites_enum.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.println("Date (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value for hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hour): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("$.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
