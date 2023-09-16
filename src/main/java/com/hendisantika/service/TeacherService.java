package com.hendisantika.service;

import com.hendisantika.entity.Review;
import com.hendisantika.entity.Teacher;
import com.hendisantika.repository.TeacherRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql-flyway-jsob
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/11/21
 * Time: 18.27
 */
@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void addReview(String teacherID, Review review) {
        Objects.requireNonNull(teacherID);
        Objects.requireNonNull(review);

        Teacher teacher = teacherRepository
                .findById(UUID.fromString(teacherID))
                .orElseThrow(() -> new EntityNotFoundException(teacherID));

        review.setDate(LocalDate.now());

        if (teacher.getReviews() == null) {
            teacher.setReviews(new ArrayList<>());
        }

        teacher.getReviews().add(review);
        teacherRepository.save(teacher);
    }
}
