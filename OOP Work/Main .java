@FunctionalInterface

interface A
{
	void show();
}

class Main 
{
	public static void main(String args[])
	{
		A ob = ()->{System.out.println("show");};
	
	}
}