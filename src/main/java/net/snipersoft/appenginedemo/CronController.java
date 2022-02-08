package net.snipersoft.appenginedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/cron")
public class CronController {
    private final List<Instant> executions = new ArrayList<>();

    @GetMapping("/execute")
    public String execute() {
        executions.add(Instant.now());
        return "OK";
    }

    @GetMapping("/logs")
    public List<Instant> logs() {
        return executions;
    }
}
