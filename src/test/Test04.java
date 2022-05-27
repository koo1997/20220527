package test;

public class Test04 {
	
	public static void main(String[] args) {
		
		
		Integer obj=new Integer(1000);
		System.out.println("int 자료형 바이트수 :"+Integer.BYTES);
		System.out.printf("int의 범위 :%d~%d%n",
				Integer.MAX_VALUE,
				Integer.MIN_VALUE);
		System.out.println("int 자료형 비트수"+Integer.SIZE);
//		int num="123"+1;
		int num=Integer.parseInt("123")+1;   //O
//		int num= Integer.valueOf("123")+1;   //O
//		System.out.println(Integer.parseInt("123"));
//		int num = new Integer("123")+1;   //O 비추천
		System.out.println("num:"+num);
		
		Integer num1=1;
		System.out.println("num1 :"+num1);
		int num2 =27;
		System.out.println(Integer.toBinaryString(27));
		System.out.println(""+Integer.toOctalString(num2));
		System.out.println(""+Integer.toHexString(num2));
		System.out.println(""+Integer.parseUnsignedInt("27"));
		 
		
		
		
	}

}
