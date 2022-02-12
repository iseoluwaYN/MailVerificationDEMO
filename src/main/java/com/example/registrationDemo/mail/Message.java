package com.example.registrationDemo.mail;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Message {
    private String subject;
    private String to;
    private String body;
    private String from;
}
