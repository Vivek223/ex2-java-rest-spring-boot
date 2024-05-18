package com.vivekt;

import com.opencsv.exceptions.CsvException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CSVParserTest {

    @Test
    public void when_CSVParserIsInvoked_ItReturnsANonNullResult() throws IOException, CsvException {
        //Arrange
        String csvFile = "D:\\2024\\github\\it4\\ex2-java-rest-spring-boot\\src\\test\\resources\\test1.csv";
        CSVParser csvParser = new CSVParser(csvFile);
        Integer actualRowCount = 4;
        //Act
        List<String[]> csvListArray = csvParser.parse();

        //Assert
        Assertions.assertEquals(actualRowCount, csvListArray.size());
    }
}
