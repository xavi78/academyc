package com.javierrodriguez.academyc.app.application.services.impl;

import com.javierrodriguez.academyc.app.application.services.IDniService;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class DniServiceImpl implements IDniService {
    @Override
    public Boolean checkDni(String dni) {
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        return Pattern.matches(dniRegexp, dni);

    }
}
