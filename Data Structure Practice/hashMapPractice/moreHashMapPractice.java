import java.util.HashMap;

public class moreHashMapPractice {
    public static void main(String[] args){
        HashMap<String, String> patients = new HashMap<String,String>();

        patients.put("Room 101" , "Yuno Gasai");
        patients.put("Room 102" , "Sato Matsuzaka");
        patients.put("Room 103" , "Ayano Aishi");
        patients.put("Room 104" , "Kaede (Lucy)");
        patients.put("Room 105" , "Kurumi Tokisaki");

        for (String index : patients.keySet()){
            System.out.println(index + ": " + patients.get(index));
        }

        patients.remove("Room 105");
        System.out.println("\n Oh NO!!! the patient in room 105 got out \n Let me see the list again her name should still be on here \n \n");

                for (String index : patients.keySet()){
            System.out.println(index + ": " + patients.get(index));
        }

        patients.clear();

        System.out.println(patients.size());
    }
}
