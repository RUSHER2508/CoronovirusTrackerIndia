package com.dev.service;

import com.dev.type.CoronoVirusDataProvider;
import com.dev.type.Regional;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Collectors;

@Component
public class CoronovirusTrackerDataProvider {

    private String url = "https://api.rootnet.in/covid19-in/stats/latest";

    @Autowired
    RestTemplate restTemplate;

    public Regional getData(String state){
        CoronoVirusDataProvider data = restTemplate.getForObject(url, CoronoVirusDataProvider.class);
        return  data.getData().getRegional().stream().filter(stateInformation -> stateInformation.getLoc().equalsIgnoreCase(state)).findAny().orElse(new Regional());
    }

}
