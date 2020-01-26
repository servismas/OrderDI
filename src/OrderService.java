
public class OrderService {

	private EmailService emailService;
	
	public OrderService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public void makeOrder() {
		emailService.sendMail();
		System.out.println("Ordered");
	}
}
