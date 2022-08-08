//(4).Implement constructor overloadig by passing different number of parameter of different type.

import java.lang.*;
class StudDetails
{
	String name;
	int rollno;
	double per;
	 public StudDetails()
	 {
	 	name="ABC";
	 	rollno=20;
	 	per=60.00;
	 }
	 public StudDetails(String name,int rollno,double per)
	 {
	 	this.name=name;
	 	this.rollno=rollno;
	 	this.per=per;
     }
     public void display()
     {
     	System.out.println("Name = "+name+"\n"+"Roll no = "+rollno+"\n"+"Percentage = "+per);
     }
     public static void main(String[] args) {
     	StudDetails s1 = new StudDetails();
     	s1.display();
     	StudDetails s2 = new StudDetails("XYZ",30,100);
     	s2.display();
     }
}