package net.snipersoft.appenginedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    public VersionController(@Value("#{environment.APP_VERSION ?: 'undefined_version'}") String version) {
        this.version = version;
    }

    private final String version;

    @GetMapping("/version")
    public String showVersion() {
        return version;
    }
}
