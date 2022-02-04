package utils;

import java.util.Random;

import entity.order.Order;

public class StandardShippingFeeCalculator implements ShippingFeeCalculator {

	@Override
	public int calculateShippigFee(Order order) {
		Random rand = new Random();
        int fees = (int)( ( (rand.nextFloat()*10)/100 ) * order.getAmount() );
        return fees;
	}
}
