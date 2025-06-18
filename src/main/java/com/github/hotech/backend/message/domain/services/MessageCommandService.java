package com.github.hotech.backend.message.domain.services;

import com.github.hotech.backend.message.domain.model.aggregates.Message;
import com.github.hotech.backend.message.domain.model.commands.CreateMessageCommand;
import com.github.hotech.backend.message.domain.model.commands.MarkMessageAsReadCommand;

import java.util.Optional;

public interface MessageCommandService {
    Optional<Message> handle(CreateMessageCommand command);
    void handle(MarkMessageAsReadCommand command);
}
