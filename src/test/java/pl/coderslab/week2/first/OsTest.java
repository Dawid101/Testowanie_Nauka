package pl.coderslab.week2.first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class OsTest {

    @Test
    void systemTest() {
        String windows = "Windows";
        String linux = "Linux";

        assumeTrue(System.getProperty("os.name").contains(windows));
        assumeTrue(System.getProperty("os.name").contains(linux));

    }
}
