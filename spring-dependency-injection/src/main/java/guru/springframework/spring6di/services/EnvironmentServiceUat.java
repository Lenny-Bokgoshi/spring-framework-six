package guru.springframework.spring6di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentServiceUat implements EnvironmentService {
    // UAT - User Acceptance Testing
    @Override
    public String getEnv() {
        return "uat";
    }
}
