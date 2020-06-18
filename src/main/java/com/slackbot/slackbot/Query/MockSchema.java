package com.slackbot.slackbot.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockSchema {

    private static final Logger logger = LoggerFactory.getLogger(MockSchema.class);

    private String teamKey;
    private String method;
    private String schema;
    private String path;
    private String queryParameters;
    private String queryParametersRegex;

    public String getPath(){ return path; }

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

    public String getTeamKey(){ return teamKey; }

    public MockSchema setTeamKey(String teamKey){
        this.teamKey=teamKey;
        return this;
    }

    public MockSchema setPath(String path) {
        this.path=path;
        return this;
    }

    public MockSchema setMethod(String method) {
        this.method = method;
        return this;
    }

    public MockSchema setSchema(String schema) {
        this.schema = schema;
        return this;
    }

    public MockSchema setQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    public MockSchema setQueryParametersRegex(String queryParametersRegex) {
        this.queryParametersRegex = queryParametersRegex;
        return this;
    }

    public void log(){
        logger.info("Mock Schema ......");
        logger.info("teamKey: "+teamKey);
        logger.info("method: "+method);
        logger.info("schema: "+schema);
        logger.info("path: "+path);
        logger.info("queryParameters: "+queryParameters);
        logger.info("queryParametersRegex: "+queryParametersRegex);
    }
}
