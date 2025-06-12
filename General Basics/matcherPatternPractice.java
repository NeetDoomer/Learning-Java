import java.util.regex.Matcher;//this is pretty much me learning based of w3schools :3
import java.util.regex.Pattern;

public class matcherPatternPractice {
    public static void main(String[] args){
        String password = "paSswoRd123";
        Pattern pattern = Pattern.compile(password, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("PaSsWorD123");

        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("you're in >:3");
        }
        else{
            System.out.println("too bad so sad :3");
        }
    }
}
