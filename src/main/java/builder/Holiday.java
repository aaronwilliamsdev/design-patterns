package builder;

public class Holiday {

    private final String arrival;
    private final String departing;
    private final String destination;
    private final String resort;

    private Holiday(Builder builder) {
        this.arrival = builder.arrival;
        this.departing = builder.departing;
        this.destination = builder.destination;
        this.resort = builder.resort;
    }

    @Override
    public String toString() {
        return String.format("Your booking at %s in %s is booked! You will stay %s to %s",
                this.resort, this.destination, this.arrival, this.departing);
    }

    public static class Builder {
        private String arrival;
        private String departing;
        private String destination;
        private String resort;

        public Builder() {}

        public Holiday build() {
            return new Holiday(this);
        }

        public Builder setArrival(String arrival) {
            this.arrival = arrival;
            return this;
        }

        public Builder setDeparting(String departing) {
            this.departing = departing;
            return this;
        }
        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setResort(String resort) {
            this.resort = resort;
            return this;
        }

    }


}
