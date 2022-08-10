package ru.hogwarts.school.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.service.InfoService;

@Service
@Profile("test")
public class InfoServiceTest implements InfoService {

    @Value("${server.port}")
    private String port;

    public String getPort() {
        return port;
    }

    @Override
    public Integer bigInt() {
        return null;
    }

}
