import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConfigDI.xml");
		//EmailService emailService = context.getBean("myService", EmailService.class);//new SMTPGmailService();
		OrderService order = context.getBean("myOrder", OrderService.class);//new OrderService(emailService);
		order.makeOrder();
		
		context.close();
	}

}
