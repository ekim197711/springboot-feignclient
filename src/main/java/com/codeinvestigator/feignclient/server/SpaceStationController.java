package com.codeinvestigator.feignclient.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SpaceStationController {
    @GetMapping("/station/{stationid}")
    public SpaceStation getSpaceStation(@PathVariable  Integer stationid){
        return new SpaceStation(stationid, "My Huge spacestation for research purpose",
                new Random().nextInt(),
                new Random().nextInt());
    }
}
