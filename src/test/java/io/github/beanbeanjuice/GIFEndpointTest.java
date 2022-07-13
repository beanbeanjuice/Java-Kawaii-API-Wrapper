package io.github.beanbeanjuice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GIFEndpointTest {

    @Test
    @DisplayName("Test Gif Endpoint")
    public void testGifEndpoint() {
        KawaiiAPI kawaiiAPI = new KawaiiAPI("anonymous");
        Assertions.assertTrue(kawaiiAPI.GIF.getGIF("hug").startsWith("https://api.kawaii.red/gif/hug/"));
        Assertions.assertThrows(NullPointerException.class, () -> {
            kawaiiAPI.GIF.getGIF("bruh");
        });
    }

}
