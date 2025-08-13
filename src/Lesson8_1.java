import java.util.Scanner;

public class Lesson8_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}