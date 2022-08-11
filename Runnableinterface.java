class Processor implements Runnable {
	public void run()
	{
		System.out.println("Hello All");
	}
}

public class Main{
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++) {
			Thread p= new Thread(new Processor());
			p.start();
		}
	}
}
