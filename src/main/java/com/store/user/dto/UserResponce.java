package com.store.user.dto;

import com.store.user.models.UserRole;
import lombok.Data;

@Data
public class UserResponce {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private UserRole role;
    private AddressDto address;
}
