package sele;

import java.util.Scanner;

public class StudValidate {
	
	public void validId(int id)
	{
		if(id==1001)
		{
			System.out.println("The id is valid");
			
		}
		else if(id==1234)
		{
			
				System.out.println("The id is valid");
				
			}
		else if(id==1212)
		{
			System.out.println("The pin is valid");
		}
		
		else
		{
			System.out.println("The pin is not valid");
		}
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		StudentId stud=new StudentId();
		StudValidate valid=new StudValidate();
		System.out.print("Enter the pin :");
		int enterpin=sc.nextInt();
		stud.setId(enterpin);
		 valid.validId(stud.getId());
		
		
		
	}

}
