package com.ridho.chat.chatapps.entities;

import com.ridho.chat.chatapps.models.MessageStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
public class ChatMessage implements Serializable {
    @Id
    private String id;
    private String chatId;
    private String recipientId;
    private String recipientName;
    private String senderId;
    private String senderName;
    private String content;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private MessageStatus status;
}
