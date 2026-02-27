package ch.example.blog.messaging;

import java.util.UUID;

public record ValidationRequest(UUID requestId, UUID entityId, String text, String type) {
    // type z.B. "BLOG_POST" oder "COMMENT" oder frei ("TEXT")
}