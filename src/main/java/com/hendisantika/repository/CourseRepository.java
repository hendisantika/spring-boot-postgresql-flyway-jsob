package com.hendisantika.repository;

import com.hendisantika.entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql-flyway-jsob
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/11/21
 * Time: 18.04
 */
public interface CourseRepository extends CrudRepository<Course, UUID> {
}
