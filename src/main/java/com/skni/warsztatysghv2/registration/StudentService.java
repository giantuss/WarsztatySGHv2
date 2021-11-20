package com.skni.warsztatysghv2.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private UUIDStudentIdGenerator studentIdGenerator;

    @Autowired
    public void setUUIDStudentIdGenerator(UUIDStudentIdGenerator studentIdGenerator) {this.studentIdGenerator = studentIdGenerator;}

    private  StatusService statusService;

    @Autowired
    public void setStatusService(StatusService statusService) {this.statusService = statusService;}

    private ApplicationService applicationService;

    @Autowired
    public  void setApplicationService(ApplicationService applicationService) {this.applicationService = applicationService;}

    public void printStudent() {
        Student student = create(applicationService.createMock());
        System.out.println(student);
    }

    public void saveStudent(){

    }

    public Student create(Application application) {
        String id = studentIdGenerator.getNext();
        String firstName = application.getFirstName();
        String lastName = application.getLastName();
        String email = application.getEmail();
        Status status = statusService.randomStatus();
        return new Student(id, firstName, lastName, email, status); // new allowed here
    }

}
