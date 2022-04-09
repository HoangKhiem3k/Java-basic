package people;
import java.util.Scanner;
public class Student extends People {
	private String	degreeprogram;
	private String standing;
	private int expectedGraduationYear;

	public String getDegreeProgram() {
		return this.degreeprogram;
	}

	public void setDegreeProgram(String degreeprogram) {
		this.degreeprogram = degreeprogram;
	}

	public String getStanding() {
		return this.standing;
	}

	public void setStanding(String standing) {
		this.standing = standing;
	}

	public int getExpectedGraduationYear() {
		return expectedGraduationYear;
	}

	public void setExpectedGraduationYear(int expectedGraduationYear) {

		this.expectedGraduationYear = expectedGraduationYear;
	}

	public Student() {
		super();
		this.standing=null;
		this.degreeprogram= null;
		this.expectedGraduationYear=0;
	}

	public Student(String codeID, String firstName, String middleName,String familyName, Date dayOfBirth, String homePhoneNumber,
			String cellPhoneNumber,String degreeprogram, String standing, int expectedGraduationYear) {
		super(codeID,firstName,middleName,familyName,dayOfBirth,homePhoneNumber,cellPhoneNumber);
		this.degreeprogram = degreeprogram;
		this.standing = standing;
		this.expectedGraduationYear = expectedGraduationYear;
	}
	public void input() {
		super.input();
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Degree program to which student belongs: ");
		this.degreeprogram=kb.nextLine();
		setDegreeProgram(degreeprogram);
		System.out.println("Standing: ");
		System.out.println();
		
		System.out.println("Enter\n0 = None\r\n" + "1 = Freshman\r\n" + "2 = Sophomore\r\n"
		+ "3 = Junior\r\n" + "4 =  Senior\r\n" + "5 = Graduate\r\n" 
		+ "6 = Masters Postgraduate\r\n" + "7 = PhD Postgraduate\r\n" );
		int standingInput=kb.nextInt();
		switch(standingInput) {
			case 0 :
			{
				this.standing = "None"; break;
			}
			case 1 :
			{
				this.standing = "Freshman"; break;
			}
			case 2 :
			{
				this.standing = "Sophomore"; break;
			}
			case 3 :
			{
				this.standing = "Junior"; break;
			}
			case 4 :
			{
				this.standing = "Senior"; break;
			}
			case 5 :
			{
				this.standing = "Graduate"; break;
			}
			case 6 :
			{
				this.standing = "Masters Postgraduate"; break;
			}
			case 7 :
			{
				this.standing = "PhD Postgraduate"; break;
			}
			default: break;
		}
		System.out.println("Enter Expected Graduation Year: ");
		this.expectedGraduationYear=kb.nextInt();
		setExpectedGraduationYear(expectedGraduationYear);
	}
	public void edit()
	{
		int n;
		System.out.println("1. Edit First Name \n 2. Edit Middle Name \n 3. Edit Family Name"
				+ "\n 4. Edit Birth Day  \n 5. Edit Home Phone Number \n 6. Edit Cell Phone Number"
				+"\n 7.Edit Degree Program \n 8.Edit Standing \n 9.Edit Expect Graduation Year");
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
				String degreeProgram2;
				System.out.println("Enter degreeProgram you want to change: ");
				degreeProgram2 = kb.next();
				this.degreeprogram = degreeProgram2 ; break;
			}
			case 8 :
			{
				String standing2;
				System.out.println("Enter standing you want to change: ");
				standing2 = kb.nextLine();
				this.standing = standing2 ; break;
			}
			case 9 :
			{
				int graduationYear2;
				System.out.println("Enter graduationYear you want to change: ");
				graduationYear2 = kb.nextInt();
				this.expectedGraduationYear = graduationYear2 ; break;
			}
			default: break;
		}
	}
	public String toString() {
		return "Student \n CodeID : " + codeID + "\n firstName : " + firstName + "\n Middle Name : " + middleName + "\n Family Name : " + familyName
				+ "\n dayOfBirth : " + dayOfBirth + "\n homePhoneNumber : " + homePhoneNumber + "\n cellPhoneNumber : "
				+ cellPhoneNumber + "\n program : " + degreeprogram + "\n standing : " + standing + "\n expectedGraduationYear : "
				+ expectedGraduationYear ;
	}
	public String writetofile() {
		String a="Student \n"+
		this.getCodeID()+"\n"+
		this.getFirstName()+"\n"+
		this.getMiddleName()+"\n"+
		this.getFamilyName()+"\n"+
		this.getDayOfBirth().getDay()+"/"+this.getDayOfBirth().getMonth()+"/"+this.getDayOfBirth().getYear()+"\n"+
		this.getHomePhoneNumber()+"\n"+
		this.getCellPhoneNumber()+"\n"+
		this.getDegreeProgram()+"\n"+this.getStanding()+"\n"+this.getExpectedGraduationYear()+"\n";
		return a;
	}
	public static void main(String[] args) {
		Date d= new Date(2,2,2001);
		 Student p=new  Student("00","a","b", "c",d,"001","002","a","b",2000);
		 p.input();
		System.out.println( p.toString());

	}
}
