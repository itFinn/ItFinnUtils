package com.itfinn.utils.base;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 封装SnowflakeIdWorker id 封装
 */
@Component
public class IdUtil {

    private static Logger logger = LoggerFactory.getLogger(IdUtil.class);


    private static SnowflakeIdWorker _instance;

    public static SnowflakeIdWorker getInstance() {
        if (_instance == null) {
            _instance = new SnowflakeIdWorker(1, 1);
        }
        return _instance;
    }

    /**
     * 获取id
     *
     * @return
     */
    public Long getId() {
        Long id = null;
        try {
            id = getInstance().nextId();
        } catch (Exception e) {
            logger.error("生成Id发生异常", e);
        }
        return id;
    }

    /**
     * 大写, 有横杆的UUID
     *
     * @return
     */
    public static String getUUID() {
        return StringUtils.upperCase(UUID.randomUUID().toString());
    }

}
