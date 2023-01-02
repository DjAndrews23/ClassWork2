import java.util.Random;
import java.util.Scanner;

class EmailApplication {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String emailAddress;
    private Integer mailBoxCapacity = 1000;

    public EmailApplication(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        setEmail();
    }

    public String setEmail() {

        System.out.println("Thank you"+ " " + firstName + " " + "Enter your department: ");
        Scanner Input3 = new Scanner(System.in);
        String department = Input3.nextLine();

        String email = firstName + "_" + lastName + "_" + department + "@Gmail.com";

        System.out.println("Your new email address is " + email);

        this.department = department;
        this.emailAddress = email;

        setRandomPassword(email);

        return email;
    }

    public String setRandomPassword(String email) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String combination = letters + numbers;
        int len = 10;
        char[] tempPassword = new char[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            tempPassword[i] = combination.charAt(random.nextInt(combination.length()));
        }
        System.out.println("Your generated password is " + new String(tempPassword) +" please store this in a safe place.");

        String password = String.valueOf(tempPassword);

        this.password = password;

        return password;
    }

    public String changePassword(){
        System.out.println("Please enter your new password: ");
        Scanner Input3 = new Scanner(System.in);
        String newPassword = Input3.nextLine();

        this.password =newPassword;

        System.out.println("Your new password is " + newPassword + " please store this in a safe place.");

        return newPassword;
    }

    public String getName(){
        String displayName = firstName + " " + lastName;
        System.out.println("The employee's name is " + displayName);
        return displayName;
    }

    public String getEmailAddress(){

        System.out.println("The employee's email is " + emailAddress);
        return emailAddress;
    }

    public Integer getMailBoxCapacity(){

        System.out.println("The email's mailbox capacity is " + mailBoxCapacity);
        return mailBoxCapacity;
    }




    public static void main(String[] args) {
        EmailApplication email1 = new EmailApplication("John","Smith");

        email1.getMailBoxCapacity();
        email1.getName();
        email1.getEmailAddress();
        email1.changePassword();

    }
}