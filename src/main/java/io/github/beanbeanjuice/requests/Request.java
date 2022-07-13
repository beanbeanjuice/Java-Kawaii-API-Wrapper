package io.github.beanbeanjuice.requests;

import com.fasterxml.jackson.databind.JsonNode;
import org.jetbrains.annotations.NotNull;

/**
 * A class containing the request's {@link Integer status code} and resulting {@link JsonNode data}.
 *
 * @author beanbeanjuice
 * @since v1.0.0
 */
public class Request {

    private final Integer statusCode;
    private final JsonNode data;

    /**
     * Creates a new {@link Request} object.
     * @param statusCode The resulting {@link Integer status code}.
     * @param data The {@link JsonNode data} retrieved from the {@link Request}.
     */
    public Request(@NotNull Integer statusCode, @NotNull JsonNode data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    /**
     * @return The {@link Request Request's} {@link Integer status code}.
     */
    @NotNull
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * @return The {@link Request Request's} {@link JsonNode data}.
     */
    @NotNull
    public JsonNode getData() {
        return data;
    }

}
