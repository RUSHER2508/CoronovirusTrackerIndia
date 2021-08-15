package com.dev.service;

import com.dev.type.AlertStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Component
public class AlertService {

    @Autowired
    private CoronovirusTrackerDataProvider coronovirusTrackerDataProvider;

    public AlertStatus getAlertAboutState(String state){

        AlertStatus alertStatus = new AlertStatus();
        Integer totalconfirm = coronovirusTrackerDataProvider.getData(state).getTotalConfirmed();
        Integer totalDischarge = coronovirusTrackerDataProvider.getData(state).getDischarged();

        if ((totalconfirm - totalDischarge) < 1000){
            alertStatus.setStatus("Green");
            alertStatus.setMeasuresTaken(Arrays.asList("No lockdown","Wear masks"));
            alertStatus.setSummary(coronovirusTrackerDataProvider.getData(state));
        }
        else if ((totalconfirm - totalDischarge)>1000  && (totalconfirm - totalDischarge)<10000){

            alertStatus.setStatus("Orange");
            alertStatus.setMeasuresTaken(Arrays.asList("Timing based lockdown","Only Essentials allowed","Wear masks"));
            alertStatus.setSummary(coronovirusTrackerDataProvider.getData(state));

        }
        else {
            alertStatus.setStatus("Red");
            alertStatus.setMeasuresTaken(Arrays.asList("Complete lockdown","Wear masks"));
            alertStatus.setSummary(coronovirusTrackerDataProvider.getData(state));
        }
        return  alertStatus;
    }

}
