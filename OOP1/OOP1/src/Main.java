import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<Napoje> list = new ArrayList<>();
        list.add(new Sok("Caprisun", (float) 2.99, "Wieloowocowy"));
        list.add(new Gaz("Zywiec", (float) 1.89, "Mocny gaz"));
        list.add(new Bezgazu("Alkaida", (float) 1.58, "alkaiczna"));


        list.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                int l1 = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
                int l2 = o2.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
                return l1 - l2;


            }
        });
        for(Napoje z: list){
            z.pij();
        }
    }}