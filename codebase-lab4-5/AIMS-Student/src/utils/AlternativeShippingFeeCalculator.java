package utils;

import java.util.Random;

import entity.order.Order;
import entity.order.OrderMedia;

public class AlternativeShippingFeeCalculator implements ShippingFeeCalculator {

	@Override
	public int calculateShippigFee(Order order) {
		float sumWeight = 0;
		for (Object obj : order.getlstOrderMedia()) {
			OrderMedia orderMedia = (OrderMedia) obj;
			float altWeight = (orderMedia.getMedia().getLength() * orderMedia.getMedia().getHeight() 
					* orderMedia.getMedia().getWidth())/6000;
			sumWeight = orderMedia.getMedia().getWeight() + altWeight;
		}
        int fees = (int) sumWeight;
        return fees;
	}
}
