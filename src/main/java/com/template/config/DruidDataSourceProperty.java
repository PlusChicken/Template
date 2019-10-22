//配置数据源
package com.template.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidDataSourceProperty {

    private String url ;
    private String username;
    private String password;
    private String driverClassName;

    private int initialSize = 0;
    private int minIdle;
    private int maxActive = 8;
    //配置获取连接等待超时的时间
    private int maxWait;
    //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
    private int timeBetweenEvictionRunsMillis = 1000*60;
    //配置一个连接在池中最小生存的时间，单位是毫秒
    private int minEvictableTimeMillis = 1000*60*30;
    private String validationQuery;
    private boolean testWhileIdle = false;
    private boolean testOnBorrow = true;
    private boolean testOnReturn = false;
    //打开PSCache,并且指定每个连接上PSCache的大小
    private boolean PoolPreparedStatements = false;
    private int maxPoolPreparedStatementPerConnectionSize = -1;
    //配置监控统计拦截的filters，去掉后监控界面sql无法统计，'wall'用于防火墙
    private String filters;
    //合并多个DruidDataSource的监控数据
    private boolean useGlobalDataSourceStat = false;
    //通过connectProperties属性来打开mergeSql功能;慢SQL记录
    private String connectionProperties;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public int getMinEvictableTimeMillis() {
        return minEvictableTimeMillis;
    }

    public void setMinEvictableTimeMillis(int minEvictableTimeMillis) {
        this.minEvictableTimeMillis = minEvictableTimeMillis;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isPoolPreparedStatements() {
        return PoolPreparedStatements;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        PoolPreparedStatements = poolPreparedStatements;
    }

    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public boolean isUseGlobalDataSourceStat() {
        return useGlobalDataSourceStat;
    }

    public void setUseGlobalDataSourceStat(boolean useGlobalDataSourceStat) {
        this.useGlobalDataSourceStat = useGlobalDataSourceStat;
    }

    public String getConnectionProperties() {
        return connectionProperties;
    }

    public void setConnectionProperties( String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }
}
