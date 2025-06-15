package app;
import java.util.ArrayList;
import java.util.Collections;

public class Array_list_Adv {
    public static void main(String[] args) {
        

        ArrayList<String> cartoons = new ArrayList<>();
        cartoons.add("Spidey");
        cartoons.add("Captain America");
        cartoons.add("Tony Stark");
        cartoons.add("Thor");
        cartoons.add("Loki");
        System.out.println("The 5 cartoon characteers : "+cartoons);

        cartoons.remove("Spidey");
        System.out.println("Characters after reemoving spidey : "+cartoons);

        cartoons.set(1,"Iron man");
        System.out.println("Replaced Tony with Iron man "+cartoons);

        System.out.println("Printing Each character : ");
        for(String cartoon : cartoons){
            System.out.println(cartoon);
        }

        Collections.sort(cartoons);
        System.out.println("Sorted characters : "+ cartoons);
    }
}