class IncrementOp {
    public static void main(String[] args) {
        int pocket = 100;
        System.out.println(pocket++);// print 100 p = 101
        System.out.println(pocket++);// print 101 p = 102
        System.out.println(++pocket);// print 103 p = 103
        System.out.println(pocket++);// print 103 p = 104
        System.out.println(++pocket);// print 105 p = 105
        System.out.println(++pocket + ++pocket);// print 213 p = 107
        System.out.println(pocket++ + ++pocket);// print 216 p = 109
        System.out.println(pocket + ++pocket);// print 219 p = 110
        System.out.println(--pocket);
    }
}
