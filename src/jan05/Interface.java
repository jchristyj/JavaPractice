package jan05;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine mach2=new Machine();
		mach2.start();
		mach2.stop();
		mach2.showInfoMessage();
		
		Member mem1=new Member("bob");
		mem1.great();
		mem1.showInfoMessage();
		
		Info info1=new Machine();
		info1.showInfoMessage();
		
		Info info2=mem1;
		info2.showInfoMessage();
		
			}
	private static void info(Info info) {
		info.showInfoMessage();
	}

}
