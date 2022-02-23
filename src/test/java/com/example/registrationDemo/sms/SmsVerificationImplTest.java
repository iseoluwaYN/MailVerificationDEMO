package com.example.registrationDemo.sms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SmsVerificationImplTest {

    @Autowired
    SmsVerificationImpl smsVerification;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSmsOtp(){
        SmsOtp sms = new SmsOtp();
        sms.setTo("+2348183305446"); sms.setFrom("+19034033068");
        sms.setBody(
        "Iseoluwa sends her love to you <3! This was sent via code");
        String sample = smsVerification.sample(sms);
        System.out.println(sample);
    }
}