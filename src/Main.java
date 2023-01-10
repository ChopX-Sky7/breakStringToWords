import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text;

        System.out.println("Введите текст:");
        text = in.nextLine();
        String[] words = text.split(" ");
        countWords(words);
    }


    private static void printArray(String[] arr){
       for (String elem : arr){
           System.out.println(elem);
       }
    }

    private static void countWords(String[] arr){
        int count = 0;
        for (String elem : arr){
            count++;
        }
        System.out.println("Количество слов: " + count);
    }
}
