package jan05;

public class Machine implements Info{
	
	//String machName="Machine No 1";
	
	private int id=7;
	public void start() {
		System.out.println("Machine Started");
	}
	public void stop() {
		System.out.println("Machine Stopped");
	}
	@Override
	public void showInfoMessage() {
		System.out.println("Machine ID is "+id);
		
	}

}
