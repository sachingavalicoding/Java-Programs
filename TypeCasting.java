class TypeCasting {

	public static void main(String [] args ){

	int a = 120;
	int b = 90;
	byte c = (byte) (a+b);
        System.out.println(c);//46
        System.out.println((byte) (120 + 45));// 165 // 91
	System.out.println((byte) (120 + 46));// 166 // 90
	System.out.println((byte) (120 + 47));// 167 // 89
	System.out.println((short) (120 + 47));// 167 // 167

 }
}