package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class UUIDStudentIdGenerator {
    public String getNext() {
        return UUID.randomUUID().toString();
    }
}
