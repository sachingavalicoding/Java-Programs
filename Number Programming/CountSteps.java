class CountSteps{
    public static void main(String[] args) {
        int dis = 4000;//m
        double stepsDis = 0.60;//m
        int steps = (int) (dis / stepsDis);
        System.out.println(" Total Distance we travel  " + dis+ " M ");
        System.out.println(" total steps  " + steps);
    }
}