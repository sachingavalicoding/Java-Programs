class Widening {
    public static void main(String[] args) {
        char ch = 'a';
        //byte b = ch; // can't converted char to byte
        //short s = ch; // can't converted char to short 
        int i = ch;
        long l = ch;
        float f = ch;
        double d = ch;
        System.out.println(" Char to Others data types ");
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        byte b1 = 10;

        short s1 = b1;
        int i1 = b1;
        long l1 = b1;
        float f1 = b1;
        double d1 = b1;
        //char ch1 =  b1; // possible lossy converstion  byte to char 
        System.out.println(" Byte  to Others data types ");
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(s1);

        char ch2 = 'a';
        short s2 = 1000;
        int i2 = s2;
        long l2 = s2;
        float f2 = s2;
        double d2 = s2;
        //char ch1 =  b1; // possible lossy converstion  byte to char 
        System.out.println(" Short  to Others data types ");
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
        System.out.println(s2);
        System.out.println(ch2);

    }
}