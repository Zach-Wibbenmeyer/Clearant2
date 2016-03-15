import static org.junit.Assert.*;
import org.junit.*;

public class InterestTestOne {
	
	// Create global variables
	double visaInterest = 10;
	double mcInterest = 5;
	double discoverInterest = 1;

	@Test
	/* TestCaseOne() - 1 person has one wallet and 3 cards.
	 * 					this test calculates the total interest
	 * 					per person and per card
	 */
	public void testCaseOne() {
		// create a variable for the total interest
		double totalInterest = 16;
		
		// calculate total interest per person
		assertEquals(totalInterest, Visa.getVisa(100), +
									MasterCard.getMasterCard(100) +
									Discover.getDiscover(100));
		// calculate interest for the visa credit card
		assertEquals(visaInterest, Visa.getVisa(100), 1);
		// calculate interest for the mastercard
		assertEquals(mcInterest, MasterCard.getMasterCard(100), 1);
		// calculate interest for the discover card
		assertEquals(discoverInterest, Discover.getDiscover(100), 1);
	}

}
