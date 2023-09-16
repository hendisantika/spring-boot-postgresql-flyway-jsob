package com.hendisantika.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql-flyway-jsob
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/11/21
 * Time: 17.59
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends EntityWithUUID {
    private String name;
    private String pictureURL;
    private String email;

    @Convert(attributeName = "jsonb", converter = JsonBinaryType.class)
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<Review> reviews;

}
