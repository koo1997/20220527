package test;

public class Test01 {

	public static void main(String[] args) {
		
		int number=1234;
		int s3=2;
//		String s1=number;
		String s2 = number+s3+"1234";
		System.out.println(s2);
		//문자열과 닿으면 문자열로 치환
		//문자열 없는 정수는 출력 불가  00s
		char c1='\u0043';
		System.out.println(c1);
		String s4= 9+9+"1234"+"12345"+"11";
		System.out.println(s4);
		
		String a="a";
		String a1="a";
		
		System.out.println(a.equals(a1));
		System.out.println(a.equalsIgnoreCase(a1));
		System.out.println(a.compareTo(a1));
		
		String str= "java developer";
		
		byte[] b=str.getBytes();
		System.out.println(b+"");
		for(byte c : b) {
			System.out.print(c+" ");
			System.out.print((char)c+" ");
		}
		System.out.println();
		char []h=str.toCharArray();
		for(char e : h) {
			System.out.print(e+" ");
		}
		System.out.println();
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			
		}
		
		System.out.println(str.substring(0,3));
		char[] k=str.substring(0,1).toCharArray();
		//0번째 부터 1번째까지 리턴
		for (char t: k) {
			System.out.print((int)t+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
