package com.dev.type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Summary {

   private Integer confirmedButLocationUnidentified;

    private Integer confirmedCasesForeign;

    private Integer confirmedCasesIndian;

    private Integer deaths;

    private Integer discharged;

    private Integer total;
}
