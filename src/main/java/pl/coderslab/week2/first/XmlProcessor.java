package pl.coderslab.week2.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class XmlProcessor {

    Logger logger = Logger.getLogger(getClass().getName());

    public void processXmlFiles(String directoryPath) throws IOException {
        Path path = Paths.get(directoryPath);
        Files.list(path)
                .filter(filePath -> filePath.toString().endsWith(".xml"))
                .forEach(this::processXmlFile);
    }

    private void processXmlFile(Path path) throws RuntimeException {
        // Symulacja przetwarzania pliku XML
        logger.info("Processing: " + path.getFileName());
        try {
            Thread.sleep(1000); // Symulacja czasochłonnego przetwarzania
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Processing interrupted", e);
        }
        logger.info("Processed: " + path.getFileName());
    }
}
