package io.joamit.inventory.service.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.joamit.inventory.domain.misc.Distributor;
import io.joamit.inventory.domain.misc.Manufacturer;
import io.joamit.inventory.domain.misc.SiPrefix;
import io.joamit.inventory.domain.misc.Unit;
import io.joamit.inventory.domain.project.Project;
import io.joamit.inventory.domain.storage.StorageLocation;
import io.joamit.inventory.domain.user.User;
import io.joamit.inventory.service.repository.misc.DistributorRepository;
import io.joamit.inventory.service.repository.misc.ManufacturerRepository;
import io.joamit.inventory.service.repository.misc.SiPrefixRepository;
import io.joamit.inventory.service.repository.misc.UnitRepository;
import io.joamit.inventory.service.repository.project.ProjectRepository;
import io.joamit.inventory.service.repository.storage.StorageLocationRepository;
import io.joamit.inventory.service.repository.user.UserProviderRepository;
import io.joamit.inventory.service.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = {"io.joamit.inventory"})
public class ApplicationConfig {

    /**
     * BELOW CODE SHOULD BE UNCOMMENTED ONLY WHEN YOU WANT TO POPULATE DATABASE
     * TYPICALLY DURING FIRST RUN
     */


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserProviderRepository userProviderRepository;
    @Autowired
    private SiPrefixRepository siPrefixRepository;
    @Autowired
    private UnitRepository unitRepository;
    @Autowired
    private StorageLocationRepository storageLocationRepository;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ManufacturerRepository manufacturerRepository;
    @Autowired
    private DistributorRepository distributorRepository;

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
            SiPrefix[] siPrefixes = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("si-prefixes.json"), SiPrefix[].class);
            siPrefixRepository.save(Arrays.asList(siPrefixes));

            Unit[] units = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("units.json"), Unit[].class);
            unitRepository.save(Arrays.asList(units));

            StorageLocation[] storageLocations = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("storage-locations.json"), StorageLocation[].class);
            storageLocationRepository.save(Arrays.asList(storageLocations));

            Distributor[] distributors = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("distributors.json"), Distributor[].class);
            distributorRepository.save(Arrays.asList(distributors));

            Manufacturer[] manufacturers = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("manufacturers.json"), Manufacturer[].class);
            manufacturerRepository.save(Arrays.asList(manufacturers));

            Project[] projects = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("projects.json"), Project[].class);
            projectRepository.save(Arrays.asList(projects));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
