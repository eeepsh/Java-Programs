
public class SuperKeywordTest 
{
	public static void main(String args[])
	{
		Person p=new Person();
		Student s=new Student();
		GraduateStudent g=new GraduateStudent();
		
		Person p2=new Student();
		Person p3=new GraduateStudent();
		
		Person p4=new Student();
		Student s2=(Student)p4;
		System.out.println(s2);
		Student s3=new GraduateStudent();
		
		//GraduateStudent g2=new Person();
		//GraduateStudent g3=new Student();
		
		s.printInfo();
		
	}

}
class Person
{
	String name="deepa";
	int age;
	String address;
	
	public void printInfo()
	{
		System.out.println(name);
		
	}
}
class Student extends Person
{
	int marks=100;
	int rollNo;
	
	public void printInfo()
	{
		super.printInfo();
		System.out.println(marks);
	}
}

class GraduateStudent extends Student
{
	String graduationDate;
}






