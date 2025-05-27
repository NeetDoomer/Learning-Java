import java.util.HashMap;

public class hashMapPractice {
    public static void main(String[] args){
        HashMap<String, String> birthdays = new HashMap<String,String>();
        birthdays.put("James", "Febuary 31");
        birthdays.put("Mickey","September 32");
        birthdays.put("Tyler","December 26");

        System.out.println(birthdays);
    }
}
