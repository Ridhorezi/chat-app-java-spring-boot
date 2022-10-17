package com.ridho.chat.chatapps.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatNotification implements Serializable {
    private String id;
    private String senderId;
    private String senderName;
}
