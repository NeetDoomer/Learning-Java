public class tryCatchPractice {
    public static void main(String[] args){
        int index = 0;
        while (index < 3){
            try{
                System.out.println(30 / index);
                index++;
            } catch(Exception e){
                System.out.println("Could not divide");
                index++;
            }
        }
    }
}
