package com.knoldus.profilesDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentDetails {
    @Value("${app.server.name}")
    private String appServerName;
    @Value("${app.server.detail}")
    private String appServerDetail;
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String dbUser;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    public EnvironmentDetails() {

        System.out.println("");
    }

    /**
     *
     * @return
     */
    public String getAppServerName() {
        return appServerName;
    }

    /**
     *
     * @param appServerName
     */
    public void setAppServerName(String appServerName) {
        this.appServerName = appServerName;
    }

    /**
     *
     * @return
     */
    public String getAppServerDetail() {
        return appServerDetail;
    }

    /**
     *
     * @param appServerDetail
     */
    public void setAppServerDetail(String appServerDetail) {
        this.appServerDetail = appServerDetail;
    }

    /**
     *
     * @return
     */
    public String getDbUrl() {
        return dbUrl;
    }

    /**
     *
     * @param dbUrl
     */
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    /**
     *
     * @return
     */
    public String getDbUser() {
        return dbUser;
    }

    /**
     *
     * @param dbUser
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     *
     * @return
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     *
     * @param dbPassword
     */
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "EnvironmentDetails{" +
                "appServerName = " + appServerName + "\n," +
                "appServerDetail = " + appServerDetail + "\n," +
                "dbUrl = " + dbUrl + "\n," +
                "dbUser = " + dbUser + "\n," +
                "dbPassword = " + dbPassword + "\n," +
                '}';
    }
}
