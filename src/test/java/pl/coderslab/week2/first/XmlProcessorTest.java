package pl.coderslab.week2.first;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class XmlProcessorTest {

    XmlProcessor xmlProcessor = new XmlProcessor();

    @Test
    void testWithTimeout() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            xmlProcessor.processXmlFiles("");
        });
    }

}