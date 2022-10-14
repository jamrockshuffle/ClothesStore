package com.websecurity.store.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("Role")
public class Role {

    @Id
    private Integer id;

    private ERole name;

    public enum ERole {
        ROLE_USER,
        ROLE_ADMIN
    }
}