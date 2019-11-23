package com.codeinvestigator.feignclient.feignenabledbackend;

import com.codeinvestigator.feignclient.server.SpaceStation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@RestController
@RequiredArgsConstructor
public class StatusController {
private final SpaceStationClient spaceStationClient;

    @GetMapping("/status")
    public SpaceStation status(){
        return spaceStationClient.findSpaceStation(new Random().nextInt());
    }
}
