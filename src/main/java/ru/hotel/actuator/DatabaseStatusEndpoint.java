package ru.hotel.actuator;

import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Endpoint(id = "databases")
@ConditionalOnEnabledHealthIndicator("databases")
public class DatabaseStatusEndpoint {
    @ReadOperation
    public Map<String, Status> databases() {
        return Map.of("cassandra", Status.UP);
    }
}
