package com.websecurity.store.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpRequestNoLogin {
    private String username;
    private String password;

    private List<String> roles = Collections.singletonList("ROLE_USER");
}
