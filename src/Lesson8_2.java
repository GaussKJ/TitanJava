import java.util.Random;
import java.util.Scanner;

public class Lesson8_2
{
    public static void main(String[] args)
    {
        int Vasya = RandomChislo(0,2);
        int Petya = RandomChislo(0,2);
        System.out.println("Петя выбросил: " + Petya);
        System.out.println("Вася выбросил: " + Vasya);
        if (Vasya == Petya) {
            System.out.println("Ничья");
        } else if (Vasya == 0){
            if (Petya == 1){
                System.out.println("Вася выиграл!");
            } else System.out.println("Петя выиграл!");
        } else if (Vasya == 1){
            if (Petya == 0 ) {
                System.out.println("Петя выиграл!");
            } else System.out.println("Вася выиграл!");
        } else if (Vasya == 2){
            if (Petya == 0){
                System.out.println("Вася ваиграл!");
            } else System.out.println("Петя выиграл");
        }
    }
    public static int RandomChislo(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max-min+1) + min;
    }
}