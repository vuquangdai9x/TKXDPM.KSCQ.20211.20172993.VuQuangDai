import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidateNameTest {
private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"daivq,true",
		"Vu Quang Dai,false",
		"daivq20172993,false",
		"_#$dai, false",
		",false"
	})
	public void test(String name, boolean expectedValue) {
		assertEquals(placeOrderController.validateName(name), expectedValue);
	}
}
