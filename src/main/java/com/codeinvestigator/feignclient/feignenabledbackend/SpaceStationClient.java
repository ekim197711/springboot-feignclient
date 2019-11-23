package com.codeinvestigator.feignclient.feignenabledbackend;

import com.codeinvestigator.feignclient.server.SpaceStation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="spacestation", url="http://localhost:8080")
public interface SpaceStationClient {

    @RequestMapping(value="/station/{stationid}", method = RequestMethod.GET)
    public SpaceStation findSpaceStation(@PathVariable Integer stationid);
}
