package application.interbank;

public interface InterbankInterface {
	/**
	 * Send request to the interbank to pay for an order, using credit card.
	 * @param cardInfo the object store information about user's credit card.
	 * @param content user's message when pay order.
	 * @param amount total amount user have to pay for the order.
	 * @return transaction result
	 * @throws ServerErrorException thrown when there are error in the interbank server
	 * @throws NotEnoughBalanceException thrown when user don't have enough money to pay the order
	 * @throws InvalidCardException thrown when user input he wrong card info
	 */
	public PaymentTransaction payOrder(CreditCard cardInfo, String content, double amount)
	throws Exception;
}
