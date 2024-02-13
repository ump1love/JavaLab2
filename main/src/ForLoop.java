import java.util.Scanner;

class ForLoop
{
    Scanner scanner = new Scanner(System.in);
    public void menu()
    {
        int userNumMenu;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(
                    "Choose from wanted task: \n" +
                            "1 - from 1 to 5 and vice versa\n" +
                            "2 - multiplication table\n" +
                            "3 - sum from 1 to your number\n" +
                            "4 - small calculator\n" +
                            "5 - Exit\n" +
                            "Choice: ");
            userNumMenu = Integer.parseInt(scanner.nextLine());

            switch (userNumMenu)
            {
                case 1: forLoopTaskFirst(); break;
                case 2: forLoopTaskSecond(); break;
                case 3: forLoopTaskThird(); break;
                case 4: forLoopTaskForth(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid input"); break;
            }
        }while(userNumMenu != 5);
    }
    private void forLoopTaskFirst() {
        System.out.println("From 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("From 5 to 1");
        for (int i = 5; i != 0; i--) {
            System.out.println(i);
        }
    }
    private void forLoopTaskSecond()
    {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }
    }
    private void forLoopTaskThird()
    {
        System.out.print("Enter any positive number: \n" +
                         "Choice: ");
        int userNum = Integer.parseInt(scanner.nextLine());
        int userNumSum = 0;
        for (int i = 1; i < userNum; i++)
        {
            userNumSum += i;
        }
        System.out.println("Sum of numbers from " + 1 + " to " + userNum + " = " + userNumSum);
    }
    private void forLoopTaskForth()
    {
        int userNumForthTask;
        do
        {
            System.out.print(
                    "Enter two numbers\n" +
                    "Num1 = ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Num2: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.print(num1 + " * " + num2 + " = " + num1 * num2  + '\n');
            System.out.print("Enter \'1\' if you want to exit ");
            userNumForthTask = Integer.parseInt(scanner.nextLine());
        }while(userNumForthTask != 1);
    }
}