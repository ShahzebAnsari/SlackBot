package com.slackbot.slackbot.Query.MockSchema;

public class MockSchema {

    private String teamKey;
    private String method;
    private String path;
    private String schema;
    private String queryParameters;
    private String queryParametersRegex;

    public String getTeamKey(){ return teamKey; }
    public String getMethod() {
        return method;
    }
    public String getSchema() {
        return schema;
    }
    public String getQueryParameters() {
        return queryParameters;
    }
    public String getQueryParametersRegex() {
        return queryParametersRegex;
    }
    public String getPath() {
        return path;
    }


    public MockSchema fromTeam(String teamKey){
        this.teamKey=teamKey;
        return this;
    }

    public MockSchema hasMethod(String method) {
        this.method = method;
        return this;
    }

    public MockSchema hasPath(String path){
        this.path=path;
        return this;
    }

    public MockSchema hasQueryParameters(String queryParameters) {
        this.queryParameters=queryParameters;
        return this;
    }

    public MockSchema hasQueryParametersRegex(String queryParametersRegex){
        this.queryParametersRegex=queryParametersRegex;
        return this;
    }

    public MockSchema hasSchema(String schema) {
        this.schema= schema;
        return this;
    }

}