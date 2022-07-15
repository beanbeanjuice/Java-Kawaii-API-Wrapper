package com.beanbeanjuice;

import com.beanbeanjuice.endpoint.GifEndpoint;
import org.jetbrains.annotations.NotNull;

/**
 * A class used for the KawaiiAPI
 *
 * @author beanbeanjuice
 * @since v1.0.0
 */
public class KawaiiAPI {

    public GifEndpoint GIF;

    /**
     * Create a new {@link KawaiiAPI} object.
     * @param token The {@link String token} for keeping track of statistics. Can be "anonymous".
     * @see <a href="https://docs.kawaii.red/tutorials/token">Token</a>
     * @see <a href="https://docs.kawaii.red/">Kawaii API Documentation</a>
     */
    public KawaiiAPI(@NotNull String token) {
        GIF = new GifEndpoint(token);
    }

}
