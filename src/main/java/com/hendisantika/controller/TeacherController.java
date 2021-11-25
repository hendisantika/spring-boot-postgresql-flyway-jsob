package com.hendisantika.controller;

import com.hendisantika.entity.Review;
import com.hendisantika.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql-flyway-jsob
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/11/21
 * Time: 18.30
 */
@RestController
public class TeacherController {

    @Autowired
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/teachers/{id}/review")
    public ResponseEntity addReview(@RequestBody Review review, @PathVariable("id") String teacherID) {
        try {
            teacherService.addReview(teacherID, review);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
