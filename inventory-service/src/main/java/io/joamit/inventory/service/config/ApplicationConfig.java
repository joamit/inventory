package io.joamit.inventory.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"io.joamit.inventory"})
public class ApplicationConfig {

    /**
     * BELOW CODE SHOULD BE UNCOMMENTED ONLY WHEN YOU WANT TO POPULATE DATABASE
     * TYPICALLY DURING FIRST RUN
     */

    /*

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserProviderRepository userProviderRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void whenApplicationReady() {
        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        objectMapper.setDateFormat(df);
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            User[] users = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("users.json"), User[].class);
            Arrays.stream(users).forEach(user -> {
                userProviderRepository.save(user.getUserProvider());
                userRepository.save(user);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
