package pack9.packsub1;

public class CSphere //(a)
{
	public double PI=3.14;
	public double radius;
	public CSphere(double r)//(a)
	{
		radius=r;
	}
	public void show()//(b)
	{
		System.out.println("²yÅé¿n:"+(4*radius*radius*radius*PI)/3);
	}
}
