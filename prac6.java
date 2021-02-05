package practice_pg;
import java.util.*;
public class prac6 {
	public static void main(String [] args) {
		int a[]= {11,55,33,2,55,3,666,4444,321,0444};
		String st[]= {"nav","ak"};
		Arrays.sort(st);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		System.out.println("------------------");
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
			}
	}

}
