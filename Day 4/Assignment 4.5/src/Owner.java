
public class Owner implements Runnable{
	private HenOwner ho;
	public Owner(HenOwner ho) {
		super();
		this.ho = ho;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 50;i++) {
			ho.Owner(i*2);
		}
	}

}
