import java.util.HashSet;

public class hashSetPracctice {
    public static void main(String[] args){
        HashSet<String> myFavAnime = new HashSet<String>();

        myFavAnime.add("Pandora Hearts");
        myFavAnime.add("Mirai Nikki");
        myFavAnime.add("Needless");
        myFavAnime.add("Yosuga no Sora");

        System.out.println(myFavAnime);

        System.out.println("Oops... removing one");

        myFavAnime.remove("Yosuga no Sora");

        for(String index : myFavAnime){
            System.out.println(index);
        }

        myFavAnime.clear();
    }
}
