public class Aithmatic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        byte c = (byte) (a + b);
        char ch = 'a';
        int d = ch + a; // int 
        char d1 =(char)(ch + a); // k = 107 
        // char ch2 = d; // can't converted int to char 
        char ch2 = (char) d;
        // System.out.println(a + b);
        // System.out.println(c);
        System.out.println(d);
         System.out.println(d1);
        // System.out.println(ch2);
        System.out.println(d1 == ch2);
        System.out.println(d1 == d);
    }
}
