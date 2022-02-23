package com.example.registrationDemo.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsVerificationImpl {
    @Value("${TWILIO_ACCOUNT_SID}")
    private String ACCOUNT_SID;
    @Value("${TWILIO_AUTH_TOKEN}")
    private String AUTH_TOKEN ;


    public String sample(SmsOtp sms){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()),
                new PhoneNumber(sms.getFrom()),
                sms.getBody()).create();

        return message.getSid();
    }
}
