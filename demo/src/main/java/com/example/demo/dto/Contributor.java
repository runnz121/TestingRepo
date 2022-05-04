package com.example.demo.dto;

import lombok.Data;

//이 부분은 FEIGNClient에서 받아오는 RESPONSE 값과 동일해야 함
@Data
public class Contributor {
    private String login;
    private String id;
    private String avatar_url;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private String site_admin;
    private int contributions;
}
