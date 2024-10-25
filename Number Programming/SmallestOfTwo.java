class SmallestOfTwo {

    public static void main(String[] args) {
        int n1 = 30;
        int n2 = 45;
        int n3 = 28;
        int smallest = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
        System.out.println(smallest);

    }

}