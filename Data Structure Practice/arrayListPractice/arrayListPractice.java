import java.util.ArrayList;

public class arrayListPractice{
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Human");
        System.out.println(animals);
        animals.add(0, "Unicorns");
        System.out.println(animals);
        System.out.println(animals.get(3));
        animals.set(1, "Lions");
        System.out.println(animals);
        animals.remove(1);
        System.out.println(animals);
        System.out.println(animals.size());
        animals.clear();
        System.out.println(animals+"list is cleared");
    }
}