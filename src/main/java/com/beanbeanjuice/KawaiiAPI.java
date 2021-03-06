package com.beanbeanjuice;

import com.beanbeanjuice.endpoint.GifEndpoint;
import org.jetbrains.annotations.NotNull;

/**
 * A class used for the {@link KawaiiAPI}.
 *
 * @author beanbeanjuice
 * @since 1.1.1
 */
public class KawaiiAPI {

    public GifEndpoint GIF;

    /**
     * Create a new {@link KawaiiAPI} object.
     * @param token The {@link String token} for keeping track of statistics.
     * @see <a href="https://docs.kawaii.red/tutorials/token">Token</a>
     * @see <a href="https://docs.kawaii.red/">Kawaii API Documentation</a>
     */
    public KawaiiAPI(@NotNull String token) {
        initialiseEndPoints(token);
    }

    /**
     * Create a new, anonymous, {@link KawaiiAPI} object.
     * @see <a href="https://docs.kawaii.red/tutorials/token">Token</a>
     * @see <a href="https://docs.kawaii.red/">Kawaii API Documentation</a>
     */
    public KawaiiAPI() {
        initialiseEndPoints("anonymous");
    }

    private void initialiseEndPoints(@NotNull String token) {
        GIF = new GifEndpoint(token);
    }

}
