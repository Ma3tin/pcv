import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> pepa = new ArrayList<>();
        Random r = new Random(100);
        for (int i = 0; i < 100; i++) {
            pepa.add(r.nextInt(100));
        }
        ArrayList<Integer> jirka = new ArrayList<>(pepa);
        /*for (int i = 0; i < 50; i++) {
            jirka.add(r.nextInt(100));
        }*/
        Collections.sort(pepa);
        Collections.sort(jirka);
        if (pepa.equals(jirka)) System.out.println("ANO");
        else {
            for (int i = 0; 50 < pepa.size(); i++) {
                pepa.remove(i);
            }
        }

        //System.out.println(pepa);
        //System.out.println(jirka);
    }
}