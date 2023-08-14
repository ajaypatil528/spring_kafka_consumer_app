package in.ajay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.ajay.constants.AppConstants;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = "my_orders_topic")
	public void subscribeMsg(String order) {
		System.out.println("**** Message Received from Kafka **** :: ");
		System.out.println(order);
	}

}
