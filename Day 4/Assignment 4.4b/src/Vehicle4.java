
public class Vehicle4 implements Runnable {
	private Simulator simulator;

	public Vehicle4(Simulator simulator) {
		super();
		this.simulator = simulator;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.print("Vehicle4 is moving from ");
		simulator.Bridge(4);
		//System.out.print("Vehicle4 is moving from ");
		simulator.TollBooth(4);
	}
}
	

