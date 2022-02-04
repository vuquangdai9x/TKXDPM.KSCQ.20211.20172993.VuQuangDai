package utils;

import entity.order.Order;

public interface ShippingFeeCalculator {
	int calculateShippigFee(Order order);
}
