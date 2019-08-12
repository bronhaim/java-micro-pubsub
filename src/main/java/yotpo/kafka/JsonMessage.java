package yotpo.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMessage {
    private final String message;
    private final int identifier;

    public JsonMessage(@JsonProperty("message") final String message,
                       @JsonProperty("identifier") final int identifier) {
        this.message = message;
        this.identifier = identifier;
    }

    public String getMessage() {
        return message;
    }

    public int getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "PracticalAdvice::toString() {" +
                "message='" + message + '\'' +
                ", identifier=" + identifier +
                '}';
    }
}