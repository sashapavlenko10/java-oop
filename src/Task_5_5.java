import java.util.Arrays;

public class Task_5_5 {
	public static void main(String[] args) {
		int x[]={56,5,74,175,700};
		int[] a = {45,54,66,145,1};
		arrayplus(x ,a);
			}
				private static void arrayplus(int[] x, int[] a) {
				int c[] = Arrays.copyOf(x,x.length+a.length);
				System.arraycopy(a, 0, c, x.length, a.length);
				Arrays.sort(c);
				System.out.println(Arrays.toString(c));
			}	
}