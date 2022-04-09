package controller;

import java.util.Scanner;

import people.People;
import people.Professor;
import people.Student;

public class ArrayOfPeople {
	public People []a;
	private int n;
	static String name;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n<0) this.n=0;
		else this.n = n;
	}

	public ArrayOfPeople( ) {
		a= new People [100];
		this.n=0;
	}
	public ArrayOfPeople(People p[],String namef) {
		a= p;
		this.setN(a.length);
		name=namef;
	}
	public void input()
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter the length of array:");
		this.n=kb.nextInt();
		setN(this.n);
		for (int i=0;i<n;i++)
		{	
			System.out.println("Enter member [" + (i+1) + "]:");
			System.out.println("1: Professor    /   2: Student    /    3: People");
			int choose=kb.nextInt();
			if(choose==1)
			{
				People p= new Professor();
				p.input();
				a[i]=p;
			}
			 
			if(choose==2)
			{
				People s= new Student();
				s.input();
				a[i]=s;
			}
			if(choose==3)
			{
				People P= new People();
				P.input();
				a[i]=P;
			}
			
		}
	}
	// tim doi tuong
	public People[] find(String x) {
		int index=0;
		for(int i=0;i<this.getN();i++) {
			if(a[i].getCodeID().equalsIgnoreCase(x)){
				index++;
			}
		}
		People []b= new People[index];
		int count=0;
		for(int i=0;i<this.getN();i++) {
			if(a[i].getCodeID().equalsIgnoreCase(x)){
				b[count]=a[i];
				++count;
			}
		}
		return b;
	}

	//them 1 doi tuong vao cuoi mang
	public void add(People x)//them mot people
	{
		
		People []b= new People[this.getN()+1];// tao mang b=a+1
		
		
		for(int i=0;i<this.getN();i++) {
			b[i]=a[i];
		}
		
		
		b[this.getN()]=x;
		this.a=b;
		this.setN(a.length);
		
		

	}
	// xuat mang
	public void output() {
		for(int i=0;i<this.getN();i++) {
			System.out.println(a[i].toString());
			
		}
	}
	public void Edit() {
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter index of member you want to edit: ");
		int index = kb.nextInt();
		a[index].edit();
	    
	}
	// hoan doi 
	public void swap(int i,int j) {
		 People p1=new People();
		 p1=this.a[j];
		 this.a[j]=this.a[i];
		 this.a[i]=p1;
		
	}
	// sap xem theo ten
	public People[] sort() {
		System.out.println("sort dang xu ly");
		 for (int i = 0 ; i < this.getN()-1 ; i++) {
			 System.out.println(i);
	            for (int j = i + 1; j < this.getN(); j++) {
	                if (a[i].getFamilyName().compareTo(a[j].getFamilyName())>0) {
	                	this.swap(i, j);

	                }
	                else
	                {
	                	 if (a[i].getFamilyName().compareTo(a[j].getFamilyName())==0)
	                	 {
	                		 if(a[i].getFirstName().compareTo(a[j].getFirstName())>0)
	                		 {
	                			 this.swap(i, j);

	                		 }
	                	 }
	                }
	            }
		 }
		 return a;
	}
// vi tri chua codeID
	public People[] remove(String x) {
		for(int i=0; i<this.getN();i++) {
			if(x.equals(a[i].getCodeID())) {
				remove(i);
			}
		}
		People[]p= new People[this.getN()];
		for(int i=0;i<this.getN();i++) {
			p[i]=a[i];
		}
		return p;
		
	}
	// xoa vi tri 
	public void remove(int index)// xoa 1 gia tri tai vi tri index
	{
		if(index>=0&& index<this.getN()){
			for(int i= index; i<this.getN()-1;i++) {
				a[i]=a[i+1];
			}
			this.setN(this.getN()-1);
		}
		
	}
	
	
	public People[] returnNewArray() {
		return this.a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfPeople m = new ArrayOfPeople();
//		Student m2 = new Student();
//		m2.input();
		m.input();
//		m.output();
//		m.add(m2);
//		m.delete(0);
//		String a = "01";
//		People[] x = m.find(a);
//		System.out.println(x);
		m.Edit();
		m.output();
	}

}
