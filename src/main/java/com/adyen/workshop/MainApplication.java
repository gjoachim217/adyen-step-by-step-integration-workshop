package com.adyen.workshop;

import com.adyen.workshop.configurations.ApplicationConfiguration;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    private final ApplicationConfiguration applicationConfiguration;

    public MainApplication(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("\n----------------------------------------------------------\n\t" +
                "Application is running on http://localhost:" + applicationConfiguration.getServerPort() +
                "\nAdyen API Key: " + (applicationConfiguration.AQFDhmfxLorKbRRAw0m/n3Q5qf3VaY9UCJ16aExb1nSuk2NFisZiGclvMiVgB/7xzYuhmDgJP7cd2UtN0Sh2y3YYVhxAthDBXVsNvuR83LVYjEgiTGAH-LTIFbRELUH7Z9DVBUTvHZkdTPWTCEsTvgJRKnKOGTCo=-i1i*:N*rVV{~6P+eQsK() != null) +
                "\nAdyen Merchant Account: " + (applicationConfiguration.Merchant account: AdyenPPImplementationTrainingTest_SlalomAtlanta_TEST() != null) +
                "\nAdyen Client Key:" + (applicationConfiguration.test_GB3JL2RM25FDLABUA5M7NM2PFMCT7B7V() != null) +
                "\n----------------------------------------------------------");
    }
}
