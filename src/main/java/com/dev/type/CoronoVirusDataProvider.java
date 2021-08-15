package com.dev.type;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class CoronoVirusDataProvider {

    private Boolean success;
    private ZonedDateTime lastOriginUpdate;
    private ZonedDateTime lastRefreshed;
    private Data data;
}
