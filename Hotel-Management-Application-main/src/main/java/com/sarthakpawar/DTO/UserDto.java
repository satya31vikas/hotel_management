package com.sarthakpawar.DTO;

import com.sarthakpawar.ENUMS.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String email;

    private String name;

    private UserRole userRole;

    public UserDto(Long id, String email, String name, UserRole userRole) {
    	this.id=id;
    	this.email=email;
    	this.name=name;
    	this.userRole=userRole;
    }
}
