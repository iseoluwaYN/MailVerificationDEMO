package com.example.registrationDemo.mail;

import lombok.Data;

@Data
public class Message {
    private String subject;
    private String to;
    private String Body;
    private String from;
}
