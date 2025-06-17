package com.github.hotech.backend.message.domain.model.valueobjects;

public record ProfileIdentifier(long profileId) {

    public ProfileIdentifier {
        if (profileId <= 0) {
            throw new IllegalArgumentException("Profile ID must be greater than 0");

        }
    }

    public ProfileIdentifier() {
        this(0L);
    }
}
