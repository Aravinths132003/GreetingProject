import org.example.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest
{
    @Test
    public void testWithdraw()
    {
        System.out.println("Testing Window");
        double balance=4000;
        double amountwithdraw=2000;
        SavingsAccount sav=new SavingsAccount(balance);
        Assertions.assertTrue(sav!=null);
        System.out.println("Object created..");
        sav.withdraw(amountwithdraw);
        double expectedBalance=balance-amountwithdraw;
        Assertions.assertEquals(expectedBalance,sav.getBalance());
        System.out.println("Withdraw passed");
        sav.getBalance();
        System.out.println("Tested withdraw");
    }
}
