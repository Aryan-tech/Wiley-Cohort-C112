
public class Vehicle2 implements Runnable {
	private Simulator simulator;

	public Vehicle2(Simulator simulator) {
		super();
		this.simulator = simulator;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.print("Vehicle2 is moving from ");
		simulator.Bridge(2);
		//System.out.print("Vehicle2 is moving from ");
		simulator.TollBooth(2);
	}
}
	

