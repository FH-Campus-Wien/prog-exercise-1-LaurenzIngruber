package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        long c = 80L;
        float d = 44e-1f;
        float e = 5.5f;
        double f = 8.88e1;
        double g = 99.9;
        int h = 012;
        int sum = (int)a + b + (int)c + (int)d + (int)e + (int)f + (int)g + h;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner readme = new Scanner(System.in);
        int n1, n2, n3;
        n1 = readme.nextInt();
        n2 = readme.nextInt();
        n3 = n1 + n2;
        System.out.println(n3);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();

        if(n1 > n2) System.out.println("n1 > n2");
        if(n2 > n1) System.out.println("n2 > n1");
        if(n1==n2) System.out.println("n1 == n2");

    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        int U;
        System.out.print("Enter annual Revenue: ");
        U = scanner.nextInt();

        if(U < 0) System.out.println("Invalid Revenue");
        if(U >= 100000) System.out.println("Invalid Revenue");
        if(0 <= U && U < 20000) System.out.println("Poor Sales Revenue");
        if(20000 <= U && U < 50000) System.out.println("Average Sales Revenue");
        if(50000 <= U && U <80000) System.out.println("Good Sales Revenue");
        if(80000 <= U && U <100000) System.out.println("Excellent Sales Revenue");


    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        Scanner scanner = new Scanner(System.in);
        int provision = scanner.nextInt();
        switch(provision){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");

        }

    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Year: ");
        a = scanner.nextInt();

        if(a % 4 == 0 && a % 400 == 0) System.out.println("Leapyear");
        else {System.out.println("Not a Leapyear");}

    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a/100;
        int c = a/10 % 10;
        int d = a % 10;
        int e = d*100 + c*10 + b*1;
        System.out.println(e);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}