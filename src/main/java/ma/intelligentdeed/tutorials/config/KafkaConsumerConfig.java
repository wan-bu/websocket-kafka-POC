package ma.intelligentdeed.tutorials.config;

//@EnableKafka
//@Configuration
public class KafkaConsumerConfig {

//	@Value(value = "${spring.kafka.bootstrap-servers}")
//	private String bootstrapAddress;
//
//	@Value(value = "${spring.kafka.consumer.group-id}")
//	private String groupId;
//
//	@Bean
//	public ConsumerFactory<String, PositionDTO> consumerFactory() {
//		Map<String, Object> props = new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//		props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//
//		return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(),
//				new JsonDeserializer<>(PositionDTO.class));
//	}
//
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<String, PositionDTO> kafkaListenerContainerFactory() {
//		ConcurrentKafkaListenerContainerFactory<String, PositionDTO> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		return factory;
//	}

}