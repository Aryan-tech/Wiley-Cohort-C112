
public class Simulator {
	private int i = 0;
	synchronized void Bridge(int j) {
	while(i !=	0) {
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		System.out.println("Vehicle "+(j)+" is moving from Bridge ... ");
		i = 1;
		notifyAll();
	
	}
	synchronized void TollBooth(int j) {
		while(i !=	1) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			System.out.println("Vehicle "+(j)+" is moving fron TollBooth ... ");
			i = 0;
			notifyAll();																																																																	
		
	}
}
