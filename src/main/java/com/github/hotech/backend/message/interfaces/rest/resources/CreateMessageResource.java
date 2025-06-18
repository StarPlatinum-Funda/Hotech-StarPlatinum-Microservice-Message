package com.github.hotech.backend.message.interfaces.rest.resources;

public record CreateMessageResource(
        Long id,
        String receptor,
        String sender,
        String content,
        Long notificationId,
        Long userAccountId
) {
}
