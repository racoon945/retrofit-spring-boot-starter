package com.github.lianjiatech.retrofit.plus.boot;


import com.github.lianjiatech.retrofit.plus.config.Config;
import com.github.lianjiatech.retrofit.plus.config.PoolConfig;
import com.github.lianjiatech.retrofit.plus.core.BodyCallAdapterFactory;
import com.github.lianjiatech.retrofit.plus.core.ResponseCallAdapterFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * 这个类存在的主要目的是方便 IDE 自动提示开头的配置
 *
 * @author 陈添明
 */
@ConfigurationProperties(prefix = Config.PREFIX)
public class RetrofitProperties {

    /**
     * 连接池配置
     */
    private Map<String, PoolConfig> pool;

    /**
     * 启用 #{@link BodyCallAdapterFactory} 调用适配器
     */
    private boolean enableBodyCallAdapter = true;

    /**
     * 启用 #{@link ResponseCallAdapterFactory} 调用适配器
     */
    private boolean enableResponseCallAdapter = true;

    /**
     * 启用日志打印
     */
    private boolean enableLog = true;

    /**
     * 禁用Void返回类型
     */
    private boolean disableVoidReturnType = false;

    public Map<String, PoolConfig> getPool() {
        return pool;
    }

    public void setPool(Map<String, PoolConfig> pool) {
        this.pool = pool;
    }

    public boolean isEnableBodyCallAdapter() {
        return enableBodyCallAdapter;
    }

    public void setEnableBodyCallAdapter(boolean enableBodyCallAdapter) {
        this.enableBodyCallAdapter = enableBodyCallAdapter;
    }

    public boolean isEnableResponseCallAdapter() {
        return enableResponseCallAdapter;
    }

    public void setEnableResponseCallAdapter(boolean enableResponseCallAdapter) {
        this.enableResponseCallAdapter = enableResponseCallAdapter;
    }

    public boolean isEnableLog() {
        return enableLog;
    }

    public void setEnableLog(boolean enableLog) {
        this.enableLog = enableLog;
    }

    public boolean isDisableVoidReturnType() {
        return disableVoidReturnType;
    }

    public void setDisableVoidReturnType(boolean disableVoidReturnType) {
        this.disableVoidReturnType = disableVoidReturnType;
    }
}