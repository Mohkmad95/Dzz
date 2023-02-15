import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввел 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }
        System.out.println("Список A:" + listA);
        System.out.println("Ввел 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }
        System.out.println("Список B:" + listB);
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("Соединеный список C:" + listC);
        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Список C отсортирован по длине строкт:" + listC) ;

    }
}