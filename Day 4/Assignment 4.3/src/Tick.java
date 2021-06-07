
public class Tick implements Runnable{
	private Clock clock;
	public Tick(Clock clock) {
		super();
		this.clock = clock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<=60; i++)	{
			clock.Tick(i);																																																																																																																																																											
		}
	}
																																																																																																																																													
}
