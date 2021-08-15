package com.dev.type;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AlertStatus {

    private String status;
    private List<String> measuresTaken;
    private Regional summary;
}
