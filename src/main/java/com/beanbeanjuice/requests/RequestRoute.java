package com.beanbeanjuice.requests;

import org.jetbrains.annotations.NotNull;

/**
 * A static class for the endpoints of the Kawaii API.
 *
 * @author beanbeanjuice
 * @since v1.0.0
 * @see <a href="https://docs.kawaii.red/request-structure">Kawaii API Endpoints</a>
 */
public enum RequestRoute {

    TEXT("txt"),
    IMAGE("png"),
    GIF("gif"),
    STATS("stats");

    private String apiLink = "https://kawaii.red/api/{endpoint}/{type}/token={token}";
    private final String endpoint;

    /**
     * Creates a new {@link RequestRoute} object.
     * @param endpoint The {@link String endpoint} link.
     */
    RequestRoute(@NotNull String endpoint) { this.endpoint = endpoint; }

    /**
     * @return The {@link String link} for the endpoint.
     */
    @NotNull
    public String getLink() {
        return apiLink.replace("{endpoint}", endpoint);
    }

}
