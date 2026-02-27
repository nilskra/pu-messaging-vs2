package ch.example.blog.messaging;

import java.util.UUID;

public record ValidationResult(UUID requestId, UUID entityId, boolean approved, String reason) {}