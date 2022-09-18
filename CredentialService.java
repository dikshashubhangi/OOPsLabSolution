package ServiceLab;

import java.util.Random;
import ModuleLab.Employee;
import DriverLab.Driver;

public class CredentialService {
	
public String generatePassword() {
		
		int first = (int) '!'; //33
		int last = (int) '~'; //126
		
		int range = last-first;
		
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<8; i++) {
			int randomNumber = random.nextInt(range);//0-93
			randomNumber = randomNumber + first; // converting 0-93 to 33-126
			
			char randomChar = (char) randomNumber;
			sb.append(randomChar);
		}
		return sb.toString();
	}
	public String generateEmailAdd(Employee e, String dep) {
		String email = String.format("%s%s@%s.company.com", e.getFirstName(), e.getLastName(), dep);
		return email;
	}

	//Single responsibility principle to display creds.
	public void showCredential(String firstName, String password, String email) {
		System.out.printf("Dear %s your generated credentials are as follows \n"
				+ "Email -> %s\n"
				+ "Password -> %s", firstName, email, password);

	}


}
