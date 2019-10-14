package by.epam.secondtask.reader;

import by.epam.secondtask.exception.LineReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TxtReader {
    static Logger log = LogManager.getLogger(TxtReader.class);

    public List<String> readLines (String fileName) {
        List<String> ingredients = new ArrayList<>();
        Path path = Paths.get(fileName);

        try (Stream<String> lineStream = Files.newBufferedReader(path).lines()) {
            ingredients = lineStream.collect(Collectors.toList());
        } catch (IOException e) {
            new LineReaderException ("Problem with reading from file", e);
        }
        log.info("We got information about ingredients");
        return ingredients;
    }
}