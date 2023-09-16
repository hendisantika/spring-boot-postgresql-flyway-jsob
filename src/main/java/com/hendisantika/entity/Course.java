package com.hendisantika.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql-flyway-jsob
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/11/21
 * Time: 18.03
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends EntityWithUUID {

    private String name;
    private int workload;
    private short rate;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_course_teacher"))
    private Teacher teacher;
}
