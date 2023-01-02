import java.util.Scanner;

public class MathJeopardy {

    static int playerOnePoints = 0;
    static int playerTwoPoints = 0;

    public static void main(String[] args) {
        System.out.println("Addition " + "Subtraction " + "Multiplication " + "Division");
        System.out.println("   100   " + "    100     " + "     100        " + "  100  ");
        System.out.println("   200   " + "    200     " + "     200        " + "  200  ");
        System.out.println("   300   " + "    300     " + "     300        " + "  300  ");
        System.out.println("   400   " + "    400     " + "     400        " + "  400  ");

        DoNext();

    }


    public static void DoNext() {
        System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Quit game \nPlease select a category: ");
        Scanner category = new Scanner(System.in);
        int doNext = category.nextInt();
        switch (doNext) {
            case 1:
                Addition();
                break;
            case 2:
                Subtraction();
                break;
            case 3:
                Multiplication();
                break;
            case 4:
                Division();
                break;
            case 5:
                System.out.println("Thank you for playing!");break;
            default:
                System.out.println("Please enter valid choice");
                DoNext();
        }
    }

    public static void Addition() {
        System.out.println("Addition");
        System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
        Scanner addition = new Scanner(System.in);
        int add = addition.nextInt();
        switch (add) {
            case 1:
                System.out.println("20 + 78 =  ");
                Scanner Input1 = new Scanner(System.in);
                double num = Input1.nextDouble();
                if (num == 98) {
                    System.out.println("Correct!");
                    WhichPlayer100();
                    break;
                }
                else
                    System.out.println("Sorry that's incorrect");
                break;
            case 2:
                System.out.println("55 + 16 =  ");
                Scanner Input2 = new Scanner(System.in);
                double num1 = Input2.nextDouble();
                if (num1 == 71) {
                    System.out.println("Correct!");
                    WhichPlayer200();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;

            case 3:
                System.out.println("189 + 209 =  ");
                Scanner Input3 = new Scanner(System.in);
                double num2 = Input3.nextDouble();
                if (num2 == 398) {
                    System.out.println("Correct!");
                    WhichPlayer300();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            case 4:
                System.out.println("307 + 1028 =  ");
                Scanner Input4 = new Scanner(System.in);
                double num3 = Input4.nextDouble();
                if (num3 == 1335) {
                    System.out.println("Correct!");
                    WhichPlayer400();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            default:
                System.out.println("Please enter valid choice");
                Addition();
                break;
        }
        DisplayPoints();
        DoNext();
    }

    public static void Subtraction() {
        System.out.println("Subtraction");
        System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
        Scanner subtraction = new Scanner(System.in);
        int subtract = subtraction.nextInt();
        switch (subtract) {
            case 1:
                System.out.println("82 - 10 =  ");
                Scanner Input1 = new Scanner(System.in);
                double num = Input1.nextDouble();
                if (num == 72) {
                    System.out.println("Correct!");
                    WhichPlayer100();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            case 2:
                System.out.println("78 - 17 =  ");
                Scanner Input2 = new Scanner(System.in);
                double num1 = Input2.nextDouble();
                if (num1 == 61) {
                    System.out.println("Correct!");
                    WhichPlayer200();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;

            case 3:
                System.out.println("283 - 37 =  ");
                Scanner Input3 = new Scanner(System.in);
                double num2 = Input3.nextDouble();
                if (num2 == 246) {
                    System.out.println("Correct!");
                    WhichPlayer300();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            case 4:
                System.out.println("1853 + 357 =  ");
                Scanner Input4 = new Scanner(System.in);
                double num3 = Input4.nextDouble();
                if (num3 == 1496) {
                    System.out.println("Correct!");
                    WhichPlayer400();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            default:
                System.out.println("Please enter valid choice");
                Addition();
                break;
        }
        DisplayPoints();
        DoNext();
    }


    public static void Multiplication() {
        System.out.println("Multiplication");
        System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
        Scanner multiplication = new Scanner(System.in);
        int multiply = multiplication.nextInt();
        switch (multiply) {
            case 1:
                System.out.println("5 * 12 =  ");
                Scanner Input1 = new Scanner(System.in);
                double num = Input1.nextDouble();
                if (num == 60) {
                    System.out.println("Correct!");
                    WhichPlayer100();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            case 2:
                System.out.println("12 * 8 =  ");
                Scanner Input2 = new Scanner(System.in);
                double num1 = Input2.nextDouble();
                if (num1 == 96) {
                    System.out.println("Correct!");
                    WhichPlayer200();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;

            case 3:
                System.out.println("102 * 13 =  ");
                Scanner Input3 = new Scanner(System.in);
                double num2 = Input3.nextDouble();
                if (num2 == 1326) {
                    System.out.println("Correct!");
                    WhichPlayer300();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            case 4:
                System.out.println("104 * 83 =  ");
                Scanner Input4 = new Scanner(System.in);
                double num3 = Input4.nextDouble();
                if (num3 == 8632) {
                    System.out.println("Correct!");
                    WhichPlayer400();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            default:
                System.out.println("Please enter valid choice");
                Addition();
                break;
        }
        DisplayPoints();
        DoNext();
    }

    public static void Division() {
        System.out.println("Division");
        System.out.println("1 - 100\n2 - 200\n3 - 300\n4 - 400\nPlease select a number: ");
        Scanner division = new Scanner(System.in);
        int divide = division.nextInt();
        switch (divide) {
            case 1:
                System.out.println("88 / 8  =  ");
                Scanner Input1 = new Scanner(System.in);
                double num = Input1.nextDouble();
                if (num == 11) {
                    System.out.println("Correct!");
                    WhichPlayer100();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            case 2:
                System.out.println("42 / 6 =  ");
                Scanner Input2 = new Scanner(System.in);
                double num1 = Input2.nextDouble();
                if (num1 == 7) {
                    System.out.println("Correct!");
                    WhichPlayer200();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;

            case 3:
                System.out.println("108 / 9 =  ");
                Scanner Input3 = new Scanner(System.in);
                double num2 = Input3.nextDouble();
                if (num2 == 12) {
                    System.out.println("Correct!");
                    WhichPlayer300();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            case 4:
                System.out.println("165 / 3 =  ");
                Scanner Input4 = new Scanner(System.in);
                double num3 = Input4.nextDouble();
                if (num3 == 55) {
                    System.out.println("Correct!");
                    WhichPlayer400();
                    break;
                } else
                    System.out.println("Sorry that's incorrect");
                break;
            default:
                System.out.println("Please enter valid choice");
                Addition();
                break;
        }
        DisplayPoints();
        DoNext();
    }


    public static void Add100PointsPlayer1() {
        playerOnePoints = playerOnePoints + 100;
        System.out.println("You have received 100 points player one!");
    }

    public static void Add200PointsPlayer1() {
        playerOnePoints = playerOnePoints + 200;
        System.out.println("You have received 200 points player one!");
    }

    public static void Add300PointsPlayer1() {
        playerOnePoints = playerOnePoints + 300;
        System.out.println("You have received 300 points player one!");
    }

    public static void Add400PointsPlayer1() {
        playerOnePoints = playerOnePoints + 400;
        System.out.println("You have received 400 points player one!");
    }

    public static void Add100PointsPlayer2() {
        playerTwoPoints = playerTwoPoints + 100;
        System.out.println("You have received 100 points player two!");
    }

    public static void Add200PointsPlayer2() {
        playerTwoPoints = playerTwoPoints + 200;
        System.out.println("You have received 200 points player two!");
    }

    public static void Add300PointsPlayer2() {
        playerTwoPoints = playerTwoPoints + 300;
        System.out.println("You have received 300 points player two!");
    }

    public static void Add400PointsPlayer2() {
        playerTwoPoints = playerTwoPoints + 400;
        System.out.println("You have received 400 points player two!");
    }

    public static void WhichPlayer100() {
        System.out.println("Is this player one or two?: ");
        Scanner player = new Scanner(System.in);
        String user = player.nextLine();
        if (user.toUpperCase().equals("ONE"))
            Add100PointsPlayer1();
        else if (user.toUpperCase().equals("TWO"))
            Add100PointsPlayer2();
        else {
            System.out.println("Please enter either one or two");
            WhichPlayer100();

        }
    }
    public static void WhichPlayer200() {
        System.out.println("Is this player one or two?: ");
        Scanner player = new Scanner(System.in);
        String user = player.nextLine();
        if (user.toUpperCase().equals("ONE"))
            Add200PointsPlayer1();
        else if (user.toUpperCase().equals("TWO"))
            Add200PointsPlayer2();
        else {
            System.out.println("Please enter either one or two");
            WhichPlayer200();
        }
    }

    public static void WhichPlayer300() {
        System.out.println("Is this player one or two?: ");
        Scanner player = new Scanner(System.in);
        String user = player.nextLine();
        if (user.toUpperCase().equals("ONE"))
            Add300PointsPlayer1();
        else if (user.toUpperCase().equals("TWO"))
            Add300PointsPlayer2();
        else {
            System.out.println("Please enter either one or two");
            WhichPlayer300();

        }
    }

    public static void WhichPlayer400() {
        System.out.println("Is this player one or two?: ");
        Scanner player = new Scanner(System.in);
        String user = player.nextLine();
        if (user.toUpperCase().equals("ONE"))
            Add400PointsPlayer1();
        else if (user.toUpperCase().equals("TWO"))
            Add400PointsPlayer2();
        else {
            System.out.println("Please enter either one or two");
            WhichPlayer400();
        }
    }
    public static void DisplayPoints(){
        System.out.println("Player one points: " + playerOnePoints);
        System.out.println("Player two points: " + playerTwoPoints);
    }
}
