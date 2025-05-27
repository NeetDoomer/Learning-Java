import java.util.ArrayList;
import java.util.Collections;//for sorting

public class moreArrayListPractice {
    public static void main(String[] args){
        ArrayList<String> diningTable = new ArrayList<String>();
        diningTable.add("Plate");
        diningTable.add("Forks");
        diningTable.add("Spoon");
        diningTable.add("Knives");
        diningTable.add("Cups");
        System.out.println(diningTable);
        System.out.println(diningTable.size());
        Collections.sort(diningTable);//sorts alphebetically
        System.out.println(diningTable);
        for (String index : diningTable){
            System.out.println(index);
        }
    }
}
