package pack9.packsub2;

public class CTrapezoid 
{
	public int upper;
	public int base;
	public int height;
	public CTrapezoid(int u,int b,int h)
	{
		upper=u;
		base=b;
		height=h;
	}
	public void show()
	{
		System.out.println("±è§Î­±¿n:"+(upper+base)*height/2);
	}
}
