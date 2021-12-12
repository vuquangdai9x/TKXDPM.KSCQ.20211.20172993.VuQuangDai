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
		"0173847593,true",
		"23524.35124,false",
		"20172993,false",
		"fhs383rui2,false",
		"9328941248214,false"
	})
	public void test(String phoneNumber, boolean expectedValue) {
		assertEquals(placeOrderController.validatePhoneNumber(phoneNumber), expectedValue);
	}

}
