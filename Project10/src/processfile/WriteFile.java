package processfile;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import people.Date;
import people.People;
import people.Professor;
import people.Student;
public class WriteFile {
	static String nameFile;
	public WriteFile(String name) {
		nameFile=name;
	}
	public void writeFile(People p[] ) throws FileNotFoundException {

		PrintStream f= new PrintStream(nameFile);
		for(int i=0;i<p.length;i++) {
			f.append(p[i].writetofile()+"\n");
			
		}
		System.out.println("Done!: ");
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		WriteFile  w = new WriteFile("khiem.txt");
		
		People p[]=new People[2];
		Date d= new Date(01,01,2000);

		p[0]=new People("01","Le","Do Hoang","Khiem", d, "123","123");
		p[1]=new Student("02","Nguyen","Van","A",d, "123","123","hoc sinh","abc",2021);
		
		w.writeFile(p);
	}

}
