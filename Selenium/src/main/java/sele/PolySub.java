package sele;

public class PolySub extends PolyAdd{

	public void display(int a,int b,int d)
	{
		super.display(12, 4, 8);
		int c=a-b-d;
		System.out.println("The sum is:"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolySub sub=new PolySub();
		sub.display(20, 10, 2);
	}

}
