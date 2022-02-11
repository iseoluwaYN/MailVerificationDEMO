package com.example.registrationDemo.mail;

import com.sun.istack.NotNull;

public interface EmailService {
    MailResponse send(@NotNull Message message);
}
