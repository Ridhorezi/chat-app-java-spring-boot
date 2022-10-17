package com.ridho.chat.chatapps.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class ChatRoom implements Serializable {
    @Id
    private String id;
    private String chatId;
    private String senderId;
    private String recipientId;
}
