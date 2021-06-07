
public class Vehicle5 implements Runnable {
	private Simulator simulator;

	public Vehicle5(Simulator simulator) {
		super();
		this.simulator = simulator;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.print("Vehicle5 is moving from ");
		simulator.Bridge(5);
		//System.out.print("Vehicle5 is moving from ");
		simulator.TollBooth(5);
	}
}
	

