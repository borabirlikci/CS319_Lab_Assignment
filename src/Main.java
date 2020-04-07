import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(100);
        list1.add(500);
        list1.add(900);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(800);
        list2.add(600);
        list2.add(300);

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(400);
        list3.add(700);
        list3.add(200);
        ArrayOrganizer arrayOrganizer = new ArrayOrganizer();

        System.out.println(arrayOrganizer.concatAndSort(list1,list2,list3));



    }
}
