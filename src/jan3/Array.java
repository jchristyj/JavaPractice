package jan3;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		int[] arr2= {1,2,3,4};
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		String[] names= {"jancy","christy","johnson"};
		for(String name:names) {
		System.out.println(name);
		
		String[] message=new String[3];
		message[0]="Have a";
		message[1]="nice";
		message[2]="day";
		System.out.println(message[2]);
		
		}
	}

}
