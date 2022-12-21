package org.student;

import org.department.Department;

public class Student extends Department  {
	
	public void studentName()
	{
System.out.println("Name of the student");
	}
	public void studentDept()
	{
System.out.println("Name of the Department");
	}
	public void studentId()
	{
System.out.println("Id number of student");
	}

	public static void main(String[] args) {
		
		Student obj= new Student() ;
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.studentDept();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
				
		// TODO Auto-generated method stub

	}

}
