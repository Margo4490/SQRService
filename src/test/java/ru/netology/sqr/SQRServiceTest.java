package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"square inside range, 200,400,6",
            "square under range,100,199,5",
            "square upper range,401,500,2"})

    public void shouldSQRService(String testName, int underLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrRange(underLimit, upperLimit);

        assertEquals(expected, actual);
    }

}