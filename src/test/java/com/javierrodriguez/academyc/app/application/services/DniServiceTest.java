package com.javierrodriguez.academyc.app.application.services;

import com.javierrodriguez.academyc.app.application.services.IDniService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class DniServiceTest {

    @Autowired
    private IDniService dniService;

    @Test
    public void ShouldTrueWhenEmailIsCorrect()
    {
        String dni="44865710R";
        Boolean result = dniService.checkDni(dni);
        assertTrue(result);
    }

}
