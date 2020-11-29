package models;

public class TestCase {
    public TestCase with;

    private String title;
    private int estimate;
    private String reference;


    public static class Builder {

        private TestCase newTestCase;
        //constructor
        public Builder() {
            newTestCase = new TestCase();
        }

        public Builder withTitle(String title) {
            newTestCase.title = title;

            return this;
        }
        public Builder withEstimate(int estimate) {
            newTestCase.estimate = estimate;

            return this;
        }
        public Builder withReference(String reference) {
            newTestCase.reference = reference;

            return this;
        }



        public TestCase build() {
            return newTestCase;
        }
    }
}
