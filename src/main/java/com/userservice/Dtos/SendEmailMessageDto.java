package com.userservice.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailMessageDto {
    String to;
    String from;
    String body;
    String message;
}
