package com.token.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取项目相关配置
 *
 * @author token
 */
@Data
@Component
@ConfigurationProperties(prefix = "token")
public class TokenConfig {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 版本
     */
    private String version;

    /**
     * 上传路径
     */
    private String profile;

    /**
     * 获取地址开关
     */
    private boolean addressEnabled;

    /**
     * 验证码类型
     */
    private String captchaType;

    /**
     * 获取导入上传路径
     */
    public String getImportPath() {
        return getProfile() + "/import";
    }

    /**
     * 获取头像上传路径
     */
    public String getAvatarPath() {
        return getProfile() + "/avatar";
    }

    /**
     * 获取下载路径
     */
    public String getDownloadPath() {
        return getProfile() + "/download";
    }

    /**
     * 获取上传路径
     */
    public String getUploadPath() {
        return getProfile() + "/upload";
    }
}
