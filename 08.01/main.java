import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//// Переопределение compareTo
//@Override
//public int compareTo(Pharmacy o) {
//        return Integer.compare(this.getInterPower(), o.getInterPower());
//        }

public class main {
    public static void main(String[] args){
            ArrayList<Pharmacy> pharmacies = new ArrayList<>();

            Pharmacy pharmacy1 = new Pharmacy("Pharmacy 1");
            Pharmacy pharmacy2 = new Pharmacy("Pharmacy 2");
            Pharmacy pharmacy3 = new Pharmacy("Pharmacy 3");

            pharmacies.add(pharmacy1);
            pharmacies.add(pharmacy2);
            pharmacies.add(pharmacy3);

            printSortedPharmacies(pharmacies);
        }

        public static void printSortedPharmacies(ArrayList<Pharmacy> pharmacies) {
            Collections.sort(pharmacies, Comparator.comparing(Pharmacy::getName));

            for (Pharmacy pharmacy : pharmacies) {
                System.out.println(pharmacy);
            }
        }
}
