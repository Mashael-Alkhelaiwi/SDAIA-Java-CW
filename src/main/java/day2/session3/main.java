package day2.session3;

public class main
{
    public static void main(String[] args)
    {
        Account account = new Account("Mashael",50000);

        System.out.println("your balance: "+account.getBalance());

        account.deposit(1000);
        account.withdraw(3000);

        System.out.println(account.toString());
    }
}
