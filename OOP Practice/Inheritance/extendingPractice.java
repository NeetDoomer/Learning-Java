public class extendingPractice {
    public static void main(String[] args){
        Cat kitty = new Cat();
        kitty.whatAmI();
        System.out.println(kitty.noise);
    }
}
class animal {
    protected String desctype = "I am a Warm-blooded vertebrate";
    public void whatAmI(){
        System.out.println(desctype);
    }
}

class Cat extends animal {
    String noise = "Meow";
}