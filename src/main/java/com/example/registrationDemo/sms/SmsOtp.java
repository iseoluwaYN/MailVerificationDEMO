package com.example.registrationDemo.sms;

import lombok.Data;

@Data
public class SmsOtp {
    private String to;
    private String from;
    private String body;
}
