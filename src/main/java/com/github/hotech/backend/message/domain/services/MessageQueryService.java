package com.github.hotech.backend.message.domain.services;

import com.github.hotech.backend.message.domain.model.aggregates.Message;
import com.github.hotech.backend.message.domain.model.queries.GetMessageByIdQuery;
import com.github.hotech.backend.message.domain.model.queries.GetMessagesByNotificationIdAndUserAccountIdQuery;

import java.util.List;
import java.util.Optional;

public interface MessageQueryService {
    Optional<Message> handle(GetMessageByIdQuery query);
    List<Message> handle(GetMessagesByNotificationIdAndUserAccountIdQuery query);
}
