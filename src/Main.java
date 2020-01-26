
public class Main {

	public static void main(String[] args) {
		EmailService emailService = new SMTPGmailService();
		OrderService order = new OrderService(emailService);
		order.makeOrder();
	}

}
