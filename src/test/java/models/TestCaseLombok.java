package models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

@Getter
@Setter
@Data


public class TestCaseLombok {
    private String title;
    private int estimate;
    @Singular
    private String reference;


}
