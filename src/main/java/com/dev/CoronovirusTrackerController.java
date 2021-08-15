package com.dev;

import com.dev.service.AlertService;
import com.dev.type.AlertStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoronovirusTrackerController {

    @Autowired
    AlertService alertService;

    @GetMapping("/getStateData/{state}")
    public AlertStatus getAlert(@PathVariable String state){
        return alertService.getAlertAboutState(state);
    }
}
