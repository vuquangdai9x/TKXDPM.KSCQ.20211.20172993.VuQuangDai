import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidateAddressTest {
	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"hanoi,true",
		"ngo 254 Minh Khai Hai Ba Trung Ha Noi,true",
		"__#$Hanoi,false",
		",false",
	})
	public void test(String address, boolean expectedValue) {
		assertEquals(placeOrderController.validateAddress(address), expectedValue);
	}
}
