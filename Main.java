import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)
	   {
		String name;
		String DOB;
		String gender;
		String phno;
		String blood;
		String bloodbank;
		String type;
		String Donationdate;
		
		Scanner sc = new Scanner(System.in);
		Donar obj = new Donar();
		System.out.println("Enter the name : ");
		name=sc.nextLine();
		obj.setName(name);
		System.out.println("Enter the Date of Birth : ");
		DOB=sc.nextLine();
        obj.setDateOfBirth(DOB);
		System.out.println("Enter Gender : ");
		gender=sc.nextLine();
		obj.setGender(gender);
		System.out.println("Enter Mobile Number : ");
		phno=sc.nextLine();
		obj.setMobileNumber(phno);
		System.out.println("Enter Blood Group : ");
		blood=sc.nextLine();
		obj.setBloodGroup(blood);
		System.out.println("Enter Blood Bank Name : ");
		bloodbank=sc.nextLine();
		obj.setBloodBankName(bloodbank);
		System.out.println("Enter Donor Type : ");
		type=sc.nextLine();
		obj.setDonorType(type);
		System.out.println("Enter Donation Date : ");
		Donationdate=sc.nextLine();
        obj.setDonationDate(Donationdate);
   
    
        obj.displayDonationDetails();
	
	   }
}