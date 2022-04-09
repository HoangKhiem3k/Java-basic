package processfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



import controller.ArrayOfPeople;
import people.Date;
import people.People;
import people.Professor;
import people.Student;





public class ReadFile {
	
public People[] read(String nameFile) {
		
		
		int number=this.countObject(nameFile);
		
		
		People p[]= new People[number];
		
		
		
		int i=0;
		try {
			Scanner kb1= new Scanner(new File(nameFile));
			while(kb1.hasNext()) {
				
				String a= kb1.next();
	//			System.out.println("choose"+a);
				if(a.equals("Student")) { 
					Student s= new Student();
					
					kb1.nextLine();
					s.setCodeID(kb1.nextLine() );
					s.setFirstName(kb1.nextLine());
					s.setMiddleName(kb1.nextLine());
					s.setFamilyName(kb1.nextLine());
					Date d=this.returnDate(kb1.nextLine());
					s.setDayOfBirth(d);
					s.setHomePhoneNumber(kb1.nextLine());
					s.setCellPhoneNumber(kb1.nextLine());
					s.setDegreeProgram(kb1.nextLine());
					s.setStanding(kb1.nextLine());
					s.setExpectedGraduationYear(Integer.parseInt(kb1.nextLine()));
					
					p[i]=s;
					
					i++;
				}
					
				if(a.equals("Professor")) { // 2 la professor
					Professor P= new Professor();
					kb1.nextLine();
					P.setCodeID( kb1.nextLine() );
					P.setFirstName(kb1.nextLine());
					P.setMiddleName(kb1.nextLine());
					P.setFamilyName(kb1.nextLine());
					Date d=this.returnDate(kb1.nextLine());
					P.setDayOfBirth(d);
					P.setHomePhoneNumber(kb1.nextLine());
					P.setCellPhoneNumber(kb1.nextLine());
					P.setRank(kb1.nextLine());
					P.setDepartment(kb1.nextLine());
					P.setOfficeNumber(kb1.nextLine());
					P.setOfficePhoneNumber(kb1.nextLine());
					
					p[i]=P;
					i++;
					
				}
				if(a.equals("People")) { 
					People p1= new People();
					kb1.nextLine();
					p1.setCodeID( kb1.nextLine() );
					p1.setFirstName(kb1.nextLine());
					p1.setMiddleName(kb1.nextLine());
					p1.setFamilyName(kb1.nextLine());
					Date d=this.returnDate(kb1.nextLine());
					p1.setDayOfBirth(d);
					p1.setHomePhoneNumber(kb1.nextLine());
					p1.setCellPhoneNumber(kb1.nextLine());
					
					
					p[i]=p1;
					i++;
					
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return p;
	}
public int  countObject(String n) {
	int i=0;
		try {
			Scanner kb1= new Scanner(new File(n));
			while(kb1.hasNext()) {
				
				String a= kb1.next();
				if(a.equals("People")) 
				{ 
					
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					i++;

				}
				if(a.equals("Student"))
				{
					
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					i++;
				}
				if(a.equals("Professor")) { 
					kb1.nextLine(); 
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					kb1.nextLine();
					i++;
					
				}
				

				
				
		
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
//	
	
	}
	public Date returnDate(String s) {					// return date
		
		Date d= new Date();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='/') {
				d.setDay( Integer.parseInt(s.substring(0, i) ) );
				s=s.substring(i+1, s.length());
				break;
			}
		}
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='/') {
				d.setMonth( Integer.parseInt(s.substring(0, i) ) );
				
				s=s.substring(i+1, s.length());
			
				break;
			}
		}
		
		//con lai ma year
		d.setYear(Integer.parseInt(s));
		
		
		return d;
	}
//	private final static String FILE_URL = "C:\\Users\\DeLL LaP\\Desktop\\FC2_Project10\\Project10\\khiem.txt";
//	public static void main(String[] args) throws IOException {
//        File file = new File(FILE_URL);
//        InputStream inputStream = new FileInputStream(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader reader = new BufferedReader(inputStreamReader);
// 
//        String line = "";
//        while((line = reader.readLine()) != null){
//            System.out.println(line);
//        }
//    }
	public static void main(String[] args) throws IOException {
		ReadFile r= new ReadFile();
		
		People p[]=r.read("khiem.txt");
		
		ArrayOfPeople a= new ArrayOfPeople(p ,"khiem.txt");
		System.out.println("Done!");
	  
	}
}
