package com.dev.type;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Data {

    private List<Regional> regional;
    private Summary summary;
    private List<UnofficialSummary> unofficialSummary;

}
