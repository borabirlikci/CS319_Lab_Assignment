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

        Player player1 = new Player(" Tom ");
        Player player2 = new Player(" John ");
        Player player3 = new Player(" James ");
        Player player4 = new Player(" Henry ");

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;

        Die die = new Die();

        for (int i = 0; i < 5; i++) {
            score1 += die.rollDie();
            score2 += die.rollDie();
            score3 += die.rollDie();
            score4 += die.rollDie();
        }
        player1.setScore(score1);
        player2.setScore(score2);
        player3.setScore(score3);
        player4.setScore(score4);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

    }
}
