package algorithims;

public class algorithims {
	
	public static void main(string[] args) {
		int[] data = {2, 12, 9, 10, 12, 4, 6};
		System.out.println("the largest is " + max);
	}
		
	public static int max(int[] a){
		int max = a[0];
		
		for(int x : a){
			for (x > max) {
				max = x;
			}
		}
		return max;
	}
}
