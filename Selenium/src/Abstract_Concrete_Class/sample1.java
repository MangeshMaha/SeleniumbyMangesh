package Abstract_Concrete_Class;

public class sample1 extends sample
{

	public void m2() {
		System.out.println("Hello m2");
	}
	public void m3()
	{
		System.out.println("Hello m3");
		
	}
	public void m4()
	{
		System.out.println("Hello m4");
		m3();
		m5();
	}
	public static void m5()
	{
		System.out.println("Hello m588888");
		m6();
	}
	public static void m6()
	{
		System.out.println("Hello m6jg");
	}
}
