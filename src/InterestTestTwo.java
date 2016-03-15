import static org.junit.Assert.*;
import org.junit.*;

public class InterestTestTwo {

	@Test
	/* testCaseTwo() - calculates the interest per person and per two wallets*/
	public void testCaseTwo() {
		// create variable for total interest
		double totalInterest = 16;
		// create variable for the interest in the first wallet
		double walletOneInterest = 11;
		// create variable for the interest in the second wallet
		double walletTwoInterest = 5;
		
		// calculate the total interest for the person
		assertEquals(totalInterest, Visa.getVisa(100) +
				    				MasterCard.getMasterCard(100) +
				    				Discover.getDiscover(100), 1);
		// calculate the interest for the first wallet
		assertEquals(walletOneInterest, Visa.getVisa(100) +
				 						Discover.getDiscover(100), 1);
		// calculate the interest for the second wallet
		assertEquals(walletTwoInterest, MasterCard.getMasterCard(100), 1);
	}

}
