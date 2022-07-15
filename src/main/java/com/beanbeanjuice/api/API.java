package com.beanbeanjuice.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.jetbrains.annotations.NotNull;

/**
 * An interface used for API requests.
 *
 * @author beanbeanjuice
 * @since v1.0.0
 */
public class API {

    protected final String apiKey;

    public API(@NotNull String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * Retrieve a {@link String link} from a {@link JsonNode}.
     * @param node The node to retrive the {@link String link} from.
     * @return The {@link String URL} link.
     */
    protected String getLink(@NotNull JsonNode node) {
        return node.get("response").asText();
    }

}
