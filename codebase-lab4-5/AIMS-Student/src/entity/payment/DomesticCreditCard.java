package entity.payment;

public class DomesticCreditCard extends PaymentCard {
	private String issuringBank;
	private String cardNumber;
	private String cardholderName;
	private String validFromDate;
	
	public DomesticCreditCard(String issuringBank, String cardNumber, String cardholderName, String validFromDate) {
		super();
		this.issuringBank = issuringBank;
		this.cardNumber = cardNumber;
		this.cardholderName = cardholderName;
		this.validFromDate = validFromDate;
	}
}
