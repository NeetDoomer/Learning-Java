import java.util.ArrayList;
import java.util.Iterator;

public class iteratorPractice {
    public static void main(String[] args){
        ArrayList<String> favArtists = new ArrayList<String>();

        favArtists.add("M3shka");
        favArtists.add("Robopup");
        favArtists.add("Pierce The Veil");
        favArtists.add("Crown The Empire");

        Iterator<String> index = favArtists.iterator();

        System.out.println(index.next());

        while(index.hasNext()){//why can't i go back? why isn't there a .previous() method?
            System.out.println(index.next());
        }
    }    
}
