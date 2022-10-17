package com.ridho.chat.chatapps.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Pengguna implements Serializable {
    @Id
    private String id;
    private String username;
    private String password;
    private String fullName;
}
