package com.ridho.chat.chatapps.repositories;

import com.ridho.chat.chatapps.entities.ChatMessage;
import com.ridho.chat.chatapps.models.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, String> {
    Long countBySenderIdAndRecipientIdAndStatus(String senderId, String recipientId, MessageStatus status);
    List<ChatMessage> findByChatId(String chatId);
    @Modifying
    @Query("Update ChatMessage c SET c.status = :status WHERE c.senderId = :senderId AND C.recipientId = :recipientId")
    List<ChatMessage> updateStatus(
            @Param("status") MessageStatus status,
            @Param("senderId") String senderId,
            @Param("recipientId") String recipientId
    );
}
