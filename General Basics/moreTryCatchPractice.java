public class moreTryCatchPractice {
    static void checkPower(int powerLevel){
        if (powerLevel <= 50000000){
            throw new ArithmeticException("Your power level is too low come back when you have 50 million power");
        }
        else{
            System.out.println("Of course we'll treat you like a human :D");
        }
    }

    public static void main(String[] args) {
        checkPower((49999999));
    }
}
