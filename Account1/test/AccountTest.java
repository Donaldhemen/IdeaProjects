import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AccountTest {

    private Account myAccount;

    @BeforeEach
    public void resetBalanceToZero() {
        myAccount = new Account();
    }

    @Test
    public void show_thatICanDeposit_5kInMyAccount(){
        myAccount.deposit(5000);
        assertEquals(5000, myAccount.getBalance());
    }

    @Test
    public void cannotDeposit_negativeAmount() {
        myAccount.deposit(-5000);
        assertEquals(0, myAccount.getBalance());
    }
    @Test
    public void canWithdraw() {
        myAccount.deposit(5000);
        myAccount.withdraw(2000);
        assertEquals(3000, myAccount.getBalance());
    }
    @Test
    public void cannotWithdrawNegativeAmount() {
        myAccount.deposit(5000);
        myAccount.withdraw(-2000);
        assertEquals(5000, myAccount.getBalance());
    }
    @Test
    public void cannotWithdraw_moreThanBalance() {
        myAccount.deposit(5000);
        myAccount.withdraw(7000);
        assertEquals(5000, myAccount.getBalance());
    }
}