package com.github.hotech.backend.message.domain.services;

import com.github.hotech.backend.message.domain.model.aggregates.Message;
import com.github.hotech.backend.message.domain.model.commands.CreateMessageCommand;
import com.github.hotech.backend.message.domain.model.commands.DeleteMessageCommand;
import com.github.hotech.backend.message.domain.model.commands.MarkMessageAsReadCommand;
import com.github.hotech.backend.message.domain.model.commands.UpdateMessageCommand;

import java.util.Optional;

public interface MessageCommandService {
    Optional<Message> handle(CreateMessageCommand command);
    Optional<Message> handle(UpdateMessageCommand command);
    Optional<Message> handle(DeleteMessageCommand command);
    void handle(MarkMessageAsReadCommand command);
}
