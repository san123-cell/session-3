package session3;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list {
    public static void main(String[] args) {
        List<String> Sanv = new ArrayList<>();
        Sanv.add("SANJAY");
        Sanv.add("SANJA");
        Sanv.add("SANJ");
        Sanv.add("SAN");
        Sanv.add("SA");
        Sanv.add("S");
        Sanv.add("SANV");
        Sanv.add("SAN");
        Sanv.add("SA");
        Sanv.add("S");
        System.out.println(Sanv);
        Sanv.remove(3);
        System.out.println(Sanv);
        for ( String x: Sanv) {
            System.out.println(x);

        }
        Set<Integer> Vsan = new HashSet<>();
        Vsan.add(11);
        Vsan.add(22);
        Vsan.add(23);
        Vsan.add(44);
        Vsan.add(56);
        Vsan.add(67);
        Vsan.add(75);
        Vsan.add(84);
        Vsan.add(94);
        Vsan.add(94);
        System.out.println(Vsan);
        Vsan.remove(23);
        System.out.println(Vsan);
    }
    //Task 6 : Write a Java Program

   // a) Add 10 values (Include duplicate Values) in List and Set
   // b) Print all values via enhanced for and remove 3rd value
   // c) Iterate all values

}
