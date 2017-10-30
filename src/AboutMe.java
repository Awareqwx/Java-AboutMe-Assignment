import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe
{

    static Scanner sc;

    public static void init()
    {
        sc = new Scanner(System.in);
    }

    public static void print(Object o)
    {
        System.out.println(o);
    }
    public static void print()
    {
        System.out.println();
    }

    public static void main(String[] args)
    {
        init();
        print("Enter your name: ");
        String name = sc.next();
        boolean test = true;
        int age = 0;
        while (test) {
            test = false;
            try {
                print("Enter your age: ");
                age = sc.nextInt();
            } catch (InputMismatchException e) {
                test = true;
                print("Please enter a number!");
                sc.next();
            }
        }
        print("Enter your hometown: ");
        String hometown = sc.next();
        print();
        print("Your name is " + name + ".");
        print("You are " + age + " years old.");
        print("You are from " + hometown + ".");
    }

}
