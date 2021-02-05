package practice_pg;

public class prac7 {
	public static void main(String [] args) {
		String st="navkaran singh";
		st=st.replaceAll("\\s", "");
		char Array1[]=st.toLowerCase().toCharArray();
		int l=Array1.length;
		int l2=st.length();
		System.out.println(l+" "+l2);
		
	}

}
