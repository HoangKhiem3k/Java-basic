package people;

import java.util.Scanner;

public class People{
	
	protected String codeID;
	protected String firstName ;
	protected String middleName ;
	protected String familyName;
	protected Date dayOfBirth ;
	protected String homePhoneNumber;
	protected String cellPhoneNumber;

	public String getCodeID() {
		return codeID;
	}

	public void setCodeID(String codeId) {
		this.codeID = codeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Date getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getHomePhoneNumber() {
		return this.homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}


	
	public People() {
		this.codeID = null;
		this.firstName = null;
		this.middleName = null;
		this.familyName= null;
		this.dayOfBirth = null;
		this.homePhoneNumber= null;
		this.cellPhoneNumber = null;
	}


	public People(String codeID, String firstName, String middleName,String familyName, Date dayOfBirth, String homeNumber,
			String cellPhoneNumber) {
		this.codeID = codeID;
		this.firstName = firstName;
		this.middleName = middleName;
		this.familyName = familyName;
		this.dayOfBirth = dayOfBirth;
		this.homePhoneNumber= homeNumber;
		this.cellPhoneNumber = cellPhoneNumber;
	}
	
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter code");
		this.codeID=kb.next();
		setCodeID(this.codeID);
		kb.nextLine();
		System.out.println("enter First Name");
		this.firstName=kb.nextLine();
		setFirstName(this.firstName);

		System.out.println("enter Middle Name");
		this.middleName=kb.nextLine();
		setMiddleName(this.middleName);
		
		System.out.println("enter Family Name");
		this.familyName=kb.nextLine();
		setFamilyName(this.familyName);
		
		System.out.println("enter dayofbirth");
		dayOfBirth=new Date();
		dayOfBirth.input();
		
		System.out.println("enter home phone");
		this.homePhoneNumber=kb.next();
		setHomePhoneNumber(this.homePhoneNumber);
		
		System.out.println("enter cell phone");
		this.cellPhoneNumber=kb.next();
		setCellPhoneNumber(this.cellPhoneNumber);
	}
	





	
	public String toString() {
		return  "People - Name: "+ familyName +", " + firstName +" "+ middleName 
				+ "\n Birth Day: " + dayOfBirth + "\n Home Phone Number: " + homePhoneNumber 
				+ "\n Cell Phone Number: " + cellPhoneNumber
				+"\n-----------------------------------------------------------------";
	}

	
	public String write() {
		return null;
	}
	
	
	public boolean checkString(String s){
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'A'||(s.charAt(i)>'Z'&& s.charAt(i)<'a')||s.charAt(i)>'z') {
				return false;
			}
		}
		return true;
	}
	public boolean checkStringNumber(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'0'||s.charAt(i)>'9') {
				return false;
			}}
		return true;
	}
	public void edit()
	{
		int n;
		System.out.println("1. Edit First Name \n 2. Edit Middle Name \n 3. Edit Family Name"
				+ "\n 4. Edit Birth Day  \n 5. Edit Home Phone Number \n 6. Edit Cell Phone Number");
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		switch(n) {
			case 1 :
			{
				String firstname2;
				System.out.println("Enter First Name you want to change: ");
				firstname2 = kb.next();
				this.firstName = firstname2 ; break;
			}
			case 2 :
			{
				String middlename2;
				System.out.println("Enter Middle Name you want to change: ");
				middlename2 = kb.next();
				this.middleName = middlename2 ; break;
			}
			case 3 :
			{
				String familyname2;
				System.out.println("Enter Family Name you want to change: ");
				familyname2 = kb.next();
				this.familyName = familyname2 ; break;
			}
			case 4 :
			{
				Date birthday2=new Date();;
				
				System.out.println("Enter Birthday you want to change: ");
				birthday2.input();
				this.dayOfBirth = birthday2 ;
				
				
				break;
			}
			case 5 :
			{
				String homephonenumber2;
				System.out.println("Enter Home Phone Number you want to change: ");
				homephonenumber2 = kb.next();
				this.homePhoneNumber = homephonenumber2 ; break;
			}
			case 6 :
			{
				String cellphonenumber2;
				System.out.println("Enter Cell Phone Number you want to change: ");
				cellphonenumber2 = kb.nextLine();
				this.cellPhoneNumber = cellphonenumber2 ; break;
			}
			
			default: break;
	}
		
		
}
	
	public String writetofile() {
		String a="People \n"+
				this.getCodeID()+"\n"+
				this.getFirstName()+"\n"+
				this.getMiddleName()+"\n"+
				this.getFamilyName()+"\n"+			
				this.getDayOfBirth().getDay()+"/"+this.getDayOfBirth().getMonth()+"/"+this.getDayOfBirth().getYear()+"\n"+
				this.getHomePhoneNumber()+"\n"+
				this.getCellPhoneNumber()+"\n";
				return a;
	}
	public static void main(String[] args) {
		Date d= new Date(2,2,2001);
		 People p=new  People("00","a","b", "c",d,"001","002");
		 p.input();
		System.out.println( p.toString());

	}

}

