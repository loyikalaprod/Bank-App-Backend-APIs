package com.bank.secure.service.impl;

import com.bank.secure.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
