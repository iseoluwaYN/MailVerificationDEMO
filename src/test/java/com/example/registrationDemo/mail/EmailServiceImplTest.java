package com.example.registrationDemo.mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceImplTest {

    @SpringBootTest
    class MailGunEmailServiceImplTest {

        @Autowired
        @Qualifier("mailgun")
        EmailService emailService;

        @BeforeEach
        void setUp() {
        }

        @Test
        void sendEmailWithMailGunTest(){
            //create message
            Message mail = Message.builder()
                    .from("iseoluwafasoyin@gmail.com")
                    .to("ise@mailpoof.com")
                    .subject("Test email")
                    .body("This is the test body").build();

            //call send method
            MailResponse response = emailService.send(mail);

            //verify the mail response
            assertTrue(response.isSuccessful());
        }
    }

}