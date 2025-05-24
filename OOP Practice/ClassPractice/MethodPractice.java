public class MethodPractice {
    static void staticMethod() {
        System.out.println("static method");
    }

    public void publicMethod() {
        System.out.println("public method");
    }

    public static void main(String[] args){
       // publicMethod();   publics can only run through the object
        staticMethod();

        MethodPractice methodObject = new MethodPractice();
        methodObject.publicMethod();
    }
}

//static methods can be used outside of the object call while public need to be used through the object

//publics are useful for getting individual information from each person (like a check in system)