
public class HenOwnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HenOwner ho = new HenOwner();
	Thread hen = new Thread(new Hen(ho));
	Thread owner = new Thread(new Owner(ho));
	
	hen.start();
	owner.start();																																																																																																						
	}

}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												