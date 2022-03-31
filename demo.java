import java.util.Scanner;
class ElectricityBill
{
	public static void main(String args[])
	{
		long units;
		double billpay=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Units");
		units=sc.nextLong();
		
			if(units<100)
			{
				billpay=units*1.20;
			}
			else if(units<300)
			{
				billpay=100*1.20+(units-100)*2;
			}
			else if(units>300)
			{
				billpay=100*1.20+200*2+(units-300)*3;
			}
		System.out.println("Bill to pay : "+billpay);
	}
}