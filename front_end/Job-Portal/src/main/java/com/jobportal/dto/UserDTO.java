package com.jobportal.dto;

import org.hibernate.validator.constraints.Email;

import com.jobportal.entity.User;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;

    @NotBlank(message = "name is empty or null")
    private String name;
    @SuppressWarnings("deprecation")
    @NotBlank(message = "email is empty or null")
    @Email(message = "invalid email")
    private String email;
    @NotBlank(message = "password is empty or null")
    private String password;
    private AccountType accountType;
    private Long profileId;

    public User toEntity() {
        return new User(this.id, this.name, this.email, this.password, this.accountType, this.profileId);
    }

}
