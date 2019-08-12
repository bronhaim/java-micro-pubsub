package yotpo.kafka.consumer;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.kafka.test.rule.KafkaEmbedded;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

	@ClassRule
	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(2, true, 2, "messages");

	@Test
	public void contextLoads() {
	}

}
