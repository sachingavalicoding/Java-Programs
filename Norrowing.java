class Norrowing {
    public static void main(String[] args) {
        // check for interger value 
        System.out.println(" INterger type cast");
        int i = 13223;
        int a = 97;
        //byte b = i;// CTE possible lossy conversion without explict type cast
        byte b = (byte) i; // -89
        short s = (short) i;// 13223
        char ch = (char) i;
        char ch1 = (char) i;
        System.out.println(b);
        System.out.println(s);
        System.out.println(ch);// ?
        System.out.println(ch1);// ?
    }
}