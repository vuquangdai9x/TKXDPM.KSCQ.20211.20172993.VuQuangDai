import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidatePhoneNumberTest {
	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"0123865393,true",
		"68435.12454,false",
		"20167995,false",
		"fasfasf242,false",
		"632478261494,false"
	})
	public void test(String phoneNumber, boolean expectedValue) {
		assertEquals(placeOrderController.validatePhoneNumber(phoneNumber), expectedValue);
	}

}
