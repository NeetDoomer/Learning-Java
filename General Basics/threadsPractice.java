public class threadsPractice extends Thread {
    public static void main(String[] args){
        threadsPractice thread = new threadsPractice();
        thread.start();
        for(short i = 0; i < 3; i++){
            System.out.println("outside of thread: " + i);
        }
    }

    public void run(){
        for(short i = 0; i < 3; i++){
            System.out.println("inside of thread: " + i);
        }
    }
}
