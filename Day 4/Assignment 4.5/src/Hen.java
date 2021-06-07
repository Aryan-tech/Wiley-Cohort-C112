public class Hen implements Runnable{
	private HenOwner ho;
	public Hen(HenOwner ho) {
		super();
		this.ho = ho;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 50;i++)		{
			ho.Hen(i+1);
		}
	}
	
}
