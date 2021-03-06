package com.nowcoder.community.entity;

import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.ToString
public class LoginTicket {
    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;
}
