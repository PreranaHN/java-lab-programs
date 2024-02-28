package week2;

class Student
{
	String StudName,dept;
	int Rollno;
	static String clg = "GPT";
	int percentage;
	void setStudent(String Name, int rollno, String cdept,int per)
	{
		StudName=Name;
		Rollno = rollno;
		dept=cdept;
		percentage=per;
	}
	void getStudent()
	{
		System.out.println(StudName+"\t" +Rollno+"\t"+clg+"\t"+dept+"\t\t"+percentage);
	}
}
class Studentclass
{
	public static void main(String args[])
{
	System.out.println("Name\tRoll\tCollege\tDepartment\tPercentage");
	Student Stud1= new Student();
	Student Stud2= new Student();
	Stud1.setStudent("Sindhu", 155,"CS",88);
	Stud2.setStudent("Madhu", 100, "EC",90);
	Stud1.getStudent();
	Stud2.getStudent();
	}
}