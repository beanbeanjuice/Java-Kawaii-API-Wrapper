package com.beanbeanjuice.endpoint;

import com.beanbeanjuice.api.API;
import com.beanbeanjuice.requests.Request;
import com.beanbeanjuice.requests.RequestBuilder;
import com.beanbeanjuice.requests.RequestRoute;
import org.jetbrains.annotations.NotNull;

/**
 * A class used for the GIF endpoint.
 *
 * @author beanbeanjuice
 * @since v1.0.0
 */
public class GifEndpoint extends API {

    /**
     * Creates a new {@link GifEndpoint} class.
     * @param apiKey The {@link String apiKey} to make requests.
     */
    public GifEndpoint(@NotNull String apiKey) {
        super(apiKey);
    }

    /**
     * Get a random GIF image for the prompt.
     * @param prompt The {@link String prompt} specified.
     * @return The {@link String link} to the gif.
     * @see <a href="https://docs.kawaii.red/endpoints/gif">Available Prompts</a>
     */
    @NotNull
    public String getGIF(@NotNull String prompt) {
        Request request = new RequestBuilder(RequestRoute.GIF)
                .setAuthorization(apiKey)
                .setParameter(prompt)
                .build();

        return getLink(request.getData());
    }

}
