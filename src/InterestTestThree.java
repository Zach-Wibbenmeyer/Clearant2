import static org.junit.Assert.*;
import org.junit.*;

public class InterestTestThree {

	@Test
	/* testCaseThree() - calculates the interest for two people
	 * 					and two different wallets
	 */
	public void testCaseThree() {
		// create variables for each peron's interest
		double personOneInterest = 16;
		double personTwoInterest = 15;
		// create variables for each wallet's interest
		double walletOneInterest = 16;
		double walletTwoInterest = 16;
		
		// calculate interest  for the first person
		assertEquals(personOneInterest, Visa.getVisa(100) +
				    					MasterCard.getMasterCard(100) +
				    					Discover.getDiscover(100), 1);
		// calculate the interest for the second person
		assertEquals(personTwoInterest, Visa.getVisa(100) +
										MasterCard.getMasterCard(100), 1);
		// calculate the interest for the first wallet
		assertEquals(walletOneInterest, Visa.getVisa(100) +
										MasterCard.getMasterCard(100) +
										Discover.getDiscover(100), 1);
		// calculate the interest for the second wallet
		assertEquals(walletTwoInterest, Visa.getVisa(100) +
										MasterCard.getMasterCard(100), 1);
	}

}
