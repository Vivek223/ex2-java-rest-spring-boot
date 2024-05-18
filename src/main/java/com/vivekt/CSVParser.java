package com.vivekt;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

//@AllArgsConstructor
public class CSVParser {
    private String csvFile;

    public CSVParser(String csvFile) {
        this.csvFile = csvFile;
    }

    public List<String[]> parse() throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Path.of(this.csvFile));
        CSVReader csvReader = new CSVReader(reader);
        return csvReader.readAll();

    }
}
