package com.company.vacation.service;

import org.camunda.bpm.engine.identity.User;

public interface EmailService {
    //aaaa
    void sendTaskAssignment(User user, String taskId, String taskName);

    void sendConfirmation();
}
