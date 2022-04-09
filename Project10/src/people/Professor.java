package people;
import java.util.Scanner;
public class Professor extends  People {
	String rank ;
	String department;
	String officeNumber ;
	String officePhoneNumber ;
	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		
		this.rank = rank;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOfficeNumber() {
		return this.officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getOfficePhoneNumber() {
		return this.officePhoneNumber;
	}

	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	public Professor() {
		super();
		this.rank = null;
		this.department =  null;
		this.officeNumber = null;
		this.officePhoneNumber = null;
	}
	public Professor(String codeID, String firstName, String middleName,String familyName, Date dayOfBirth, String homePhoneNumber,
			String cellPhoneNumber,String rank, String department, String officeNumber, String officePhoneNumber) {
		super(codeID, firstName, middleName,familyName, dayOfBirth, homePhoneNumber, cellPhoneNumber);
		this.rank = rank;
		this.department = department;
		this.officeNumber = officeNumber;
		this.officePhoneNumber = officePhoneNumber;
	}
	public void input() {
		super.input();
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Rank");
		System.out.println();
		System.out.println("Enter\n0 = None\r\n"+ 
		"1 = Assistant Professor\r\n"+"2 = Associate Professor"+
				"3 = Professor\r\n"+"4 = Assistant Teaching Professor\r\n"+
		"5 = Associate Teaching Professor\r\n"+"6 = Teaching Professor" );
		int Inputrank=kb.nextInt();
		switch(Inputrank)
		{
			case 0 :
			{
				this.rank = "None"; break;
			}
			case 1 :
			{
				this.rank = "Assistant Professor"; break;
			}
			case 2 :
			{
				this.rank = "Associate Professor"; break;
			}
			case 3 :
			{
				this.rank = "Professor"; break;
			}
			case 4 :
			{
				this.rank = "Assistant Teaching Professor"; break;
			}
			case 5 :
			{
				this.rank = "Associate Teaching Professor"; break;
			}
			case 6 :
			{
				this.rank = "Teaching Professor"; break;
			}
			
			default: break;
		}
		System.out.println("Enter Department");
		this.department=kb.next();
		setDepartment(department);
		System.out.println("Enter Officenumber");
		this.officeNumber=kb.next();
		setOfficeNumber(officeNumber);
		System.out.println("Enter phonenumber");
		this.officePhoneNumber=kb.next();
		setOfficePhoneNumber(officeNumber);
	}
	public void edit()
	{
		int n;
		System.out.println("1. Edit First Name \n 2. Edit Middle Name \n 3. Edit Family Name" + 
				"\n 4. Edit Birth Day  \n 5. Edit Home Phone Number \n 6. Edit Cell Phone Number   \n 7. Edit Rank \n 8. Edit Department \n 9. Edit OfficeNumber"
				+ "\n 10. Edit OfficePhoneNumber  ");
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
			case 7 :
			{
				String Rank2;
				System.out.println("Enter Rank you want to change: ");
				Rank2 = kb.nextLine();
				this.rank = Rank2 ; break;
			}
			case 8 :
			{
				String Department2;
				System.out.println("Enter Department you want to change: ");
				Department2 = kb.nextLine();
				this.department = Department2 ; break;
			}
			case 9 :
			{
				String OfficeNumber2;
				System.out.println("Enter Office Number you want to change: ");
				OfficeNumber2 = kb.nextLine();
				this.officeNumber = OfficeNumber2 ; break;
			}
			case 10 :
			{
				String OfficePhoneNumber2;
				System.out.println("Enter Office Phone Number you want to change: ");
				OfficePhoneNumber2 = kb.nextLine();
				this.homePhoneNumber = OfficePhoneNumber2 ; break;
			}
			
			default: break;
		}
	}
	public String toString() {
		return "Professor \n codeOfPeople : " + codeID + "\n firstName : "+ firstName + "\n middleName : " + middleName  + "\n familyName : " + familyName+ "\n dayOfBirth : " + dayOfBirth + "\n homePhoneNumber : " + homePhoneNumber
				+ "\n cellPhoneNumber :" + cellPhoneNumber + "\nrank : " + rank + "\n department : " + department + "\n officeNumber : " + officeNumber
				+ "\n officePhoneNumber : " + officePhoneNumber ;
	}
	public String writetofile() {
		String a="Professor \n"+
				this.getCodeID()+"\n"+
				this.getFirstName()+"\n"+
				this.getMiddleName()+"\n"+
				this.getFamilyName()+"\n"+
				this.getDayOfBirth().getDay()+"/"+this.getDayOfBirth().getMonth()+"/"+this.getDayOfBirth().getYear()+"\n"+
				this.getHomePhoneNumber()+"\n"+this.getCellPhoneNumber()+"\n"+this.getRank()+"\n"+this.getDepartment()+"\n"+this.getOfficeNumber()+"\n"+this.getOfficePhoneNumber()+"\n";
	
				return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p = new Professor();
		p.input();
		System.out.println(p);
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	

