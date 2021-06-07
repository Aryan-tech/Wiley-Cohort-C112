
public class Vehicle1 implements Runnable {
	private Simulator simulator;

	public Vehicle1(Simulator simulator) {
		super();
		this.simulator = simulator;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.print("Vehicle1 is moving from ");
		simulator.Bridge(1);
		//System.out.print("Vehicle1 is moving from ");
		simulator.TollBooth(1);
	}
}
	

