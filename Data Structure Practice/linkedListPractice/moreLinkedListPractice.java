import java.util.LinkedList;
import java.util.Collections;

public class moreLinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> age = new LinkedList<Integer>();
        age.add(18);
        age.add(25);
        age.add(17);
        age.add(36);
        age.add(23);

        System.out.println(age);

        Collections.sort(age);

        System.out.println(age);

        Collections.sort(age,Collections.reverseOrder());

        for(Integer i: age)
        System.out.println(i);
    }
}
