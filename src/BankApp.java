import java.util.Scanner;

public class BankApp {
    String firstName;
    String lastName;
    double balance = 0;
    double lastTransaction = 0;

    public BankApp() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter your last name: ");
        this.lastName = in.nextLine();

        System.out.print("Would you like to make a deposit?: ");
        Scanner Input1 = new Scanner(System.in);
        String deposit = Input1.nextLine();

        if (deposit.toUpperCase().equals("YES")) {
            Deposit();
        }
        else if (deposit.toUpperCase().equals("NO")) {
            System.out.print("Would you like to make a withdrawal?: ");
            Scanner Input4 = new Scanner(System.in);
            String withdrawal = Input4.nextLine();

            if (withdrawal.toUpperCase().equals("YES")) {
                Withdrawal();
            }
            else if (withdrawal.toUpperCase().equals("NO")){
                System.out.println("Thank you " + firstName + " please come again");
            }
            else {
                System.out.println("Please enter either yes or no");
                new BankApp();
            }
        }
        else {
            System.out.println("Please enter either yes or no");
            new BankApp();
        }
    }

    public void Deposit(){
        GetBalanceSimple();
        System.out.print("How much would you like to deposit?: ");
        Scanner Input2 = new Scanner(System.in);
        double deposit = Input2.nextDouble();
        balance = balance + deposit;
        System.out.println("Thank you for your deposit of " + deposit);
        GetBalanceSimple();

        lastTransaction = deposit;

        DoNext();
    }

    public void GetBalanceSimple(){
        System.out.println("Your current balance is " + balance);
    }

    public void GetBalance(){
        System.out.println("Your current balance is " + balance);

        DoNext();
    }

    public void Withdrawal(){
        GetBalanceSimple();
        System.out.print("How much would you like to withdraw?: ");
        Scanner Input3 = new Scanner(System.in);
        double withdrawal = Input3.nextDouble();
        balance = balance - withdrawal;
        System.out.println("You have withdrawn " + withdrawal);
        GetBalanceSimple();

        lastTransaction = -withdrawal;

        DoNext();
    }

    public void CalculateInterest(){
        System.out.print("Enter the principal amount: ");
        Scanner Input6 = new Scanner(System.in);
        double principal = Input6.nextDouble();

        System.out.print("Enter the interest rate as a percent: ");
        Scanner Input7 = new Scanner(System.in);
        double percent = Input7.nextDouble();

        System.out.print("Enter the time in years: ");
        Scanner Input8 = new Scanner(System.in);
        double time = Input8.nextDouble();

        double rate = percent/100;

        double interest = principal * rate * time;

        System.out.println("The interest is " + interest);

        DoNext();
    }

    public void PreviousTransaction(){
        if(lastTransaction < 0)
            System.out.println("Your last transaction was a withdrawal of " + Math.abs(lastTransaction));
        else
            System.out.println("Your last transaction was a deposit of " + lastTransaction);


        DoNext();
    }

    public void DoNext(){
        System.out.print("1 - Make deposit\n2 - Make withdrawal\n3 - View balance\n4 - Calculate interest\n5 - Last transaction\n6 - Exit\nWhat would you like to do next?: ");
        Scanner Input5 = new Scanner(System.in);
        int doNext = Input5.nextInt();
        switch(doNext){
            case 1:
                Deposit();break;
            case 2:
                Withdrawal();break;
            case 3:
                GetBalance();break;
            case 4:
                CalculateInterest();break;
            case 5:
                PreviousTransaction();break;
            case 6:
                System.out.println("Thank you " + firstName + " please come again");break;
            default:
                System.out.println("Please enter valid choice"); DoNext();
        }
    }
    public static void StartFunction(){
        System.out.println("Would you like to log on to your account?: ");
        Scanner in = new Scanner(System.in);
        String intro = in.nextLine();

        if(intro.toUpperCase().equals("YES"))
            new BankApp();
        else if(intro.toUpperCase().equals("NO"))
            System.out.println("Thank you please come again");
        else {
            System.out.println("Please enter either yes or no");
            StartFunction();
        }

    }

    public static void main(String[] args) {
        StartFunction();

    }
}


