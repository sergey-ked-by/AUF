package models;

import lombok.*;

@Value
@Builder(toBuilder = true)

public class TestCaseLombokBuilder {
    @NonNull
    private String title;
    @Builder.Default
    private int estimate = 5;
    private String reference;

}
