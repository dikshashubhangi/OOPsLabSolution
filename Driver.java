package DriverLab;

import java.util.Scanner;

import ModuleLab.Employee;
import ServiceLab.CredentialService;


public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e= new Employee("Diksha" , "Shubhangi");
		System.out.println("Please enter the department: \n"
				+ "1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resource \n"
				+ "4. Legal \n");
		
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		String department;
		
		switch(input) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "adm";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "lgl";
			break;
			default:
				throw new IllegalArgumentException("Wrong argument "+input);
		}
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAdd(e, department);
		String password = cs.generatePassword();
		cs.showCredential(e.getFirstName(), password, email);

	}

}
