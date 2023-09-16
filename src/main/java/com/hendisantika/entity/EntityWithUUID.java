package com.hendisantika.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.Convert;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql-flyway-jsob
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/11/21
 * Time: 18.01
 */
@MappedSuperclass

@Convert(attributeName = "jsonb", converter = JsonBinaryType.class)
public class EntityWithUUID {
    @Id
    @Convert(attributeName = "pg-uuid")
    private UUID id;

    public EntityWithUUID() {
        this.id = UUID.randomUUID();
    }
}
