
public class SimulatorMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Simulator simulator = new Simulator();
		Thread v1 = new Thread(new Vehicle1(simulator));
		Thread v2 = new Thread(new Vehicle2(simulator));
		Thread v3= new Thread(new Vehicle3(simulator));
		Thread v4 = new Thread(new Vehicle4(simulator));
		Thread v5 = new Thread(new Vehicle5(simulator));
		
		v1.start();
		Thread.sleep(100);
		v2.start();
		Thread.sleep(100);
		v3.start();
		Thread.sleep(100);
		v4.start();
		Thread.sleep(100);
		v5.start();
	}

}
