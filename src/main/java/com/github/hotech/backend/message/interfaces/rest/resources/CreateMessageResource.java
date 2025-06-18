package com.github.hotech.backend.message.interfaces.rest.resources;

public record CreateMessageResource(
        String content,
        Long notificationId,
        Long userAccountId
) {
}
