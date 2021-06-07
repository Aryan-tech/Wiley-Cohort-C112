
public class Vehicle3 implements Runnable {
	private Simulator simulator;

	public Vehicle3(Simulator simulator) {
		super();
		this.simulator = simulator;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.print("Vehicle3 is moving from ");
		simulator.Bridge(3);
		//System.out.print("Vehicle3 is moving from ");
		simulator.TollBooth(3);
	}
}
	

