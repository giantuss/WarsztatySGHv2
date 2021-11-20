<<<<<<< HEAD
package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDStudentIdGenerator {
    public String getNext() {
        return UUID.randomUUID().toString();
    }
}
=======
package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDStudentIdGenerator {
    public String getNext() {
        return UUID.randomUUID().toString();
    }
}
>>>>>>> origin/master
