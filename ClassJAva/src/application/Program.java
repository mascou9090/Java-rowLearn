package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entites.EmployeeWork;


public class Program {

	public static void main(String[] args) {

		List<EmployeeWork> Employee = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("HOW MANY EMPLOYEES WILL BE REGISTERED? ");
		int n = sc.nextInt();
		
		for (int i = 0; i< n; i++) {
			System.out.println();
			System.out.println("Employee #"+ (i+1) + ": ");
			System.out.println("Id: ");
			Integer idC = sc.nextInt();
			sc.nextLine();			
			
			System.out.println("Name: ");
			String name = sc.next();

			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			EmployeeWork emp = new EmployeeWork(idC, name, salary);
			Employee.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		Integer idSalary = sc.nextInt();
		Integer pos = position(Employee, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			Employee.get(pos).IncreaseSalary(percent);
		}
		
		System.err.println();
		System.out.println("List of employees: ");
		
		for (EmployeeWork emp : Employee) {
			System.out.println(emp);
		}
		
		sc.close();

	}
	
	public static Integer position(List<EmployeeWork> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		} return null;
	}
}

