package com.slackbot.slackbot.Query;

public class CreateTeamQuery {

    private String teamName;
    private String adminId;

    public String getTeamName() { return teamName;  }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getAdminId() { return adminId; }
    public void setAdminId(String adminId) { this.adminId = adminId; }
}
