import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class LAB5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 0;
        try {
            System.out.println("Задайте количество элементов в списке");
            N = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Количество элементов списка может быть задано только целым числом");
            System.exit(1);
        }
        if (N >= 1) {
            ArrayList<Integer> Alist = new ArrayList<>();
            try {
                System.out.println("Задайте элементы списка");
                for (int i = 0; i < N; i++) {
                    Alist.add(i, in.nextInt());
                }
            } catch (InputMismatchException e) {
                System.out.println("Элементами списка в данной программе могут быть заданы только целые числа");
                System.exit(1);
            }
            LinkedList<Integer> AlistNew = new LinkedList<>();
            AlistNew.addAll(Alist);
            int X = 0;
            try {
                System.out.println("Введите значение. Все элементы списка, равные этому значению, удаляются");
                X = in.nextInt();
                in.close();
            } catch (InputMismatchException e) {
                System.out.println("Элементы списка в данной программе могут сравниваться только с целым числом");
                System.exit(1);
            }
            for (int j = 0; j < N; j++) {
                if (AlistNew.get(j) == X) {
                    AlistNew.remove(j);
                    N--;
                    j--;
                }
            }
            int size = AlistNew.size();
            if (size >= 1) {
                System.out.println("Исходный список");
                System.out.println(Alist);
                System.out.println("Список после удаления элементов с заданным значением");
                System.out.println(AlistNew);
            } else {
                System.out.println("Исходный список");
                System.out.println(Alist);
                System.out.println("Все элементы были удалены из заданного списка");
            }
        } else {
            System.out.println("Для работы данной программы список должен содержать не меньше одного элемента");
        }
    }
}