<<<<<<< HEAD
package com.skni.warsztatysghv2.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final UUIDStudentIdGenerator studentIdGenerator;
    private final StatusService statusService;
    private final ApplicationFormService applicationFormService;
    private final FileSaver fileSaver;


    @Autowired
    public StudentService(
            UUIDStudentIdGenerator studentIdGenerator,
            StatusService statusService,
            ApplicationFormService applicationFormService,
            FileSaver fileSaver
            ) {
        this.studentIdGenerator = studentIdGenerator;
        this.statusService = statusService;
        this.applicationFormService = applicationFormService;
        this.fileSaver = fileSaver;
    }

    public void printStudent() {
        Student student = create(applicationFormService.createMock());
        fileSaver.saveToFile(student);
        System.out.println(student);
    }

    public Student create(ApplicationForm applicationForm) {
        String id = studentIdGenerator.getNext();
        String firstName = applicationForm.getFirstName();
        String lastName = applicationForm.getLastName();
        String email = applicationForm.getEmail();
        Status status = statusService.randomStatus();
        return new Student(id, firstName, lastName, email, status); // new allowed here
    }

}
=======
package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final UUIDStudentIdGenerator studentIdGenerator;

    public StudentService(UUIDStudentIdGenerator studentIdGenerator){
        this.studentIdGenerator = studentIdGenerator;
    }

    private final StatusService statusService;

    public StudentService(StatusService statusService) {this.statusService = statusService;}

    private final ApplicationFormService applicationFormService;

    public StudentService(ApplicationForm applicationForm) {this.applicationFormService = applicationForm;}

    public void printStudent() {
        Student student = create(applicationFormService.createMock());
        System.out.println(student);
    }

    public Student create(ApplicationForm applicationForm) {
        String id = studentIdGenerator.getNext();
        String firstName = applicationForm.getFirstName();
        String lastName = applicationForm.getLastName();
        String email = applicationForm.getEmail();
        Status status = statusService.randomStatus();
        return new Student(id, firstName, lastName, email, status); // new allowed here
    }

}
>>>>>>> origin/master
