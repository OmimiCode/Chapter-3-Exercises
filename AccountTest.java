import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account profile1 = new Account();
        Account profile2 = new Account();
        Scanner input =  new Scanner(System.in);

        System.out.println("initial account name for profile1 : " +  profile1.getName() );

        System.out.println("initial account name for profile2 : " +  profile2.getName() );

        System.out.println("WELCOME TO THIS NEW ACCOUNT, KINDLY SET A NAME");
        profile1.setName(input.nextLine());
        profile2.setName( input.nextLine());

        System.out.println("new account name for profile 1 : " +  profile1.getName() );
        System.out.println("new account name for profile 2 : " +  profile2.getName() );


//
//        System.out.println("initial account number  for profile1 : " +  profile1.getAccountNumber() );
//
//        System.out.println("initial account number  for profile2 : " +  profile2.getAccountNumber() );
//
//        profile1.setAccountNumber("013099228271");
//        profile2.setAccountNumber("01309922872");
//
//
//
//        System.out.println("new account name for profile 1 : " +  profile1.getAccountNumber());
//        System.out.println("new account name for profile 2 : " +  profile2.getAccountNumber());
//
//
//        System.out.printf("%s%n%s%n%s%n%s%n", profile1.getName(),profile1.getAccountNumber(), profile2.getName(), profile2.getAccountNumber());
//
//        System.out.println("profile 1 balance :" + profile1.getBalance() );
//        System.out.println("profile 2 balance :" + profile2.getBalance() );
//
//
//
//        profile1.setBalance(223.544);
//        profile2.setBalance(150);
//
//
//        System.out.println("profile 1 balance :" + profile1.getBalance() );
//        System.out.println("profile 2 balance :" + profile2.getBalance() );
//


    }




}
